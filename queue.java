import java.util.*;

class Main
{


    public static void main(String[] args)
    {

        Queue<Integer> q=new LinkedList<>();
        int removed[]=new int[2];
        int i=0;

        q.add(45);
        q.add(56);
        q.add(45);
        q.add(95);
        q.add(0);
        q.add(1);


        System.out.println(q.toString());

        removed[i++]=q.poll();
        removed[i++]=q.poll();

        System.out.println(q.toString());
        System.out.println("Removed elements:");
        System.out.println(removed[0]+" "+removed[1]);

    }
}
