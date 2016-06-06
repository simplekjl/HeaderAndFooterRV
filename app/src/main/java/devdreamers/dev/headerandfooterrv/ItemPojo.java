package devdreamers.dev.headerandfooterrv;

/**
 * Created by jlcs on 6/5/16.
 */
public class ItemPojo {

    private String name;
    private String lastname;

    public ItemPojo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
