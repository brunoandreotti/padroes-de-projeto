package br.com.cod3r.observer.party.observers;

public class FriendObserver implements Observer {

    public void sendGift() {
        System.out.println("Sending gift");
    }
    @Override
    public void onUpdate(boolean status) {
        if (status) {
            sendGift();
        } else {
            System.out.println("Still waiting to send gift...");
        }
    }
}
