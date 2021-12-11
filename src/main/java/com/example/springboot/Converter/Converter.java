package com.example.springboot.Converter;

import org.json.JSONException;

public interface Converter <T,A>{
    T create(A i) throws JSONException;
}
