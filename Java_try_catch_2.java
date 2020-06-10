/*Try catch with finally block important concept! */
public class Java_try_catch_2 {
    public static void main(String[] args){
        try{
            int a=25/5;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally Block is Always called whether exception is catched or not!!");
        }
        System.out.println("Complete code over!");
    }
}