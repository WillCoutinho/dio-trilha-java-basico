package Entities;

public class Safari extends Browser {

    @Override
    public void refreshPage() {
        System.out.println("Tela atualizada com sucesso!");
    }

    @Override
    public void displayPage() {
        System.out.println("Exibindo a tela no Safari");
    }

    @Override
    public void newTab() {
        System.out.println("Nova aba aberta");
    }
}
