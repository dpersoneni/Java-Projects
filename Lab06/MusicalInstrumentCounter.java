package it.unimi.di.prog2.music;

public class MusicalInstrumentCounter implements MusicalInstrument {
    private static int counter = 0;
    MusicalInstrument decoratedMusicalInstrument;

    public MusicalInstrumentCounter(MusicalInstrument musicalInstrument) {
        decoratedMusicalInstrument = musicalInstrument;
    }

    public static int getCount() {
        return counter;
    }

    public static void resetCount() {
        counter = 0;
    }

    @Override
    public String play() {
        counter++;
        return decoratedMusicalInstrument.play();
    }

}
