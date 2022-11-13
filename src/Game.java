
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Game {

    final int numberOfDices = 5;

    public static void main(String[] args)  {

        setGame();
        System.out.println("Enter the number of players: ");

        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = Integer.parseInt(scanner.nextLine());

        if (numberOfPlayers == 2)
        {
            System.out.println("Enter the name of the first player ");
            String name = scanner.nextLine();
            System.out.println("Enter the name of another player");
            String name2 = scanner.nextLine();
        } else if (numberOfPlayers == 3) {
            System.out.println("Enter the name of the first player ");
            String name = scanner.nextLine();
            System.out.println("Enter the name of another player");
            String name2 = scanner.nextLine();
            System.out.println("Enter the name of another player");
            String name3 = scanner.nextLine();
        } else if (numberOfPlayers == 4) {
            System.out.println("Enter the name of the first player ");
            String name = scanner.nextLine();
            System.out.println("Enter the name of another player");
            String name2 = scanner.nextLine();
            System.out.println("Enter the name of another player");
            String name3 = scanner.nextLine();
            System.out.println("Enter the name of another player");
            String name4 = scanner.nextLine();
        } else{
            System.out.println("Illegal number of players");
        }

        rollFirstDices();
        System.out.println("Which dices do you want to roll again?");
        rollDiceSecondTime();

    }

    private static void setGame() {
        System.out.println("Welcome in the world of dice");
        System.out.println("Number of players: 2-4");
        System.out.println("Let's play :)");
        System.out.println();

    }


    private static void rollFirstDices () {
        double random = Math.random();
        System.out.println(random);
        int max = 6;
        int min = 1;
        System.out.println("Roll the dice");
        Double randomFrom1to6 = getRandomFromMinToMax(max, min);
        int dice1 = getRandomFromMinToMax(max, min).intValue();
        System.out.println(dice1);
        int dice2 = getRandomFromMinToMax(max, min).intValue();
        System.out.println(dice2);
        int dice3 = getRandomFromMinToMax(max, min).intValue();
        System.out.println(dice3);
        int dice4 = getRandomFromMinToMax(max, min).intValue();
        System.out.println(dice4);
        int dice5 = getRandomFromMinToMax(max, min).intValue();
        System.out.println(dice5);
    }
    private static void rollDiceSecondTime () {
        Scanner scanner = new Scanner(System.in);
        int rollAgain = Integer.parseInt(scanner.nextLine());


    }
    private static Double getRandomFromMinToMax(int max, int min)
    {
        return min + Math.random() * ((max - min) + 1);
    }

    
}

