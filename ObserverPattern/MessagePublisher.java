import java.util.List;
import java.util.ArrayList;

public class MessagePublisher implements Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer o) {
        observers.add(o);
        }
        @Override
        public void detach(Observer o) {
        observers.remove(o);
        }
        @Override
        public void notifyUpdate(Message m) {
        for(Observer o: observers) {
        o.update(m);
        }
        }
}
