package com.spiersad;

/**
 * Created with IntelliJ IDEA.
 * User: spiers
 * Date: 5/29/13
 * Time: 5:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class InfixToPostfix {
    public static void main (String[] args){
        String string = new String("(4+4)*4+4*+5/6/(9+3(4+4))*(4+3*4)");
        InfixToPostfixConverter converter = new InfixToPostfixConverter();
        string = converter.convert(string);
        System.out.println(string);
    }
}
