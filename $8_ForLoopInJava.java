// In this program, I have used FOR loop 
// A "for" loop is used when we know the number of iteration 

public class $8_ForLoopInJava {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) // As you have seen that we only have 1 statement to execute, so making a block is optional
        System.out.println(i); // semi-colon is IMP

        /* To get the same logic using while loop
        int i = 1;
        while (i <= num) {
            System.out.println(i);
            i++;
        }
         */

        /*
        Loop inside "For" loop and without curly brackets
        int num2=100;
        for(int i=1;i<=100;i++) [here you have to add indentation physically, your IDE won't recognize it as you have not used {}]
            if(i%7==0)
                System.out.println("Number "+i+" is divisible by 7");
        */        
    }
}
