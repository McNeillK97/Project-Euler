/*  
*   Name: Kyle McNeill
*   This is my solution to problem 1 in Project Euler
*   Github: https://github.com/McNeillK97/Project-Euler
*   Prompt: https://projecteuler.net/problem=2
*/

public class problem2 {
    public static void main(String args[]) 
    { 
        //For variables I am tracking the sum, the last and 2nd last number in the sequence, as well as a temporary value to be used while swapping values
        int sum = 0;
        int num1 = 1;
        int num2 = 2;
        int temp = 0;

        while(num2 < 4000000){
            if(num2 % 2 == 0){
                sum += num2;
            }
            //What I am doing here is advancing the sequence one number by adding the last 2 numbers to make the new last one, and replacing the 2nd to last one with the previous last
            temp = num2;
            num2 += num1;
            num1 = temp;
        }   

        System.out.println(sum);
    }
}