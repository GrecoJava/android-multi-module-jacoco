package biz.davidpearson.mylibraryone;

/**
 * Created by David Pearson (greco) on 2020-04-29.
 */
public class Pasghetti {
    private String noodles;

    public Pasghetti(String noodles) {
        this.noodles = noodles;
    }

    public String getNoodles() {
        return noodles;
    }

    public void setNoodles(String noodles) {
        this.noodles = noodles;
    }

    @Override public String toString() {
        return "Pasghetti{" +
                "noodles='" + noodles + '\'' +
                '}';
    }
}
