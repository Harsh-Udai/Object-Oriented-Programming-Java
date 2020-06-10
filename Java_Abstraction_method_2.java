/*Method-2 throught Interface.    */

interface harsh1{
    void hello();
}

class method_2 implements harsh1{
    public void hello(){
        System.out.println("I amm called :)");
    }
}
public class Java_Abstraction_method_2 {
    public static void main(String[] args){
        method_2 me_2=new method_2();
        me_2.hello();
    }
}