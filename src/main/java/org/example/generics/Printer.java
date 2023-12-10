package org.example.generics;

import org.example.design_patterns.Student;
class A {}
class B extends A {}
interface C {}
class Printer <T extends B & C> {

    T somethingToPrint;

    public Printer(T dataObject) {
        this.somethingToPrint = dataObject;
    }

    public void print() {
        System.out.println(somethingToPrint);
    }

//    public static void main(String[] args) {
//        Printer<D> printer = new Printer(new D());
//        printer.print();
//        Printer<D> printer1 = new Printer(new D());
//        printer1.print();
//    }
}

//class D extends A implements B, C {}

class Print <T1 extends Integer, T2 extends Integer> {
    T1 a;
    T2 b;

    public Print(T1 a, T2 b) {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.println("sum: " + (a.intValue() + b.intValue()));
    }

//    public static void main(String[] args) {
//        Print<Integer, Integer> one = new Print<>(10, 10);
//        one.print();
//    }
}
