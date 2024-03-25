package br.com.cod3r.state.headphone.states;


import br.com.cod3r.state.headphone.HeadPhone;

public class OnState implements HeadPhoneState {
	private static final HeadPhoneState instance = new OnState();
	private OnState() {}



	public static HeadPhoneState getInstance() {
		return instance;
	}

	@Override
	public void longClick(HeadPhone headPhone) {
		headPhone.setOn(false);
		System.out.println("> Turning Off");
		headPhone.setState(OffState.getInstance());
	}

	@Override
	public void click(HeadPhone hp) {
		hp.setPlaying(true);
		System.out.println("> Resume Player");
		hp.setState(PlayingState.getInstance());
	}
}
