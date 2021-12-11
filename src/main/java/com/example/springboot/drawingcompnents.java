package com.example.springboot;
import com.example.springboot.Converter.JSONToShapeArray;

import com.example.springboot.shapes.Shape;
import com.example.springboot.shapes.ShapesArray;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;



@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("/shape")

public class drawingcompnents{


	ShapesArray ShapesA = new ShapesArray();


	Stack<Pair> undo = new Stack<Pair>();
	Stack<Pair> redo = new Stack<Pair>();
	ShapeFactory factory = new ShapeFactory();
	FileBuilder builder ;
	JSONArray ShapesJson = new JSONArray();



	@GetMapping("/create")
	void createShape(Shape sentobj) throws JsonProcessingException, JSONException, ParseException {
		System.out.println(sentobj.getRadius());
		ShapesA.AddShape(factory.create(sentobj));

		Pair a = new Pair("create", factory.create(sentobj));
		undo.push(a);

	}

	@GetMapping("/edit")
	void edit(Shape sentobj, String sentJ) throws JSONException {

		switch (sentJ)
		{
			case "copy":
				ShapesA.AddShape( sentobj);
				break;
			case "remove":
				ShapesA.removeShape( sentobj.getId());
				break;
			case "edit":

				Shape temp = ShapesA.GetShape( sentobj.getId());
				Pair a = new Pair("edit", temp);
				undo.push(a);
				ShapesA.EditShape(sentobj);
				break;
		}
	}

	@GetMapping("/undo")
	JSONObject undo() throws JSONException {
		try {
			Pair temp = undo.pop();
			switch (temp.frist) {
				case "create":
					redo.push(temp);
					ShapesA.removeShape(temp.second.getId());
					break;
				case "edit":
					Shape temp1 = ShapesA.GetShape(temp.second.getId());
					redo.push(new Pair("edit", temp1));
					ShapesA.EditShape(temp.second);
					break;
			}
		}catch (EmptyStackException e)
		{
			System.out.println("Error");
			return null;
		}
		System.out.println();
		return new FileBuilder().jsonBuilder(ShapesA.shapes);

	}

	@GetMapping("/redo")
	JSONObject redo() throws JSONException {
		try {
			Pair temp = redo.pop();
			switch (temp.frist) {
				case "create":
					undo.push(temp);
					ShapesA.AddShape(temp.second);
					break;
				case "edit":
					Shape temp1 = ShapesA.GetShape(temp.second.getId());
					undo.push(new Pair("edit", temp1));
					ShapesA.EditShape(temp.second);
					break;
			}
		}catch (EmptyStackException e)
			{
				System.out.println("Error");
				return null;
			}
		return new FileBuilder().jsonBuilder(ShapesA.shapes);
	}

	@GetMapping("/save")
	JSONObject save( ) throws JSONException {
		FileBuilder builder = new FileBuilder();

		JSONObject saveJ = builder.jsonBuilder(ShapesA.shapes);

		String saveJS = JSONObject.valueToString(saveJ);
		String saveX = builder.xmlBuilder(ShapesA.shapes);

		JSONObject formats = new JSONObject();
		formats.put("json", saveJS);
		formats.put("xml", saveX);
		return formats;

	}

		@GetMapping("/load")
		ArrayList<Shape> load(String load) {

			JSONObject temp = new JSONObject(load);
			JSONToShapeArray mapper = new JSONToShapeArray();
			ShapesA.shapes = mapper.create(temp);
			return ShapesA.shapes;
		}

	}



