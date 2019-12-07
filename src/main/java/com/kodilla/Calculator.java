package com.kodilla;

public class Calculator {
    public int add (int a, int b) {
        return a + b;
    }
    public int subtract (int a, int b) {
        return a - b;
    }
}

class Application {
    public static void main (String[]args){

        Calculator calc = new Calculator();

        System.out.println(calc.add(2,2));
        System.out.println(calc.subtract(8,2));
    }
}

