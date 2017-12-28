package com.example.nasa.exceldata;

public class ClassAdapter
{
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    String className;

    public ClassAdapter(String content){
        this.className=content;
    }
}
