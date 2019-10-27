package xy.standard.service;

public class ComputeService {

    /*private int i = 1;

    public void index () {
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

    public void index () {
        for (int k=1; k<=10; k++) {
            try {
                System.out.print("当前线程为=" + Thread.currentThread().getName() + "，序列号为=" + k + "\n");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.print("线程休眠失败！\n");
            }
        }
    }
}
