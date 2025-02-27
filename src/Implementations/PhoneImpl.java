package Implementations;

import features.Phone;

public class PhoneImpl implements Phone{
    @Override
    public void call(String number) {
        System.out.println("Chamando" + number + "...");
    }

    @Override
    public void endCall() {
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void sendMessage(String number, String message){
        System.out.println("Enviando mensagem para " + number + ": " + message);
    }
}
