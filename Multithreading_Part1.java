/*Multithreading by extending the Thread Class */

public class Multithreading_Part1 extends Thread{
    public void run(){
        System.out.println("After the start, Run method is called in Multithreading!!");
    }
    public static void main(String[] args){
        Multithreading_Part1 MP1=new Multithreading_Part1();
        MP1.start();
    }
}