package dh.thread;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/10/23
 */
public class WaitTest implements Runnable{
    private int number;
    private byte res[];
    public static int count = 5;
    public WaitTest(int number,byte a[]){
        this.number = number;
        this.res = a;
    }

    @Override
    public void run() {
        synchronized (res){
            while (count-->0){
                try {
                    res.notify();
                    System.out.println(" "+number);
                    res.wait();
                    System.out.println("--------线程"+Thread.currentThread().getName());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args){
        final byte a[] = {0};
        new Thread(new WaitTest((1),a),"1").start();
        new Thread(new WaitTest((2),a),"2").start();
    }
}
