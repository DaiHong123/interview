package com.qst.download;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/11/10
 */
public class TDownLoad extends Thread{

    private String url;
    private String name;
    public TDownLoad(String url,String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownLoad webDownLoad = new WebDownLoad();
        webDownLoad.download(url,name);
    }

    public static void main(String[] args) {
        TDownLoad t1 = new TDownLoad("123","123");
        TDownLoad t2 = new TDownLoad("123","123");
        TDownLoad t3 = new TDownLoad("123","123");
        t1.start();
        t2.start();
        t3.start();
    }
}
