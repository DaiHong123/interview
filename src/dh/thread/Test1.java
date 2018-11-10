package dh.thread;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/10/23
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Test test1 = new Test();
        Test test2 = new Test();
        synchronized(test1){
            test1.start();
            System.out.println("123");
            test1.wait();
            System.out.println("456");
        }
        //test2.join();
        test2.start();
    }
}
class Test extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
