package com.github.haohuiw.Adapter;

import java.io.IOException;

/**
 * @author Haohui
 */
public interface FileIo {
    /**
     * 从文件读取数据
     * @param filename 要读取的文件名
     * @throws IOException 输入输出异常
     */
    void readFromFile(String filename)throws IOException;

    /**
     * 向文件写入文件
     * @param filename 要写入的文件名
     * @throws IOException 输入输出异常
     */
    void writeToFile(String filename) throws IOException;

    /**
     * 给键值对设置值
     * @param key 键
     * @param value 值
     */
    void setValue(String key,String value);

    /**
     * 通过键获取值
     * @param key 键
     * @return 值
     */
    String getValue(String key);
}
