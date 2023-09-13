package Entities;

public class Player {

    private String musicName;

    public Player() {
    }

    public void playMusic() {
        if (musicName != null) {
            System.out.println("Tocando música " + musicName);
        } else {
            throw new RuntimeException("Selecione uma música primeiro!");
        }
    }

    public void pauseMusic() {
        if (musicName != null) {
            System.out.println("Pausando música " + musicName);
        } else {
            throw new RuntimeException("Selecione uma música primeiro!");
        }
    }

    public void selectMusic(String musicName) {
        System.out.println("Música selecionada: " + musicName);
        this.musicName = musicName;
    }
}
