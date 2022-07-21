// Introduction to Methods in Java (Just like Functions in Python)
import java.lang.Math;

public class $14_Methods {



    public static void isPrime(int num){
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;  // without using break statement, we can get the same output. But when we use the break then, LET'S SEE if num=48 then it is divisible by 2 and we get flag=false at first loop . So if we use break here, it will TURN OFF the loop and shift to the next line after this loop ==> MORE EFFICIENT / FAST EXECUTION
            }
        }
        if (flag == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }




    public static void isPrimeEfficient(int num){
        boolean flag = true;
        for (int i = 2; i < (int)num/2; i++) {
            if (num % i == 0) {
                flag = false;
                break;  // without using break statement, we can get the same output. But when we use the break then, LET'S SEE if num=48 then it is divisible by 2 and we get flag=false at first loop . So if we use break here, it will TURN OFF the loop and shift to the next line after this loop ==> MORE EFFICIENT / FAST EXECUTION
            }
        }
        if (flag == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }



    public static void isPrimeEfficient2(int num){
        // In this method, I applied the concept of mathematics, i.e if a number is prime then (1) find square root (2) convert into integer (for example: if sqrt is 6.555 = 6 , 7.56543 = 7, 101.2345 = 101)  (3) start from 2 till integer and if it is not divisible (from 2 to integer value) then the number is Prime, else Not Prime.

        double sqrt = Math.sqrt(num);  // Convert to sqrt using Math module
        //System.out.println(sqrt);
        int ceil = (int)sqrt;   // Convert to integer value, later used in loop 
        //System.out.println(ceil);


        boolean flag = true;
        for (int i = 2; i < ceil; i++) {
            if (num % i == 0) {
                flag = false;
                break;  // without using break statement, we can get the same output. But when we use the break then, LET'S SEE if num=48 then it is divisible by 2 and we get flag=false at first loop . So if we use break here, it will TURN OFF the loop and shift to the next line after this loop ==> MORE EFFICIENT / FAST EXECUTION as the loop will run less number of times
            }
        }
        if (flag == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }



    public static void main(String[] args) {
        isPrime(45);
        isPrimeEfficient(45);
        isPrimeEfficient2(45);
       

    }
}
