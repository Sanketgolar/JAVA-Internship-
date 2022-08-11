class Mythread implements Runnable{

    @Override
    public void run() {
        System.out.println(toString()+"  Hello All!");
    }
}


class Main{

    public static void main(String[] args){

        Runnable t1=new Mythread();
        Runnable t2=new Mythread();
        Runnable t3=new Mythread();
        Runnable t4=new Mythread();
        Runnable t5=new Mythread();
        t1.run();
        t2.run();
        t3.run();
        t4.run();
        t5.run();

    }

}
