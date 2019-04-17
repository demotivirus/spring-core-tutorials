package xml.tutorial9;

import xml.tutorial3.Perforrmer;

public class Instrumentalist implements Perforrmer {

    public Instrumentalist(){}

    private String song;
    private String name;
    private Instrument instrument;

    @Override
    public void perform() {
        System.out.print(name + " playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
