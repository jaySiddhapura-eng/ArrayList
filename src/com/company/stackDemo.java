package com.company;

import java.util.Stack;

public class stackDemo {
    public void stackMethod(){
        Stack<Integer> S = new Stack<>();

        boolean stackStatus = S.isEmpty();
        System.out.println("stack empty: " + stackStatus);

        S.push(2002);
        S.push(3003);
        S.push(4004);
        S.push(5005);
        System.out.println("stack: " + S);
        System.out.println("stack empty: " + S.empty());

        Integer i = S.pop();
        System.out.println("last pushed value: " +i);
        System.out.println("stack: " + S);

        // index started from 1 not 0
        int Index = S.search(3003);
        System.out.println("Index of 3003 is: "+ Index);

        Object peeked = S.peek();
        System.out.println("Last object without removing it: " + peeked);
        System.out.println("stack: " + S);

        S.clear();
        System.out.println("stack: " + S);

    }
}
