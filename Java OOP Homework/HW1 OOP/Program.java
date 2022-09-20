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
        
        

        whiteBand.add(new Peasant(redBand, 0,0));
        whiteBand.add(new Bandit(redBand,1,0));
        whiteBand.add(new Sniper(redBand,2,0));
        whiteBand.add(new Monk(whiteBand,3,0));

        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(7)) {
                case 0:
                    whiteBand.add(new Peasant(redBand, i +4, 0));
                    break;
                case 1:
                    whiteBand.add(new Bandit(redBand, i +4, 0));
                    break;
                case 2:
                    whiteBand.add(new Sniper(redBand, i +4, 0));
                    break;
                case 3:
                    whiteBand.add(new Crossbowman(redBand, i +4, 0));
                    break;
                case 4:
                    whiteBand.add(new Spearman(redBand, i +4, 0));
                    break;
                case 5:
                    whiteBand.add(new Wizard(whiteBand, i +4, 0));
                    break;
                default:
                    whiteBand.add(new Monk(whiteBand, i +4, 0));
            }
        }

        redBand.add(new Peasant(whiteBand,0,9));
        redBand.add(new Bandit(whiteBand,1,9));
        redBand.add(new Sniper(whiteBand,2,9));
        redBand.add(new Monk(redBand,3,9));

        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)) {
                case 0:
                    redBand.add(new Peasant(whiteBand, i +4, 9 ));
                    break;
                case 1:
                    redBand.add(new Bandit(whiteBand, i +4, 9));
                    break;
                case 2:
                    redBand.add(new Sniper(whiteBand, i +4, 9));
                    break;
                case 3:
                    redBand.add(new Crossbowman(whiteBand, i +4, 9));
                    break;
                case 4:
                    redBand.add(new Spearman(whiteBand, i +4, 9));
                    break;
                case 5:
                    redBand.add(new Wizard(redBand, i +4, 9));
                    break;
                default:
                    redBand.add(new Monk(redBand, i +4, 9));
            }
        }

        Scanner in = new Scanner(System.in);

        if (step == 1) {
            System.out.println("\t\t\t\t\t\t\t\t\tFirst Round");
        } 
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("White Band\t\t\t\t\t\t\t\t\t\t\tRed Band\n");
        for (int i = 0; i < whiteBand.size(); i++) {

            if (whiteBand.get(i).condition().length() >= 64) {

                System.out.println(whiteBand.get(i).condition() + "\t\t|\t\t" + redBand.get(i).condition());
            } else {

                System.out.println(whiteBand.get(i).condition() + "\t\t\t|\t\t" + redBand.get(i).condition());
            }
        }

        while (true) {

            String text = in.nextLine();
            String results_final = "";

            if (text.equals("q")) {
                break;
            }

            else {
                System.out.println("\t\t\t\t\t\t\t\t\tRound " + step);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
                for (int j = 0; j < whiteBand.size(); j++) {

                    whiteBand.get(j).step();
                    redBand.get(j).step();
                }
                for (int k = 0; k < whiteBand.size(); k++) {

                    if (whiteBand.get(k).condition().length() >= 61) {

                        results_final += String.valueOf(k) + "  " + whiteBand.get(k).condition() + "\t\t|\t\t" + String.valueOf(k) + "  " + redBand.get(k).condition()
                                + "\n";
                    } else {

                        results_final += String.valueOf(k) + "  " + whiteBand.get(k).condition() + "\t\t\t|\t\t" + String.valueOf(k) + "  " + redBand.get(k).condition()
                                + "\n";
                    }
                }

                System.out.println();
                System.out.println("White Band\t\t\t\t\t\t\t\t\t\t\tRed Band\n");
                System.out.println(results_final);
            }
            step++;
        }
    }

}
