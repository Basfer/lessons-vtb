package com.bsf.lessons_vtb.lesson_02.innerclass;

public class Test {
    public static void main(String[] args) {
        Outer o = new Outer(10);
        o.outerTest();
        Outer.Inner i = o.new Inner(14);
        i.innerTest();
        o.outerTest();
    }
}
