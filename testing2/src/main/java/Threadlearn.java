class Thread2 extends Thread {
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Task :1 " + i);
        }
    }
}

class Thread1 extends Thread {
    public void run(){
        for(int j=10; j>0; j--){
            System.out.println("Task :2 " + j);
        }
    }
}

public class Threadlearn {
    public static void main(String[] args) {
        Thread2 t = new Thread2();
        Thread1 t1 = new Thread1();

        t.start();
        t1.start();
    }
}
