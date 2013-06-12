package MXBean;

/**
 * User: Chris
 * Date: 6/12/13
 * Time: 2:24 AM
 */
public interface QueueSamplerMXBean {
    public Sample getSample();
    public void clearQueue();
}
