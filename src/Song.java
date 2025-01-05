import java.util.Arrays;

public class Song {
    private String[] nameMusic;

    public Song(String[] nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String[] getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String[] nameMusic) {
        this.nameMusic = nameMusic;
    }

    public void addSong(String newSong) {
        nameMusic = Arrays.copyOf(nameMusic, nameMusic.length + 1); // Увеличиваем массив на 1
        nameMusic[nameMusic.length - 1] = newSong; // Добавляем новую песню
    }


    public void displaySongs() {
        System.out.println("Songs in the list:");
        for (String song : nameMusic) {
            System.out.println("- " + song);
        }
    }
}
