import java.util.*;

class Main
{


    public static void main(String[] args)
    {
        HashSet<Integer> hs=new HashSet<>();
        //successfully adds unique element 45
        System.out.println(hs.add(45));
        hs.add(56);
        //does not add 45 again
        //prints false while adding duplicate element
        System.out.println(hs.add(45));
        hs.add(95);
        hs.add(0);
        hs.add(9);
        hs.add(1);
        System.out.println(hs.toString());
        
    }
}
