
class method_override{
    void say(){
        System.out.println("Method");
    }
}
class methodd extends method_override{
    void say(){
        System.out.println("Overridden method");
    }
}
public class Java_Method_overriding {
    public static void main(String[] args){
        methodd me=new methodd();
        me.say();
    }
}