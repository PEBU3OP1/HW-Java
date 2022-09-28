import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Program
 */
public class Program {

    public static List band_ad(ArrayList band1, ArrayList band2, int x, String side) {
        band1.add(new Peasant(band1, 0, x));
        band1.add(new Bandit(band2, 1, x, side));
        band1.add(new Sniper(band2, 2, x));
        band1.add(new Monk(band1, 3, x));
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(7)) {
                case 0:
                    band1.add(new Peasant(band1, i + 4, x));
                    break;
                case 1:
                    band1.add(new Bandit(band2, i + 4, x, side));
                    break;
                case 2:
                    band1.add(new Sniper(band2, i + 4, x));
                    break;
                case 3:
                    band1.add(new Crossbowman(band2, i + 4, x));
                    break;
                case 4:
                    band1.add(new Spearman(band2, i + 4, x));
                    break;
                case 5:
                    band1.add(new Wizard(band1, i + 4, x));
                    break;
                default:
                    band1.add(new Monk(band1, i + 4, x));
            }
        }
        return band1;
    }

    public static void cleaner_fld(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = Playing_field.middle();
            }
        }
    }

    public static void game_view(ArrayList band1, ArrayList band2, int step, String[][] field) {
        System.out.println(String.format("\t\t\t\t\t\t\t\t\t %d Round", step));

        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("White Band\t\t\t\t\t\t\t\t\t\t\tRed Band\n");
        Playing_field.top();
        System.out.println();
        for (int i = 0; i < field.length; i++) {

            for (int j = 0; j < field.length; j++) {
                Character new_name_white = ((BaseHero) band1.get(j)).getName().charAt(0);
                Character new_name_red = ((BaseHero) band2.get(j)).getName().charAt(0);
                field[((BaseHero) band1.get(j)).getPosY()][((BaseHero) band1.get(j)).getPosX()] = Playing_field
                        .middle(AnsiColors.ANSI_BLUE + new_name_white.toString()+ AnsiColors.ANSI_RESET);
                field[((BaseHero) band2.get(j)).getPosY()][((BaseHero) band2.get(j)).getPosX()] = Playing_field
                        .middle(AnsiColors.ANSI_RED +new_name_red.toString()+ AnsiColors.ANSI_RESET);

                if (field[i][j] == null) {

                    field[i][j] = Playing_field.middle();
                }

                System.out.print(field[i][j]);
            }

            if (((BaseHero) band1.get(i)).condition().length() >= 64) {

                System.out.print(("\t\t" + i + "\t" + (AnsiColors.ANSI_BLUE + ((BaseHero) band1.get(i)).condition()+ AnsiColors.ANSI_RESET) + "\t\t\t|\t\t"
                        + i + "\t" + (AnsiColors.ANSI_RED +((BaseHero) band2.get(i)).condition())+ AnsiColors.ANSI_RESET));

                
                } else {

                    System.out.print("\t\t" + i + "\t" + (AnsiColors.ANSI_BLUE + ((BaseHero) band1.get(i)).condition()+ AnsiColors.ANSI_RESET) + "\t\t\t\t|\t\t"
                            + i + "\t" + (AnsiColors.ANSI_RED +((BaseHero) band2.get(i)).condition()+ AnsiColors.ANSI_RESET));
                }
                System.out.println();
            }
            Playing_field.bottom();
    }
    

    public static void main(String[] args) {
        int step = 1;
        ArrayList<BaseHero> whiteBand = new ArrayList<>();
        ArrayList<BaseHero> redBand = new ArrayList<>();
        String[][] playfld = new String[10][10];
        Scanner in = new Scanner(System.in);

        band_ad(whiteBand, redBand, 0, "white");
        band_ad(redBand, whiteBand, 9, "red");
        game_view(whiteBand, redBand, step, playfld);

        while (true) {

            String text = in.nextLine();

            if (text.equals("q")) {
                break;
            }

            else {
                for (int j = 0; j < whiteBand.size(); j++) {

                    cleaner_fld(playfld);
                    whiteBand.get(j).step();
                    redBand.get(j).step();

                }

                for (int z = 0; z < whiteBand.size(); z++) {

                    whiteBand.get(z).checkstate();
                    redBand.get(z).checkstate();
                }

                game_view(whiteBand, redBand, step, playfld);
            }
            step++;

        }
    }

}
