package dh.com.qst.startthread;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/11/10
 */
public class StartThread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<30;i++){
            System.out.println("听歌");
        }
    }

    public static void main(String[] args) {
        StartThread startThread = new StartThread();

        startThread.start();


        for(int i=0;i<30;i++){
            System.out.println("coding");
        }


    }
}
