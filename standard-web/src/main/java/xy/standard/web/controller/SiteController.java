package xy.standard.web.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xy.standard.dao.entity.AdminUser;
import xy.standard.service.DemoCall;
import xy.standard.service.DemoRunnable;
import xy.standard.service.DemoThread;
import xy.standard.service.MysqlService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@RestController
@RequestMapping("/site")
public class SiteController {
    @Autowired
    private MysqlService mysqlService;

    @Autowired
    private DemoRunnable demoRunnable;

    @Autowired
    private DemoThread demoThread;

    @Autowired
    private DemoThread demoThread1;

    @Autowired
    private DemoThread demoThread2;

    @Autowired
    private DemoThread demoThread3;

    @Autowired
    private DemoCall demoCall;

    @Autowired
    private DemoCall demoCall1;

    @Autowired
    private DemoCall demoCall2;

    @Autowired
    private DemoCall demoCall3;

    @RequestMapping("/call")
    public String call() {
        FutureTask<Integer> futureTask1 = new FutureTask<Integer>(demoCall1);
        FutureTask<Integer> futureTask2 = new FutureTask<Integer>(demoCall2);
        FutureTask<Integer> futureTask3 = new FutureTask<Integer>(demoCall3);
        Thread thread1 = new Thread(futureTask1, "demoCall1");
        Thread thread2 = new Thread(futureTask2, "demoCall2");
        Thread thread3 = new Thread(futureTask3, "demoCall3");
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            System.out.print("打印结果" + futureTask1.get());
            System.out.print("打印结果" + futureTask2.get());
            System.out.print("打印结果" + futureTask3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.print("ExecutionException");
        }
        return "SUCCESS";
    }

    @RequestMapping("/thread")
    public String thread() {
        demoThread1.start();
        demoThread2.start();
        demoThread3.start();
        demoThread1.start();
        return "SUCCESS";
    }

    @RequestMapping("/runnable")
    public String runnable() {
        Thread thread1 = new Thread(demoRunnable, "demoRunnable1");
        Thread thread2 = new Thread(demoRunnable, "demoRunnable2");
        Thread thread3 = new Thread(demoRunnable, "demoRunnable3");
        thread1.start();
        thread2.start();
        thread3.start();
        return "SUCCESS";
    }

    @RequestMapping(value = "/index",consumes = "application/json")
    public String index(@RequestBody String req) {
        AdminUser adminUser =  mysqlService.test(1);
        System.out.print("执行完毕");
        return JSON.toJSONString(adminUser);
    }
}
