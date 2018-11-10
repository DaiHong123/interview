package dh.BlockQuqe;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/11/9
 */
public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
       /* BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>(2);
        Producer producer1 = new Producer(blockingQueue);
        Producer producer2 = new Producer(blockingQueue);
        Producer producer3 = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(producer1);
        executor.execute(producer2);
        executor.execute(producer3);
        executor.execute(consumer);
        Thread.sleep(10*1000);
        producer1.stop();
        producer2.stop();
        producer3.stop();
        Thread.sleep(2000);
        executor.shutdown();*/
    }
}

class Producer implements Runnable{

    private volatile boolean isRunning = true;
    private BlockingQueue<String> queue;
    private static AtomicInteger count = new AtomicInteger();
    private static final int DEFAULT_RANGE_FOR_SLEFR = 1000;

    public Producer(BlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        String data = null;
        Random r = new Random();
        System.out.println(Thread.currentThread().getName()+"启动生产者");
        try {
            while (isRunning){
                System.out.println("正在生产");
                Thread.sleep(r.nextInt(DEFAULT_RANGE_FOR_SLEFR));
                data = "data:"+count.incrementAndGet();
                System.out.println(Thread.currentThread().getName()+"将数据"+data+"放入队列中");
                if(!queue.offer(data)){
                    System.out.println("放入数据失败"+data);
                }
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.interrupted();
        }finally {
            System.out.println("退出生产者线程!");
        }
    }

    public void stop(){
        isRunning = false;
    }
}
class Consumer implements Runnable{

    private BlockingQueue<String> queue;
    private static final int DEFAULT_RANGE_FOR_SLEFR = 1000;
    public Consumer(BlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"启动消费者线程");
        Random r = new Random();
        boolean isRunning = true;

            try {
                while (isRunning) {
                    System.out.println("正在获取数据");
                    String data = queue.poll(2, TimeUnit.SECONDS);
                    if(data!=null){
                        System.out.println("获取数据成功:"+data);
                        Thread.sleep(r.nextInt(DEFAULT_RANGE_FOR_SLEFR));
                    }else{
                        isRunning = false;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.interrupted();
            }finally {
                System.out.println("退出消费者");
            }

    }
}