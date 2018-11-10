package test;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/10/23
 */
public class Test2 {
    public static void main(String[] args){
        A a = new B();
    }
}
class A{
    static {
        System.out.println("A static");
    }
    public A(){
        System.out.println("A con");
        print();
    }
    {
        System.out.println("I'm A");
    }
    public void print(){
        System.out.println("A print");
    }
}
class B extends A{
    static {
        System.out.println("B static");
    }
    public B(){
        System.out.println("B con");
        print();
    }
    {
        System.out.println("I'm B");
    }
    @Override
    public void print(){
        System.out.println("B print");
    }
}
