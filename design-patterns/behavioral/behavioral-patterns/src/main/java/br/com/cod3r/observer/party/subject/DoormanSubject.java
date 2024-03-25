package br.com.cod3r.observer.party.subject;

import br.com.cod3r.observer.party.event.Event;
import br.com.cod3r.observer.party.event.HusbandArrive;

public class DoormanSubject extends Subject {

    private boolean status = false;

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void checkStatus(Event event) {
        if (event.getStatus() != status) {
            setStatus(true);

        }
        notifyObservers(status);

    }
}
