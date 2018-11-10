package com.qst.download;

import java.util.concurrent.*;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/11/10
 */
public class CDownLoad implements Callable<Boolean> {
    private String url;
    private String name;
    public CDownLoad(String url,String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() throws Exception {
        WebDownLoad webDownLoad = new WebDownLoad();
        webDownLoad.download(url,name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CDownLoad cd1 = new CDownLoad("123","123");
        CDownLoad cd2 = new CDownLoad("456","456");
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Boolean> result1 = service.submit(cd1);
        Future<Boolean> result2 = service.submit(cd2);
        boolean r1 = result1.get();
        boolean r2 = result1.get();
        service.shutdown();

    }
}
