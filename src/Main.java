import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MSL msl = new MSL("User", 1);
        Scanner add = new Scanner(System.in);
        System.out.println("Welcome to our music platform\n" + "_____________________________");
        System.out.println("How should I contact you ?");

        String[] music = new String[]{"lana del rey - summertime sadness", "imagine dragons - Enemy", "ssshhhiiittt - Вишня", "Виктор Цой - Группа крови", "C418 - Minecraft", "The walters - I love you so", "Ramsstein - Sonne", "Laufey - Falling Behind ", "Woodkid - run boy run", "Curtis feat Jazmine - Our love"};

        msl.setUsername();
        String name = msl.getUsername();
        msl.printMenu();

        int menu = msl.enterNumb();
        while (true) {
            if (menu == 1) {
                printAllMusic(music);
            } else if (menu == 2) {
                music = addmusic(add, music);
            } else if (menu == 3) {
                System.out.println("Create Playlist");
                Playlist playlist = new Playlist(music, "v");
                System.out.println("Please enter the name of the playlist:");
                Scanner input = new Scanner(System.in);
                playlist.setPlaylistName(input.next());
                playlist.addSong(music[0]);
            } else if (menu == 4) {
                System.out.println("Top artists");
            } else if (menu == 5) {
                System.out.println("in development");
            } else if (menu == 0) {
                System.out.println("Goodbye!");
                System.exit(0);
            } else {
                System.out.printf("Invalid menu, please %s choose one of the following options\n", name);
            }
            System.out.printf("Please %s Enter number \n", name);
            menu = msl.enterNumb();
        }
    }


    private static String[] addmusic(Scanner add, String[] music) {
        System.out.println("Write name a music");
        String inputmusic = add.next();
        String[] resArray = new String[music.length + 1];
        for(int i = 0; i < music.length; i++){
            resArray[i] = music[i];
        }
        resArray[music.length] = inputmusic;
        return resArray;
    }

    private static void printAllMusic(String[] music) {
        for(int i = 0; i < music.length; i++){
            System.out.print(music[i] + " | ");
        }
        System.out.println();
    }
}






