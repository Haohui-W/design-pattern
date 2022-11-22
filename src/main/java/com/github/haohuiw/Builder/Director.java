package com.github.haohuiw.Builder;

import com.github.haohuiw.Builder.builder.Builder;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public String construct(){
        return builder.makeTitle("Greeting!").makeString("从早上到下午").makeItems(new String[]{
                "早上好",
                "下午好"
        }).makeString("晚上").makeItems(new String[]{
                "晚上好",
                "晚安",
                "再见"
        }).build();
    }
}
