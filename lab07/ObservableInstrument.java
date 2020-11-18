package lab07;

import it.unimi.di.prog2.music.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class ObservableInstrument implements MusicalInstrument, Subject {
    private List<Observer> observers = new ArrayList<>();
    private MusicalInstrument instrument;

    public ObservableInstrument(MusicalInstrument musicalInstrument) {
        this.instrument = musicalInstrument;
    }

    @Override
    public String play() {
        String result = instrument.play();
        notiftObserver();
        return result;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notiftObserver() {
        for (Observer observer : observers) {
            observer.update(this, getInstrumentName());
        }
    }

    public String getInstrumentName() {
        return instrument.getClass().getSimpleName();
    }
}
