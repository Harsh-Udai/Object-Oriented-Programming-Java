/*Multithreading--
  Setting up the priorities---
  MIN_PRIORITY = 1
  NORMAL_PRIORITY = 5
  MAX_PRIORITY = 10
*/
public class Multithreading_Part4 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[] args){
        Multithreading_Part4 MP4 = new  Multithreading_Part4();
        Multithreading_Part4 MP4_1 = new  Multithreading_Part4();
        Multithreading_Part4 MP4_2 = new  Multithreading_Part4();
        MP4.setPriority(Thread.MIN_PRIORITY);
        MP4_1.setPriority(Thread.MAX_PRIORITY);
        MP4_2.setPriority(Thread.NORM_PRIORITY);
        MP4.start();
        MP4_1.start();
        MP4_2.start();
    }
}