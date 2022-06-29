// if elseif ladder in java

public class $6_if_elseif_ladder {
    public static void main(String[] args) {
        int marks = 43; //two loops are correct but only executed the first one
        if(marks<40)
            System.out.println("failed");
        else if(marks<50)
            System.out.println("Third Class");
        else if(marks<45) //here is the CHANGE
            System.out.println("Second Class");
        else if(marks<70)
            System.out.println("First Class");
        else
            System.out.println("Distinction");
    }
}
