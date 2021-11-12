import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Stringutils {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something: ");

        String userInput = scanner.nextLine();

        System.out.println("You entered: " + userInput);


        //Checks if String is number or not

        if (StringUtils.isNumeric(userInput)) {
            System.out.println("This is a number");
        } else {
            System.out.println("This is NOT a number");
        }


        //Flip case of String
        if (StringUtils.isNumeric(userInput)) {
            System.out.println("A number cannot have swapped casing :(");
        } else {
           String swappedUserInput = StringUtils.swapCase(userInput);
            System.out.println(swappedUserInput);
        }


        //Reverses String

        String reversedUserInput = StringUtils.reverse(userInput);
        System.out.println(reversedUserInput);


    }


}

