import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        int step = 1;
        ArrayList<BaseHero> whiteBand = new ArrayList<>();
        ArrayList<BaseHero> redBand = new ArrayList<>();

        whiteBand.add(new Peasant());
        whiteBand.add(new Bandit());
        whiteBand.add(new Sniper(redBand));
        whiteBand.add(new Monk(whiteBand));

        redBand.add(new Peasant());
        redBand.add(new Bandit());
        redBand.add(new Sniper(whiteBand));
        redBand.add(new Monk(redBand));

        Scanner in = new Scanner(System.in);

        while (true) {
            if (step == 1) {
                System.out.println("\t\t\t\t\tRound 1");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("White Band\t\t\t\t\t\t\tRed Band");
                for (int i = 0; i < whiteBand.size(); i++) {

                    if (whiteBand.get(i).condition().length() > 22) {
                        System.out.println(whiteBand.get(i).condition() + "\t\t|\t\t" + redBand.get(i).condition());
                    } else {

                        System.out.println(whiteBand.get(i).condition() + "\t\t\t|\t\t" + redBand.get(i).condition());
                    }
                }
            } else {

                String text = in.nextLine();
                String results_of_steps_white = "";
                String results_of_steps_red = "";

                if (text.equals("q")) {
                    break;
                }

                else {
                    System.out.println("\t\t\t\t\tRound " + step);
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("White Band\t\t\t\t\t\t\tRed Band");

                    for (int i = 0; i < whiteBand.size(); i++) {

                        String white_target = whiteBand.get(i).step();
                        String red_target = redBand.get(i).step();

                        if (whiteBand.get(i).getName().equals("Monk") || whiteBand.get(i).getName().equals("Sniper")) {
                            results_of_steps_white += "Персонаж whiteBand " + whiteBand.get(i).getName()
                                    + " стреляет/лечит " + white_target + "\n";
                        }
                        if (redBand.get(i).getName().equals("Monk") || redBand.get(i).getName().equals("Sniper")) {
                            results_of_steps_red += "Персонаж RedBand " + redBand.get(i).getName() + " стреляет/лечит "
                                    + red_target + "\n";
                        }

                        if (whiteBand.get(i).condition().length() >= 24) {

                            System.out.println(whiteBand.get(i).condition() + "\t\t|\t\t" + redBand.get(i).condition());
                        } else {

                            System.out
                                    .println(whiteBand.get(i).condition() + "\t\t\t|\t\t" + redBand.get(i).condition());
                        }
                    }
                    System.out.println();
                    System.out.println(results_of_steps_red);
                    System.out.println(results_of_steps_white);
                }
            }
            step++;
        }

    }

}
