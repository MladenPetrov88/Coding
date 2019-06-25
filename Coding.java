import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int inputLenght = input.length();
        for (int digitPos = inputLenght - 1; digitPos >= 0; digitPos--) {
            char currentDigit = input.charAt(digitPos);
            int digitToInt = Character.getNumericValue(currentDigit);
            char resultChar = '0';
            if (digitToInt != 0) {
                int asciiValue = digitToInt + 33;
                resultChar = (char) asciiValue;
                for (int counter = 1; counter <= digitToInt; counter++){
                    System.out.print(resultChar);
                }
                System.out.println();
            } else {
                System.out.println("ZERO");
            }

        }

    }
}
