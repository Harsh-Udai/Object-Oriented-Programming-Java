
public class Java_try_catch {
    public static void main(String[] args){
        try{
            int a=12;
            float g=a;
            System.out.println("This is not the proper assignment we cant assign int to float, now the exception is catched");

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}