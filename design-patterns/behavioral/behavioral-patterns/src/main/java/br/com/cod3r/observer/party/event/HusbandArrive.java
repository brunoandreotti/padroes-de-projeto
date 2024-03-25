package br.com.cod3r.observer.party.event;

public class HusbandArrive implements Event {
    private boolean status = false;

    @Override
    public boolean getStatus() {
        return status;
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }
}
