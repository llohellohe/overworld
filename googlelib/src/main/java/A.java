/**
 * Created by yangqi on 9/22/14.
 */
public class A {

    private static B b=new B();

    public static void main(String[] args) {
        A  a=new A();
        //a.execute();

    }

    public void execute(){
        B b=new B();
        b.foo();
    }
}
