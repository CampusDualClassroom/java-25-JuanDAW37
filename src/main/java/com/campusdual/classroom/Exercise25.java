package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {

    public static Stack<String> pila = new Stack<>();

    public static Stack<String> createStack() {

        pila.push("Smith");
        pila.push("Montessori");
        pila.push("Peralta");
        pila.push("House");

        for (int i = pila.size(); i > 0; i--) {
            System.out.println(pila.get(i-1));
        }

        return pila;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        pila = createStack();
        printAndEmptyStack(pila);
    }
}
