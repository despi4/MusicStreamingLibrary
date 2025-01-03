public class Artist {
    private String Top;

    public Artist(String top) {
        this.Top = top;
    }

    public String getTop() {
        return Top;
    }

    public static void main(String[] args) {
        Artist[] topArtists = {
                new Artist("Drake"),
                new Artist("Taylot Swift"),
                new Artist("Ed Sheeran"),
                new Artist("Adele"),
                new Artist("Billie Eilish")
        };

        System.out.println("Top 5 Popular Artist:");
        for(int i = 0; i < topArtists.length; i++) {
            System.out.println((i + 1) + ". " + topArtists[i].getTop());
        }
    }
    wre
}
