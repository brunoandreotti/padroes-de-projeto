package br.com.cod3r.observer.party.observers;

public class WifeObserver implements Observer{

    public void startParty() {
        System.out.println("Let's Party!!!!");
    }
    @Override
    public void onUpdate(boolean status) {
            if (status) {
                startParty();
            } else {
                System.out.println("Still waiting to start party...");
            }
    }
}
