package com.haohui.FactoryMethod;

import com.haohui.FactoryMethod.framework.Factory;
import com.haohui.FactoryMethod.framework.Product;

public class Main {

    public static void main(String[] args) {
        Factory<IDCard> factory = new IDCardFactory();

        Product card1 = factory.create("张三");
        Product card2 = factory.create("李四");
        Product card3 = factory.create("王五");

        card1.use();
        card2.use();
        card3.use();
    }


}
