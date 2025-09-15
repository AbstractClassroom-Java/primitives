package io.github.nathanjrussell;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //The 8 java primitive data types
        int myInt = 5;                      //4 bytes
        byte myByte = 10;                   //1 byte
        short myShort = 20;                 //2 bytes
        long myLong = 100L;                 //8 bytes (notice the literal has an L suffix)
        float myFloat = 5.99f;              //4 bytes (notice the literal has an f suffix)
        double myDouble = 19.99;            //8 bytes
        char myChar = 'A';                  //2 bytes (single quotes)
        boolean myBoolean = true;           //Size depends on JVM and implementation

        //The following will generate a compile error
//        int badInt = myDouble;                 //Cannot convert from double to int
//        char myChar = "A";                     //Cannot convert from String to char
//        boolean myBoolean = 1;                    //Cannot convert from int to boolean
//        int myInt = true;                     //Cannot convert from boolean to int
//        int badInt2 = 5.99;               //Cannot convert from double to int
//        int badInt3 = 100L;               //Cannot convert from long to int
//        float badFloat = 19.99;           //Cannot convert from double to float
//        long badLong = 5.99f;             //Cannot convert from float to long
//        short badShort = 1000000;            //overflow, 1000000 is too large for a short

//        if (true + 1 == 2) {System.out.println("This won't compile");}
        if (myBoolean) {System.out.println("This will compile");}
        if (myBoolean == true) {System.out.println("This will also compile");}
//        if (myInt) {System.out.println("This won't compile");}
    }
}