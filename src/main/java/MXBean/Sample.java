package MXBean;

import java.beans.ConstructorProperties;
import java.util.Date;

/**
 * User: Chris
 * Date: 6/12/13
 * Time: 2:24 AM
 */
public class Sample {

    private final Date date;
    private final int size;
    private final String head;

    @ConstructorProperties({"date", "size", "head"})
    public Sample(Date date, int size, String head) {
        this.date = date;
        this.size = size;
        this.head = head;
    }

    public Date getDate() {
        return date;
    }

    public int getSize() {
        return size;
    }

    public String getHead() {
        return head;
    }
}