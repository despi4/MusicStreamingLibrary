import java.util.Scanner;

public class MSL {
    private String username;
    int menuChoice;

    public MSL(String username, int menuChoice) {
        this.username = username;
        this.menuChoice = menuChoice;
    }

    public int enterNumb(){
        Scanner sc = new Scanner(System.in);
        this.menuChoice = sc.nextInt();
        return this.menuChoice;
    }

    public void setUsername() {
        Scanner sc = new Scanner(System.in);
        this.username = sc.nextLine();
    }

    public String getUsername() {
        return this.username;
    }


    public static void printMenu() {
        System.out.println("Please select one of the following options:");
        System.out.println("1. All music\n" + "2. Add Music\n" + "3. Delete Music\n" + "0. Exit\n");
    }
}
