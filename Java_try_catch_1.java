/*Try catch with multiple catch block  */
public class Java_try_catch_1 {
    public static void main(String[] args){
        try{
            int A[]=new int[5];
            A[5]=30;
            int check=30/0; /*Arithmetic error */
            
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Error are Catched!!! :) Happy");
    }

}