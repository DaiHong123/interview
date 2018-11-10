package dh.Thred;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/11/9
 */
public class MyThread extends Thread {

    private  int count = 5;


    @Override
    public void run(){
            /*if(count!=0){
                System.out.println(Thread.currentThread().getName()+":"+count--);
            }*/


            while (count!=0){

            System.out.println(Thread.currentThread().getName()+":"+count--);


           }

    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        /*MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        myThread1.start();
        myThread2.start();
        myThread3.start();*/


      /*  short i = 1;
        ++i;
        System.out.println(i);
*/
        /*Thread thread1 = new Thread(myThread,"A");
        Thread thread2 = new Thread(myThread,"B");
        Thread thread3 = new Thread(myThread,"C");
        thread1.start();
        thread2.start();
        thread3.start();*/
    }
}
