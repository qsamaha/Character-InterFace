import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Players Q =  new Players("Q", 100,100,"Sword");
        System.out.println(Q.toString());
        savedObject(Q);

        Q.setHitPoints(9);
        Q.setWeapon("Ak-47");
        savedObject(Q);
   //     loadObject(Q);
        System.out.println(Q);

        System.out.println("==============");
        ISaveable wereWolf = new Monsters("Q", 10,15);
        System.out.println(wereWolf);
        savedObject(wereWolf);

        System.out.println("===========================");
        ISaveable athlete = new Athletes("Kobe", "Lakers", 24);
        savedObject(athlete);
        System.out.println(((Athletes) athlete).getName());
        System.out.println(athlete);
        ((Athletes) athlete).setJerseyNumber(8);
        savedObject(athlete);
        System.out.println(athlete);
        loadObject(athlete);
        System.out.println(athlete);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void savedObject(ISaveable objectToSave){
        for (int i = 0; i < objectToSave.savedCharacters().size(); i++){
            System.out.println("Saving " + objectToSave.savedCharacters().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
