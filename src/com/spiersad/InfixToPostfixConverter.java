package com.spiersad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Adrian Spiers
 * Date: 5/28/13
 * Time: 1:49 PM
 * infix to postfix converter
 */
public class InfixToPostfixConverter {
    private StringBuffer postFix = new StringBuffer();
    private ArrayStack<Character> arrayStack = new ArrayStack<Character>();
    private List<Character> operator = Arrays.asList('+', '-', '*', '/');
    public String convert(String inFix){
        inFix = inFix.replaceAll("\\s", "");
        char charValue;
        int i = 0;
        while(i < inFix.length()){
            charValue = inFix.charAt(i);
            if (operator.contains(charValue)){
                if (arrayStack.length() == 0){
                    arrayStack.push(charValue);
                    i++;
                }
                else{
                    while (operatorGreaterOrEqual(arrayStack.peek(), charValue)){
                        if (arrayStack.peek() == '('){
                            break;
                        }
                        postFix.append(arrayStack.pop())
                                .append(' ');
                        if (arrayStack.length() == 0){
                            break;
                        }
                    }
                    arrayStack.push(charValue);
                    i++;
                }
            }
            else if (charValue == '('){
                arrayStack.push(charValue);
                i++;
            }
            else if (charValue == ')'){
                while (arrayStack.peek() != '('){
                    postFix.append(arrayStack.pop())
                            .append(' ');
                }
                i++;
                arrayStack.pop();
            }
            else{
                postFix.append(charValue)
                        .append(' ');
                i++;
            }

        }
        while (arrayStack.length() > 0){
            postFix.append(arrayStack.pop())
                    .append(' ');
        }
        return postFix.toString().trim();
    }
    private boolean operatorGreaterOrEqual (char left, char right){
        int leftValue = 0, rightValue = 0;
        switch (left){
            case '+': leftValue = 1; break;
            case '-': leftValue = 1; break;
            case '*': leftValue = 2; break;
            case '/': leftValue = 2; break;
            case '(': leftValue = 3; break;
        }
        switch (right){
            case '+': rightValue = 1; break;
            case '-': rightValue = 1; break;
            case '*': rightValue = 2; break;
            case '/': rightValue = 2; break;
            case '(': rightValue = 3; break;
        }
        return leftValue >= rightValue;
    }
}
