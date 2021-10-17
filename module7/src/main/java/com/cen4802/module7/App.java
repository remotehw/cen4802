package com.cen4802.module7;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculator addingMachine = new Calculator();
		System.out.println(addingMachine.addition(5,  10));
		System.out.println(addingMachine.subtraction(13,  10));
		System.out.println(addingMachine.multiply(11,  8));
		System.out.println(addingMachine.divide(12,  2));
    }
}
