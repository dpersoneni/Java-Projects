package lab07;

import it.unimi.di.prog2.music.*;

public class MusicalInstrumentFactory implements AbstractInstrumentFactory {
    @Override
    public MusicalInstrument createTrumpet() {
        return new Trumpet();
    }

    @Override
    public MusicalInstrument createHornet() {
        return new Hornet();
    }

    @Override
    public MusicalInstrument createWaterGlass() {
        return new WaterGlassInstrument();
    }

    @Override
    public MusicalInstrument createIronRod() {
        return new GermanMusicInstrument(new IronRod());
    }
}
