package org.structural_patterns_task2;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("1111", "110111"));
        System.out.println(bins.mult("1111", "1010"));
    }
}