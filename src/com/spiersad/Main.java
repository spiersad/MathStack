package com.spiersad;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: spiers
 * Date: 5/29/13
 * Time: 10:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main (String[] args) throws Exception {
        int results;
        String string = new String();
        Scanner scanner = new Scanner(System.in);
        InfixToPostfixConverter converter = new InfixToPostfixConverter();
        PostfixEvaluator evaluator = new PostfixEvaluator();

        System.out.println("Enter an infix expression using '+', '-', '*', '/', '(', ')'");
        string = scanner.nextLine();
        string = converter.convert(string);
        System.out.println("Postfix is: " + string);
        results = evaluator.evaluate(string);
        System.out.println("Result is: " + results);
    }
}
