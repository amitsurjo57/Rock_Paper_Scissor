import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_game {
    public static void main(String[] args) {
        System.out.println("[1] Rock\n[2]Paper\n[3]Scissor");

        Random com = new Random();
        int c = com.nextInt(1, 4);
        System.out.print("Computer has choosen\nNow it's your turn: ");
        Scanner ply = new Scanner(System.in);
        int p = ply.nextInt();
        {
            if (c == 1)
                System.out.println("Computer had choosed Rock");
            else if (c == 2)
                System.out.println("Computer had choosed Paper");
            else
                System.out.println("Computer had choosed scissor");
        }
        if (p > 3)
            System.out.println("Your input is invalid. You Lossed");

        else if (c == 1 && p == 1)
            System.out.println("Draw!!");

        else if (c == 2 && p == 2)
            System.out.println("Draw!!");

        else if (c == 3 && p == 3)
            System.out.println("Draw!!");

        else if (c == 1 && p == 2)
            System.out.println("You Win");

        else if (c == 1 && p == 3)
            System.out.println("You Lossed");

        else if (c == 2 && p == 1)
            System.out.println("You Lossed");

        else if (c == 2 && p == 3)
            System.out.println("You Win");

        else if (c == 3 && p == 1)
            System.out.println("You Win");

        else
            System.out.println("You Lossed");

    }
}