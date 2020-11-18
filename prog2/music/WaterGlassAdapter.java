package it.unimi.di.prog2.music;

public class WaterGlassAdapter extends WaterGlass implements MusicalInstrument {
    @Override
    public String play() {
        return tap();
    }
}
