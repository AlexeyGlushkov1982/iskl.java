package TASK1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidNumberException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Input number: ");
            int a = Integer.parseInt(scanner.next());
            if (a <= 0) {
                throw new InvalidNumberException("Некорректное число");
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Число корректно");
    }
}