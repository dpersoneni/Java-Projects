package lab07;

import it.unimi.di.prog2.music.*;

public class CountedInstrumentFactory implements AbstractInstrumentFactory {
    @Override
    public MusicalInstrument createTrumpet() {
        return new MusicalInstrumentCounter(new Trumpet());
    }

    @Override
    public MusicalInstrument createHornet() {
        return new MusicalInstrumentCounter(new Hornet());
    }

    @Override
    public MusicalInstrument createWaterGlass() {
        return new MusicalInstrumentCounter(new WaterGlassInstrument());
    }

    @Override
    public MusicalInstrument createIronRod() {
        return new MusicalInstrumentCounter(new GermanMusicInstrument(new IronRod()));
    }
}
