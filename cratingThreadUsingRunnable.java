import java.util.*;

class MyThread implements Runnable{
    public void run(){
        System.out.println("Creating thread using thread class");
    }
}


class HelloWorld{
    public static void main(String arg[]){
        MyThread thread = new MyThread();
        Thread t = new Thread(thread);
        System.out.println("Name of the thread before running: " + t.getName() + "\n");
        
        t.setName("MyThread");
        System.out.println("Name of the thread after running: " + t.getName() + "\n");
        t.start();
    }
}
