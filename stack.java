import java.util.*;

class Main
{


    public static void main(String[] args)
    {

        Stack<Integer> st=new Stack<>();
        int removed[]=new int[2];
        int i=0;

        st.add(45);
        st.add(56);
        st.add(45);
        st.add(95);
        st.add(0);
        st.add(1);


        System.out.println(st.toString());

        removed[i++]=st.pop();
        removed[i++]=st.pop();

        System.out.println(st.toString());
        System.out.println("Removed elements:");
        System.out.println(removed[0]+" "+removed[1]);

    }
}
