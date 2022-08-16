import java.util.*;

class Main
{


    public static void main(String[] args)
    {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(45);
        hs.add(56);
        hs.add(4);
        hs.add(95);
        hs.add(0);
        hs.add(9);
        hs.add(1);
        System.out.println(hs.toString());
        //insertion order depends on hashcode
    }
}
