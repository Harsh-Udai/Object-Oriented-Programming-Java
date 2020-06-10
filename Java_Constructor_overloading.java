

class constructor_overloading{
    int a;
    int b;
    int c;
    public constructor_overloading(int value){
        a=value;
    }
    public constructor_overloading(int value1,int value2){
        b=value1;
        c=value2;
    }
    void display(){
        System.out.println("Value through first constructor : "+a);
        System.out.println("Value throught second constructor : "+b+"  "+c);
    }
}
public class Java_Constructor_overloading {
    public static void main(String[] args){
        constructor_overloading coo=new constructor_overloading(10,20);
        coo.display();
        /*
        constructor_overloading co=new constructor_overloading(10);
        co.display();
        Also try this for first constructor
        */
    }
}