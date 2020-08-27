
/*  
*   Name: Kyle McNeill
*   This is my solution to problem 1 in Project Euler
*   Github: https://github.com/McNeillK97/Project-Euler
*   Prompt: https://projecteuler.net/problem=1
*/
   class problem1 
   { 
       // Your program begins with a call to main(). 
       // Prints "Hello, World" to the terminal window. 
       public static void main(String args[]) 
       { 
            int sum = 0;

            // Loops from 0 to 1000 checking if is divisible by 3 or 5, if so, adds to sum
            for(int x = 0; x < 1000; x++){
                if(x % 3 == 0 || x % 5 ==0){
                    sum += x;
                }
            }

            System.out.println(sum);
       } 
   } 
   