package it.unimi.di.prog2.music;

import java.util.ArrayList;
import java.util.List;

public class Orchestra implements MusicalInstrument {
    List<MusicalInstrument> instruments = new ArrayList<>();


    @Override
    public String play() {
        StringBuilder sb =  new StringBuilder();
        boolean first = true;
        for (MusicalInstrument musicalInstrument : instruments) {
            if (first) {
                first = false;
            } else {
                sb.append("\n");
            }
            sb.append(musicalInstrument.play());
        }
        return sb.toString();

    }
    public void add(MusicalInstrument instrument) {
        instruments.add(instrument);
    }
}
