class Mythread extends Thread{

    @Override
    public void run() {
        System.out.println(getName()+"  Hello All!");
    }
}


class Main{

    public static void main(String[] args){

        Thread t1=new Mythread();
        Thread t2=new Mythread();
        Thread t3=new Mythread();
        Thread t4=new Mythread();
        Thread t5=new Mythread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}
