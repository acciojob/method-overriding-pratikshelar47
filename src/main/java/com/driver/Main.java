package com.driver;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        String ans = b.meth();
        System.out.println(ans);
    }
}
class A{
    public String meth(){
        return "Hi. from class A";
    }
}
class B extends A{

}