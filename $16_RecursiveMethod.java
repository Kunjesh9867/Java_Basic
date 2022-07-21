// Recursive is the technique of function calling itself. It is used to break down the complexity in logic.
public class $16_RecursiveMethod {
    /* Used Sleep 
    public static void p() throws InterruptedException{
        System.out.println("Hello World");
        Thread.sleep(5000);
        p();
    }
    public static void main(String[] args) throws InterruptedException {
        p();
    }
    */


    // Basic Program
     static int count = 0;
    public static void p() {
        if (count <= 5) {
            System.out.println("Hello " + count);
            count++;
            p();
        }
    }


    //Factorial of a number
    public static int factorial(int num){
        if(num==1){
            return 1;
        }
        else{
            return (num*factorial(num-1));
        }
    }


    public static void main(String[] args) {
        p();
        System.out.println("Factorial of 5 is: "+factorial(5));
    }
}
