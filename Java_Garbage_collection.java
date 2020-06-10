/*Important !! method Java Garbage collection (how it works) */
public class Java_Garbage_collection {
    public static void main(String[] args){
        Java_Garbage_collection JGC=new Java_Garbage_collection();
        System.out.println(JGC.hashCode());
        JGC=null;
        System.gc();
    }
    protected void finalize(){
        System.out.println("Finalized is called to free the memory");
    }

}