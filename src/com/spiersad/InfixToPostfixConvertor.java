package com.spiersad;

/**
 * Created with IntelliJ IDEA.
 * User: spiers
 * Date: 5/28/13
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class InfixToPostfixConvertor {
    private String postFix;
    private ArrayStack<Integer> arrayStack;

    public String convert(String inFix){
        inFix.replaceAll("\\s", "").trim();
        for(int i = 0; i < inFix.length(); i++){
            char charValue = inFix.charAt(i);

        }
    }
}
