//forEach Loop (New in Java 1.5 and latest version)
public class $9_ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};  //Initializing an array 
        for(int x:arr){
            System.out.println("Integer: "+x);
        } 
        System.out.println("Statement after forEach statement");


        //Using the same logic but with "for" loop
        /*
        int len = arr.length;
        for(int i=0; i<len; i++){
            System.out.println("Integer"+arr[i]);
        }
        System.out.println("Statement after for statement");
        */
    }
}
