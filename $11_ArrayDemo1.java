public class $11_ArrayDemo1 {
    public static void main(String[] args) {
        int age[];  // Initializing an array
        //age is not the array, it is reference of group of integer elements (array)
        // But we usually calls it as an array

        age = new int[50]; // Declaration the number of size, Here rest of the space will be occupied by 0, means from 5 to 50 it will give 0 as an output
        
        // int age [] = new int[50] , here declaration(size) & initialization, both in same line 
        age[0]=20;
        age[1]=34;
        age[2]=27;
        age[3]=32;
        age[4]=29;

        for(int i=0; i<age.length;i++){   // age.length gives the length of the age array
            System.out.println(age[i]);
        }

        // To find the sum of all the ages
        int sum=0;
        for(int i=0; i<age.length;i++){  
            sum+=age[i];
        }
        System.out.println("Sum of all age: "+sum);
    }
}
