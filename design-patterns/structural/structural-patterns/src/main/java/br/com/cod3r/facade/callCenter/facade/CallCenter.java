package br.com.cod3r.facade.callCenter.facade;

import br.com.cod3r.facade.callCenter.model.Card;

public interface CallCenter {

    void blockAndOrderNewCard(Long cardNumber);

    void cardInfo (Long cardNumber);

    void getSummary(Long cardNumber);

    void paymentInfo(Long cardNumber);
}
