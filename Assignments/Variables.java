package Assignments;
//Zubear Nassimi
//PROG10082 Class 1209_24071
//instructor - Satyendra Narayan
//September 21,2020
//Assignment 01B
//VariablesAssignment.java
/*This program displays primitive variables of each type*/

public class Variables {

    /**@author Zubear Nassimi
     * @version 1.0
     * @param args assign acceptable primitive variables values to letters
     * @since 2020-09-21*/

    public static void main(String[] args){

        byte b=127;         //-128 to 127 or -2^7 to 2^7-1
        short s=32767;      //-32,768 to 32,767 or -2^15 to 2^15-1
        int i=2147483647;   //-2^31 to 2^31-1
        long l=0;           // -2^63 to 2^63-1
        float f=1;          //-3.4E38 to 3.4E38
        double d=1.7E308;   //-1.7E308 to 1.7E308
        char c=65535;       // 0 to 65535
        boolean z=true;     // true or false

        System.out.println("b=" +b);
        System.out.println("s=" +s);
        System.out.println("i=" +i);
        System.out.println("l=" +l);
        System.out.println("f=" +f);
        System.out.println("d=" +d);
        System.out.println("c=" +c);
        System.out.println("z=" +z);
    }

}
