/*
There are 3 jump statements in Java :
(1) break
(2) continue
(3) return 
*/

public class $10_JumpStatement {

    public static int sum(int a, int b){
        return a+b;
        //System.out.println("Hello"); // This statement is unreachable because we already add return before this statement 
        // Many IDE will give you an error, so comment it if you don't want an error
    }

    public static void main(String[] args) {
        
        

        // break statement
        /*
        int num=100;
        for(int i=1; i<=num; i++){
            if(i==77){
                break; //here it will break the loop and print the statement present outside the loop
            }
            System.out.println("The number is: "+i);
        }
        System.out.println("Just came out of Loop!!!");
         */

        
        
        
         // continue statement
        /*
        int num=100,i;
        for (i=1;i<=num;i++){
            if(i==77){
                continue; // here it will skip the loop when the number is 77
            }
            System.out.println("the number is: "+num);
        }
        System.out.println("Just came out of loop");
         */

        
        
        
         // In java, we also have labelled break and continue
        /*
        out: for (int i = 1; i <= 5; i++) {
            System.out.println("From outer: " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("    From inner: " + j);
                if (j == 2) {
                    // break; //break only the inside loop (containing j)
                    break out;
                }
            }
        }
        */

        /*
        out: for (int i = 1; i <= 5; i++) {
            System.out.println("From outer: " + i);
            for (int j = 1; j <= 5; j++) {
                if (j == 2) {
                    //continue; //continue only the inside loop (containing j)
                    continue out;
                }
                System.out.println("    From inner: " + j); 
            }
        }
        */



        //return statement
        int a = 7, b = 6;
        int ans = sum(a,b);
        System.out.println(ans);
    }
}
