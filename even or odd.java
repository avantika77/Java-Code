//JAVA PROGRAM TO CHECK IF INTERGER IS ODD/EVEN
//A number that is divisible by 2 and generates a remainder of 0 is called an even number.
//various ways:from the brute force approach ending up at the most optimal approach.
// //
// Using Brute Force- Naive Approach
// Using bitwise operators
//     Using Bitwise OR
//     Using Bitwise AND
//     Using Bitwise XOR
// By Checking the Least Significant Bit

//using brute force approach
import java.io.*;
import java.util.scanner;
class check{
    public static void main(String[] args)
    {
        int num=19;
     if (num%2==0)
     {
        System.out.println("The number is even");
     }
     else{
        System.out.println("The number is odd");

     }
    }
}
----------------------------------------------------------------------------------
    The number is odd
//time complexity :0(1)
//space complexity :0(1)
====================================================================================
/Using Bitwise OR

// Bitwise OR operation of the even number by 1 increment the value of the number by 1 otherwise it remains unchanged.
//12 
// 1100 =12
// 0001=1
// -----------
// 1101=13 
// 12 is the even number
// or gate => 0 0    0    rest is 1
import java.util.*;
 class Checking {
    public static void main(String[] args)
    {
        int n = 3;
        if ((n | 1) > n) {
             System.out.println("Number is Even");
        }
        else {
             System.out.println("Number is Odd");
        }
    }
}
========================================================================================
Number is Odd
🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸
 Using Bitwise AND
// Bitwise AND operation of the odd number by 1 will be 1 because the last bit will be already set otherwise it will give 0. 
//  5= 0101 
//     0001
//     ----
//     0001
    // and =>  1  1   1  rest is zero
    import java.util.*;
    class Checking {
       public static void main(String[] args)
       {
           int n = 23;
           if ((n & 1)==1) {
                System.out.println("Number is odd");
           }
           else {
                System.out.println("Number is even");
           }
       }
   }    
============================================================================================
Using Bitwise XOR
Bitwise XOR operation of the even number by 1 increment the value of the number by 1 otherwise it decrements the value of the number by 1 if the value is odd.
It is the most optimal approach.
8=1000
1=0001
--------
  1001 =>9   1 incremented so number is even
23 = 010111
1  = 000001
--------------
     010110 => 22 i is decremented so is odd
import java.util.*;
    class Checking {
       public static void main(String[] args)
       {
           int n = 23;
           if ((n ^ 1)==n+1) {
                System.out.println("Number is even");
           }
           else {
                System.out.println("Number is odd");
           }
       }
   }   
==============================================================================================================================================================
3.Checking the LSB of the Number
The LSB(Least Significant Bit) of an even number is always 0 and that of an odd number is always 1.

import java.util.*;

class Check {
    public static String test(int n) {
        if (n != 0) {
            if (Integer.toBinaryString(n).endsWith("0")) {
                return "even";
            } else {
                return "odd";
            }
        } else {
            return "zero";
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {
            System.out.println(i + "-" + test(i));
        }
    }
}
============================================================
0-zero
1-odd
2-even
3-odd
4-even
5-odd
6-even
7-odd
8-even
