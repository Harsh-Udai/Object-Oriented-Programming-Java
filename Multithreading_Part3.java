/*Multithreading by extending the Thread Class */
public class Multithreading_Part3 extends Thread{
    public void run(){

        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Multithreading_Part3 MP3=new Multithreading_Part3();
        MP3.start();
    }
}