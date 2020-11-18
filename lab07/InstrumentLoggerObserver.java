package lab07;

public class InstrumentLoggerObserver implements Observer{
    @Override
    public void update(Subject s, Object state) {
        if (s instanceof ObservableInstrument) {
            String name = ((ObservableInstrument) s).getInstrumentName();
            System.err.println(name);
        }
    }
}
