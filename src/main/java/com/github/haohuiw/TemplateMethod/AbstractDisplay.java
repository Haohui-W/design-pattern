package com.github.haohuiw.TemplateMethod;

public abstract class AbstractDisplay {
    /**
     * 模板方法，定义了任务的处理逻辑，也就是个模板。
     * 但是具体的操作，由子类决定
     */
    public final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

    public abstract void open();
    public abstract void print();
    public abstract void close();
}
