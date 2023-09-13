package Entities;

public class Phone {

    public Phone() {
    }

    public void call(String number) {
        if (number != null) {
            System.out.println("Ligando para o número " + number);
        } else {
            throw new RuntimeException("O número deve ser válido!");
        }

    }

    public void answerCall() {
        System.out.println("Ligação atendida");
    }

    public void voiceMail() {
        System.out.println("Ligação não atendida. Correio de voz iniciado.");
    }
}
