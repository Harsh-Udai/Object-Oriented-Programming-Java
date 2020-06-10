
class A{
    void say(){
        System.out.println("Say is called");
    }
}
class B extends A{
    void Again(){
        System.out.println("Agian is called");
    }
}
public class Java_inheritence {
    public static void main(String[] args){
        B b =new B();
        b.say();
        b.Again();
    }
}