package MXBean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

/**
 * User: Chris
 * Date: 6/12/13
 * Time: 11:26 PM
 */
@ManagedResource(objectName = "MXBean.Task:name=Task", description = "A sample JMX-managed bean")
public class Task implements TaskMXBean {
    private Info info;

    public Task() {
        info = new Info(0, "default info");
    }

    @ManagedAttribute
    @Override
    public Info getInfo() {
        return info;
    }

    @Override
    public void setInfo(Info info) {
        this.info = info;
    }

    @ManagedOperation
    @Override
    public void updateInfo(Info info) {
        this.info = info;
    }
}
