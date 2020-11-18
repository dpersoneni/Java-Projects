package lab07;

import java.util.HashMap;
import java.util.Map;

public class InstrumentCounterObserver  implements  Observer{
    private Map<String, Integer> counters = new HashMap<>();

    @Override
    public void update(Subject s, Object state) {
        if (state instanceof String) {
            counters.put((String) state, counters.getOrDefault(state,0)+ 1);
        }
    }

    public int getCount(final String name) {
        return counters.getOrDefault(name, 0);
    }

    public void resetCount() {
        counters.clear();
    }
}
