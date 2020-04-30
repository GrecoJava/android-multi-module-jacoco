package biz.davidpearson.mylibrarythree;

/**
 * Created by David Pearson (greco) on 2020-04-29.
 */
public class Pigglywiggly {
    private String location;

    public Pigglywiggly(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override public String toString() {
        return "Pigglywiggly{" +
                "location='" + location + '\'' +
                '}';
    }
}
