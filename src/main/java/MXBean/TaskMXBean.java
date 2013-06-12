package MXBean;

/**
 * User: Chris
 * Date: 6/12/13
 * Time: 11:28 PM
 */
public interface TaskMXBean {
    public Info getInfo();

    public void setInfo(Info info);

    public void updateInfo(Info info);
}
