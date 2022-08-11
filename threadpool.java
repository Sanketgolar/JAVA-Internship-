import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Mythread implements Runnable{
    public int num;
    Mythread(int num){
        this.num=num;
    }
    @Override
    public void run() {
        System.out.println(num);
        try{Thread.sleep(3000);}
        catch (InterruptedException e){}
    }
}

/*Integers 6 to 10 takes times to execute as thread pool limit is 5.
only 5 threads are handled by threadpool simultaneously 
other tasks are under waiting.*/
class Main{

    public static void main(String[] args){

        ExecutorService exs= Executors.newFixedThreadPool(5);
        for (int i=1;i<11;i++){
           Runnable t=new Mythread(i);
           exs.execute(t);
        }

        exs.shutdown();

    }

}
