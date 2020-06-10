class method_overload{
    void say(int a, int b){
        System.out.println("Method overloading: method-1 : values: "+a+"  "+b);
    }
    void say(int a, int b, int c){
        System.out.println("Method overloading: method-2 : values: "+a+"  "+b+"  "+c);
    }
}
public class Java_Method_overloading {
    public static void main(String[] args){
        method_overload mo = new method_overload();
        mo.say(10,20);
        mo.say(10,20,30);
    }
}