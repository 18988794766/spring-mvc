package xy.standard.service;

/**
 * 通过继承Thread类实现自定义线程类
 *
 * Version: 2019-10-27
 * Author by: Blake Huang
 */
public class DemoThread extends Thread {
    private int i = 1;

    @Override
    public void run() {
        while (i <= 10) {
            try {
                System.out.print("当前线程为=" + Thread.currentThread().getName() + "，序列号为=" + i + "\n");
                i++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.print("线程休眠失败！\n");
            }
        }
    }
}
