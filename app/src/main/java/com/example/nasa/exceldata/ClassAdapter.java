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

    public String[] getSub() {
        return sub;
    }

    public void setSub(String[] sub) {
        this.sub = sub;
    }

    String[] sub;

    public ClassAdapter(String content,String[] a){
        this.className=content;
        this.sub=a;
    }
}
