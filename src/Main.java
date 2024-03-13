import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task1
        // 1.Get username
        System.out.println("Hello, please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        // 2.Get user's surname
        System.out.println("Please enter your surname.");
        String userSurname = scanner.nextLine();

        // 3.Get user's profession
        System.out.println("Please enter your profession.");
        String userProfession = scanner.nextLine();

        // 4.Display user's name, surname, profession
        System.out.printf("Your name is %s, your surname is %s, your profession is %s.",
                userName, userSurname, userProfession);

        // Task2
        byte numberByte = 88;
        short numberShort = 1000;
        int numberInt = 58000;
        long numberLong = 2147483649L;
        float numberFloat = 55.6969f;
        double numberDouble = 3.141898;
        boolean test = true;
        char letter = 'A';
        String name = "Spring";

        System.out.printf("\nЗначение переменной типа byte = %d, short = %d, int = %d, " +
                        "long = %d, \nfloat = %.6f, double = %.8f, boolean = %b, char = %c," +
                        "string = %s" ,
                numberByte, numberShort, numberInt, numberLong, numberFloat, numberDouble,
                test, letter, name);

        //Task3
        System.out.println("\nTask 3");
        //Enter any text
        System.out.println("Enter any text");
        String enteredText = scanner.nextLine();

        // Display the length of entered text
        System.out.println("The length of entered text is " + enteredText.length());

        System.out.println(enteredText.isEmpty());
        System.out.println("The 5th symbol in text is " + enteredText.charAt(5));

        System.out.println("Enter any text again");
        String enteredAnotherText = scanner.nextLine();
        System.out.println("Text: " + enteredText);
        System.out.println("Another text: " + enteredAnotherText);
        System.out.println(enteredText.equals(enteredAnotherText));

        System.out.println(enteredText.equalsIgnoreCase(enteredAnotherText));

        System.out.println(enteredText.startsWith("a"));
        System.out.println(enteredText.endsWith("b"));
        System.out.println(enteredText.contains("c"));

        System.out.println(enteredText.replace('b', 'c'));
        System.out.println(enteredText.replace("i", " "));

        System.out.println(enteredText.toLowerCase());
    }
}