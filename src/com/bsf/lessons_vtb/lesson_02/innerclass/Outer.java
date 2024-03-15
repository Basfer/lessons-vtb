package com.bsf.lessons_vtb.lesson_02.innerclass;

public class Outer {
    class Inner {
        private int innerVar;

        public Inner(int innerVar) {
            this.innerVar = innerVar;
        }
        void innerTest() {
            System.out.println("innerVar = " + innerVar);
            System.out.println("outerVar = " + outerVar);
        }
    }

    private int outerVar;

    public Outer(int outerVar) {
        this.outerVar = outerVar;
    }

    void outerTest() {
        System.out.println("outerVar = " + outerVar);
        Inner io = new Inner(20);
        System.out.println("io.innerVar = " + io.innerVar);
    }
}

