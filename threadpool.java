import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Mythread extends Thread{

    @Override
    public void run() {
        System.out.println(getName()+" says Hello All!");
    }
}


class Main{

    public static void main(String[] args){

        Thread t1=new Mythread();
        Thread t2=new Mythread();
        Thread t3=new Mythread();
        Thread t4=new Mythread();
        Thread t5=new Mythread();
        ExecutorService exs= Executors.newFixedThreadPool(2);
        exs.execute(t1);
        exs.execute(t2);
        exs.execute(t3);
        exs.execute(t4);
        exs.execute(t5);
        exs.shutdown();

    }

}
