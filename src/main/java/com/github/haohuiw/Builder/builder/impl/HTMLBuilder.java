package com.github.haohuiw.Builder.builder.impl;

import com.github.haohuiw.Builder.builder.Builder;

import java.io.PrintWriter;

public class HTMLBuilder implements Builder {
    private String fileName;
    private PrintWriter writer;


    @Override
    public Builder makeTitle(String title) {
        

        return this;
    }

    @Override
    public Builder makeString(String string) {
        return this;
    }

    @Override
    public Builder makeItems(String[] items) {
        return this;
    }

    @Override
    public String build() {
        return null;
    }
}
