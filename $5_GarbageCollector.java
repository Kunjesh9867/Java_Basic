// Understanding a pivotal funcion of Java i.e Garbage Collector
public class $5_GarbageCollector {
    public void finalize(){ //making a finalize function
        System.out.println("Object Destroyed!!!");
    }

    public static void main(String[] args) {
        $5_GarbageCollector g1 = new $5_GarbageCollector();
        $5_GarbageCollector g2 = new $5_GarbageCollector();
        g1 = null;
        g2 = null;

        System.out.println("Starting the Process...");

        System.gc(); // initializing garbage collector

    }
}



class check_in_terminal{  //Checking if it's working or not
    public static void main(String[] args) {

        System.out.println("Its working");
    }
}
