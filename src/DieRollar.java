import java.util.Scanner;
import java.util.Random;
public class DieRollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        String playAgain;

        do {
            int rollCount = 0;
            boolean isTriple = false;

            System.out.printf("%-8s %-8s %-8s %-8s %-8s%n", "Roll", "Die 1", "Die 2", "Die 3", "Sum");
            System.out.println("-----------------------------------------");

            while (!isTriple) {
                rollCount++;
                int die1 = gen.nextInt(6) + 1;
                int die2 = gen.nextInt(6) + 1;
                int die3 = gen.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-8d %-8d %-8d %-8d %-8d%n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    isTriple = true;
                }
            }

                System.out.print("You got a triple! Do you want to play again? (Y/N): ");
                playAgain = in.nextLine();
            } while (playAgain.equalsIgnoreCase("Y"));

            System.out.println("Thanks for playing!");
            in.close();
        }
    }