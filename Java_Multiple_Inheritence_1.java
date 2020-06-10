/* Multiple Inheritence Diamond Style  */

interface j{
    default void say(){
        System.out.println("Method of j Interface :)");
    }
}
interface jj extends j{ }

interface jjj extends j{ }

public class Java_Multiple_Inheritence_1  implements jj, jjj{
    public static void main(String[] args){
        Java_Multiple_Inheritence_1 JMI=new Java_Multiple_Inheritence_1();
        JMI.say();
    }
}