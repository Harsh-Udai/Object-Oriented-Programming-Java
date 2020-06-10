/*Multithreading by implementing the Runnable Interface */

public class Multithreading_Part2  implements Runnable{

    public void run(){
        System.out.println("Run method is called after start is called");
    }
    public static void main(String[] args){
        Multithreading_Part2 MP2=new Multithreading_Part2();
        Thread t1=new Thread(MP2);
        t1.start();
    }
}