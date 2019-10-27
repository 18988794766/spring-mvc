package xy.standard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 通过实现Runnable接口实现自定义线程类
 *
 * Version: 2019-10-20
 * Author by: Blake Huang
 */
public class DemoRunnable implements Runnable {
    @Override
    public void run () {
        for (int k=1; k<=10; k++) {
            try {
                System.out.print("当前线程为=" + Thread.currentThread().getName() + "，序列号为=" + k + "\n");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.print("线程休眠失败！\n");
            }
        }
    }

    /*@Autowired
    private ComputeService computeService;

    @Override
    public void run () {
        computeService.index();
    }*/

    /*private int i = 1;

    @Override
    public void run () {
        while (i <= 10) {
            try {
                System.out.print("当前线程为=" + Thread.currentThread().getName() + "，序列号为=" + i + "\n");
                Thread.sleep(1000);
                i++;
            } catch (InterruptedException e) {
                System.out.print("线程休眠失败！\n");
            }
        }
    }*/
}
