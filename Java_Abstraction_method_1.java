/* Method-1  through Abstract class  */

abstract class abstract_method{
    abstract void abstract_();
}
class next extends abstract_method{
    @Override
    void abstract_() {
        System.out.println("I am called :)");
    }
}
public class Java_Abstraction_method_1 {
    public static void main(String[] args){
        next ne=new next();
        ne.abstract_();
    }

}