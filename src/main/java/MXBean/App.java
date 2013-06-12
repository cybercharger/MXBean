package MXBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class App {
    public static void main(String[] args) throws Exception {
//        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
//
//        ObjectName name = new ObjectName("MXBean.Task:type=Task");
//        TaskMXBean mxbean = new Task();
//        mbs.registerMBean(mxbean, name);
//
//        Queue<String> queue = new ArrayBlockingQueue<String>(10);
//        queue.add("Request-1");
//        queue.add("Request-2");
//        queue.add("Request-3");
//        QueueSampler mxbean = new QueueSampler(queue);
//
//        mbs.registerMBean(mxbean, name);
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        System.out.println("Waiting...");
        System.in.read();
    }
}
