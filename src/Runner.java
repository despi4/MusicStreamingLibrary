public class Runner {
    public static void main(String[] args) {
        MSL msl = new MSL("User", 1);
        System.out.println("Welcome to our music platform\n" + "_____________________________");
        System.out.println("How should I contact you ?");
        msl.setUsername();
        String name = msl.getUsername();
        System.out.println(name);
        int menu = msl.enterNumb();
        msl.printMenu();
s   цуцу
        while(true){
            if(menu == 1){

            }
            else if(menu == 2){

            }
            else if(menu == 3){

            }
            else if(menu == 4){

            }
            else if(menu == 5){

            }
            else if(menu == 0){
                System.out.println("Goodbye!");
                System.exit(0);
            }
        }
    }
}


