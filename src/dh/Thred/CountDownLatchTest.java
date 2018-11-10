package dh.Thred;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/11/9
 */
public class CountDownLatchTest {
    private static final int COUNT = 1000;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(COUNT);


    }
}
