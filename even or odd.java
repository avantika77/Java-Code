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
//time complexity :0(1)
//space complexity :0(1)