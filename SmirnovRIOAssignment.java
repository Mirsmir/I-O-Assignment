import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SmirnovRIOAssignment {

    static String[][] phonebook = new String[50][2];
    static String[] tempPhone = new String[50];
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        System.arraycopy(args, 0, args, 0, 0);// THIS IS EPPIC

    }

    public static void menu() {
        Scanner input = new Scanner(System.in);

        int choice = -1;
        do {
            System.out.println(
                    "#### Phonebook### \n\n1-Display Phonebook \n2-Search for name \n3-Search phone number \n4-Add name and phone number \n5-Delete name \n6-Update name \n7-Update phone \n8-Exit");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    readFile();
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("");
                    break;
            }

        } while (choice != 8);
        input.close();

    }

    public static String[][] readFile() {
        // try {
        // int counter = 0;
        // BufferedReader reader = new BufferedReader(new FileReader("phoneBook.txt"));
        // // File file = new File(phoneBook.txt);
        // String name = reader.readLine();
        // while (name != null) {
        // counter++;
        // tempName[counter] = name;
        // System.out.println(name); // ||char27_[]
        // // filecontent = fileContent.concat(read.nextLine() + "\n");

        // }
        // reader.close();
        // } catch (Exception error) {
        // System.out.println("issue reading file");
        // }

        try {

            BufferedReader in = new BufferedReader(new FileReader(fileName));
            int R = 0;
            line = in.readLine();
            phonebook[R] = line.split(",");
            while (line != null) // while not end of file
            {
                R++;
                // System.out.println(R);
                line = in.readLine();
                if (line != null)
                    phonebook[R] = line.split(",");
            }
            in.close();
        } catch (IOException iox) {
            System.out.println("Problem reading " + fileName);
        }

        for (int row = 0; row < phonebook.length; row++) {
            for (int col = 0; col < phonebook[row].length; col++) {
                System.out.print(phonebook[row][col] + "\t");
            }

            System.out.println();

        }

        return phonebook;

        // System.out.println(fileContent);
    }

    public static void display() {
        for (int i = 0; i < tempName.length; i++) {
            System.out.println(tempName[i]);
            System.out.print("\t (");

        }
    }

    public static int addNamePhone(String newName, String newPhone) {

        System.out.print("\n Please enter a new name: ");
        newName = read.nextLine();
        for (int i = 0; i < tempName.length; i++)
            ;
        System.out.print("\n Please enter a new phone #");
        newPhone = read.nextLine();

        return -1;
    }
}
