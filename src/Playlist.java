import java.util.Scanner;

public class Playlist {
    private String playlist;

    public Playlist(String playlist) {
        this.playlist = playlist;
    }

    public void setPlaylist(String playlist) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter playlist: ");
        this.playlist = sc.nextLine();
    }

    public String getPlaylist() {
        return playlist;
    }
}

