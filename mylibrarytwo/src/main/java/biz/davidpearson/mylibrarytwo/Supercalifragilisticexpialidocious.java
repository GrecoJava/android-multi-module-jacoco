package biz.davidpearson.mylibrarytwo;

/**
 * Created by David Pearson (greco) on 2020-04-29.
 */
public class Supercalifragilisticexpialidocious {
    private int spoonfullCount;

    public Supercalifragilisticexpialidocious(int spoonfullCount) {
        this.spoonfullCount = spoonfullCount;
    }

    public int getSpoonfullCount() {
        return spoonfullCount;
    }

    public void setSpoonfullCount(int spoonfullCount) {
        this.spoonfullCount = spoonfullCount;
    }

    @Override public String toString() {
        return "Supercalifragilisticexpialidocious{" +
                "spoonfullCount=" + spoonfullCount +
                '}';
    }
}
