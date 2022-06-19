import java.util.*;

class MyThread extends Thread{
    public void run(){
        System.out.println("Creating thread using thread class");
    }
}


class HelloWorld{
    public static void main(String arg[]){
        MyThread thread = new MyThread();
        System.out.println("Name of the thread before running: " + thread.getName() + "\n");
        
        thread.setName("MyThread");
        System.out.println("Name of the thread after running: " + thread.getName());
        thread.start();
    }
}
