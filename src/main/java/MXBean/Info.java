package MXBean;

import java.beans.ConstructorProperties;

/**
 * User: Chris
 * Date: 6/12/13
 * Time: 11:25 PM
 */
public class Info {
    private int id;
    private String description;

    @ConstructorProperties({"id", "description"})
    public Info(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
