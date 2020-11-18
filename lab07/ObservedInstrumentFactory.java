package lab07;

import it.unimi.di.prog2.music.*;

import java.util.ArrayList;
import java.util.List;

public class ObservedInstrumentFactory implements AbstractInstrumentFactory {
    private List<Observer> observers = new ArrayList<>();

    public ObservedInstrumentFactory(List<Observer> audience) {
        observers = audience;
    }


    @Override
    public MusicalInstrument createTrumpet() {
        ObservableInstrument instrument = new ObservableInstrument(new Trumpet());
        for (Observer observer : observers) {
            instrument.registerObserver(observer);
        }
        return instrument;
    }

    @Override
    public MusicalInstrument createHornet() {
        ObservableInstrument instrument = new ObservableInstrument(new Hornet());
        for (Observer observer : observers) {
            instrument.registerObserver(observer);
        }
        return instrument;
    }

    @Override
    public MusicalInstrument createWaterGlass() {
        ObservableInstrument instrument = new ObservableInstrument(new WaterGlassInstrument());
        for (Observer observer : observers) {
            instrument.registerObserver(observer);
        }
        return instrument;
    }

    @Override
    public MusicalInstrument createIronRod() {
        ObservableInstrument instrument = new ObservableInstrument(new GermanMusicInstrument(new IronRod()));
        for (Observer observer : observers) {
            instrument.registerObserver(observer);
        }
        return instrument;
    }
}
