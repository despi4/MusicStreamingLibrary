public class Playlist extends Song {
    private String playlistName;

    public Playlist(String[] nameMusic, String playlistName) {
        super(nameMusic);
        this.playlistName = playlistName;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }
}