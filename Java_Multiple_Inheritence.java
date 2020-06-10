interface check{
    default void say(){
        System.out.println("I m here");
    }
}
interface check_1{
    default void say(){
        System.out.println("i am here _ again");
    };
}
class A_ implements check, check_1{
    public void say(){
        check.super.say();
        check_1.super.say();
    }
}
public class Java_Multiple_Inheritence {
    public static void main(String[] args){
        A_ a=new A_();
        a.say();
    }

}