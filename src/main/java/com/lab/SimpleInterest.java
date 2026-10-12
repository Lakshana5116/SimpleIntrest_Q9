package com.lab;

public class SimpleInterest {

    public double calculate(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        SimpleInterest obj = new SimpleInterest();

        System.out.println(
            "Simple Interest = " + obj.calculate(1000, 5, 2)
        );
    }
}