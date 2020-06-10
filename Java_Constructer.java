

class constructor{
    int first;
    int second;
    public constructor(int a, int b){
        first=a;
        second=b;
    }
    void display(){
        System.out.println("This is the Variable Assignment through Constructor");
        System.out.println("The values are : "+first+"  "+second);
    }
}
public class Java_Constructer {
    public static void main(String[] args){
        constructor cc=new constructor(10,20);
        cc.display();
    }
}