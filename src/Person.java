/**
 * Created by cybx_live on 3/2/17.
 */
public class Person {
    private String id;
    private String name;
    private boolean getit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", getit=" + getit +
                '}';
    }

    public boolean isGetit() {
        return getit;
    }

    public void setGetit(boolean getit) {
        this.getit = getit;
    }
}
