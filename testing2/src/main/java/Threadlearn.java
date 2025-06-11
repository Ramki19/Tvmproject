public class Threadlearn extends Thread {
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Task :1 " +i);
        }
        for(int j=6; j<10; j++){
            System.out.println("Task : 2" +j);
        }

    }

    public static void main(String[] args) {
        Threadlearn t=new Threadlearn();
        t.start();
        Threadlearn t1=new Threadlearn();
        t1.start();
    }
}
