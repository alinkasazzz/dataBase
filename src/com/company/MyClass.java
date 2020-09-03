package com.company;

public class MyClass {
    String string;
    public MyClass(String string){
        this.string = string;
    }
    public void print(){
        System.out.println(string);
    }
    public void compare(int a){
        String b = String.valueOf(a);
        System.out.println(string.equals(b));
    }
}
