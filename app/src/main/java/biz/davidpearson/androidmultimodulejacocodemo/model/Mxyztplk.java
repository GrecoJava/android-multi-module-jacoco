package biz.davidpearson.androidmultimodulejacocodemo.model;

/**
 * Created by David Pearson (greco) on 2020-04-24.
 */
public class Mxyztplk {
    private int year;
    private String era;

    public static final class MxyztplkBuilder {
        private int year;
        private String era;

        private MxyztplkBuilder() {
        }

        public static MxyztplkBuilder aMxyztplk() {
            return new MxyztplkBuilder();
        }

        public MxyztplkBuilder withYear(int year) {
            this.year = year;
            return this;
        }

        public MxyztplkBuilder withEra(String era) {
            this.era = era;
            return this;
        }

        public Mxyztplk build() {
            Mxyztplk mxyztplk = new Mxyztplk();
            mxyztplk.era = this.era;
            mxyztplk.year = this.year;
            return mxyztplk;
        }
    }

    public int getYear() {
        return year;
    }

    public String getEra() {
        return era;
    }

    @Override public String toString() {
        return "Mxyztplk{" +
                "year=" + year +
                ", era='" + era + '\'' +
                '}';
    }
}
