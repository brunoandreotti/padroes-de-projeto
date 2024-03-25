package br.com.cod3r.state.headphone.states;

import br.com.cod3r.state.headphone.HeadPhone;

public class OffState implements HeadPhoneState{

    public static final HeadPhoneState instance = new OffState();

    @Override
    public void click(HeadPhone headPhone) {
        //nothing will happen
    }

    @Override
    public void longClick(HeadPhone headPhone) {
        headPhone.setOn(true);
        System.out.println("> Turning On");
        headPhone.setState(OnState.getInstance());
    }

    public static HeadPhoneState getInstance() {
        return instance;
    }
}
