package it.unimi.di.prog2.music;

public class GermanMusicInstrument implements MusicalInstrument {
    private GermanPercussiveInstrument germanPercussiveInstrument;

    private GermanMusicInstrument(GermanPercussiveInstrument gpi) {
        germanPercussiveInstrument=gpi;
    }

    @Override
    public String play() {
        return germanPercussiveInstrument.spiel();
    }
}
