package com.github.haohuiw.Builder.builder;

/**
 * @author Haohui
 * Created on 2022/4/8 14:55
 */
public interface Builder {
    Builder makeTitle(String title);

    Builder makeString(String string);

    Builder makeItems(String[] items);

    String build();

}
