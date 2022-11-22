package com.github.haohuiw.Builder.builder.impl;

import com.github.haohuiw.Builder.builder.Builder;

public class TextBuilder implements Builder {

    private final StringBuffer buffer=new StringBuffer();
    @Override
    public Builder makeTitle(String title) {
        buffer.append("================\n").append("[").append(title).append("]").append("\n");
        return this;
    }

    @Override
    public Builder makeString(String string) {
        buffer.append("■").append(string).append('\n').append('\n');
        return this;
    }

    @Override
    public Builder makeItems(String[] items) {
        for (String item : items) {
            buffer.append("▪").append(item).append('\n');
        }
        buffer.append("\n");
        return this;
    }

    @Override
    public String build() {
        return buffer.append("================\n").toString();
    }
}
