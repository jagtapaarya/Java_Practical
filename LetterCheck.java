//Check if entered CHaracter is Upper or lower

import java.util.Scanner;

public class LetterCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an Uppercase Alphabet.");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Lowercase Alphabet.");
        }
        else {
            System.out.println("Invalid Input! Please enter an alphabet only.");
        }

        sc.close();
    }
}