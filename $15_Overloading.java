// Overloading is defined as multiple methods with same name and different parameters (return types plays no role in overloading)
public class $15_Overloading {

    public static void  Perimeter(float radius){
        // Perimeter of Circle is 2*pie*radius
        System.out.println("Perimeter of Circle is: "+2*radius*(22/7f));  // instead of float, if double is used then java take 22/7=3, make sure to use float for more precise value of pie.
    }

    public static void  Perimeter(float length, float breadth){
        // Perimeter of rectangle is Length+Breadth
        System.out.println("Perimeter of Rectangle is: "+ 2*(length+breadth));
    }

    public static void  Perimeter(float side1, float side2, float side3){
        // Perimeter of Triangle is side+side+side
        System.out.println("Perimeter of Triangle is: "+ (side1+side2+side3));
    }

    public static void main(String[] args) {
        Perimeter(10);
        Perimeter(10.3f,10);
        Perimeter(5,10,15);
    }
}
