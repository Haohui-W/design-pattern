package com.haohui.Builder;

import com.haohui.Builder.builder.impl.TextBuilder;

/**
 * @author Haohui
 * Created on 2022/4/8 14:55
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Director(new TextBuilder()).construct());
    }
}
