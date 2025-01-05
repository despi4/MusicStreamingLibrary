import java.util.ArrayList;
    public class Artist {
        private String name; // Имя артиста
        private ArrayList<Song> songs; // Список песен

        public Artist(String name) {
            this.name = name;
            this.songs = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void addSong(Song song) {
            songs.add(song);
        }

        public void displaySongs() {
            System.out.println("Songs by " + name + ":");
            for (Song song : songs) {
                System.out.println("- " + String.join(", ", song.getNameMusic()));
            }
        }

        public void describe() {
            System.out.println(name + " is a general artist.");
        }
    }

    class SoloArtist extends Artist {
        public SoloArtist(String name) {
            super(name);
        }

        @Override
        public void describe() {
            System.out.println(getName() + " is a solo artist.");
        }
    }

    class Band extends Artist {
        private int memberCount;

        public Band(String name, int memberCount) {
            super(name);
            this.memberCount = memberCount;
        }

        public int getMemberCount() {
            return memberCount;
        }

        public void setMemberCount(int memberCount) {
            this.memberCount = memberCount;
        }

        @Override
        public void describe() {
            System.out.println(getName() + " is a band with " + memberCount + " members.");
        }
    }

