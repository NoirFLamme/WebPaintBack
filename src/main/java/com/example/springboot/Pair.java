package com.example.springboot;

import com.example.springboot.shapes.Shape;

public class Pair {

    public String frist;
    public Shape second;



    public Pair()
    {
        this.frist = null;
        this.second = null;
    }

    public Pair (String a, Shape b)
    {
        this.frist = a;
        this.second = b;
    }

}
