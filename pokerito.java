package Pokerito;
import java.util.Scanner;
import java.util.Locale;

public class pokerito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
       
        String one = "   _____\n"+
        "  |A _  |\n"+ 
        "  | ( ) |\n"+
        "  |(_'_)|\n"+
        "  |  |  |\n"+
        "  |____V|\n";
        String two = "   _____\n"+              
        "  |2    |\n"+ 
        "  |  o  |\n"+
        "  |     |\n"+
        "  |  o  |\n"+
        "  |____Z|\n";
        String three = "   _____\n" +
        "  |3    |\n"+
        "  | o o |\n"+
        "  |     |\n"+
        "  |  o  |\n"+
        "  |____E|\n";
        String four = "   _____\n" +
        "  |4    |\n"+
        "  | o o |\n"+
        "  |     |\n"+
        "  | o o |\n"+
        "  |____h|\n";
        String five = "   _____ \n" +
        "  |5    |\n" +
        "  | o o |\n" +
        "  |  o  |\n" +
        "  | o o |\n" +
        "  |____S|\n";
        String six = "   _____ \n" +
        "  |6    |\n" +
        "  | o o |\n" +
        "  | o o |\n" +
        "  | o o |\n" +
        "  |____6|\n";
        String seven = "   _____ \n" +
        "  |7    |\n" +
        "  | o o |\n" +
        "  |o o o|\n" +
        "  | o o |\n" +
        "  |____7|\n";
        String eight = "   _____ \n" +
        "  |8    |\n" +
        "  |o o o|\n" +
        "  | o o |\n" +
        "  |o o o|\n" +
        "  |____8|\n";
        String nine = "   _____ \n" +
        "  |9    |\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |____9|\n";
        String ten = "   _____ \n" +
        "  |10  o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |___10|\n";
        String eleven = "   _____\n" +
        "  |J  ww|\n"+ 
        "  | o {)|\n"+ 
        "  |o o% |\n"+ 
        "  | | % |\n"+ 
        "  |__%%[|\n";
        String twelve = "   _____\n" +
        "  |Q  ww|\n"+ 
        "  | o {(|\n"+ 
        "  |o o%%|\n"+ 
        "  | |%%%|\n"+ 
        "  |_%%%O|\n";
        String thirteen = "   _____\n" +
        "  |K  WW|\n"+ 
        "  | o {)|\n"+ 
        "  |o o%%|\n"+ 
        "  | |%%%|\n"+ 
        "  |_%%%>|\n";

        System.out.println("Here's your card");
        int yourCard = randomCard();
        String yourCardDraw ="";
        switch (yourCard) {
            case 1: {
                yourCardDraw = one;
                System.out.println(yourCardDraw);
                break;
            }
            case 2: {
                yourCardDraw = two;
                System.out.println(yourCardDraw);
                break;
            }
            case 3: {
                yourCardDraw = three;
                System.out.println(yourCardDraw);
                break;
            }
            case 4: {
                yourCardDraw = four;
                System.out.println(yourCardDraw);
                break;
            }
            case 5: {
                yourCardDraw = five;
                System.out.println(yourCardDraw);
                break;
            }
            case 6: {
                yourCardDraw = six;
                System.out.println(yourCardDraw);
                break;
            }
            case 7: {
                yourCardDraw = seven;
                System.out.println(yourCardDraw);
                break;
            }
            case 8: {
                yourCardDraw = eight;
                System.out.println(yourCardDraw);
                break;
            }
            case 9: {
                yourCardDraw = nine;
                System.out.println(yourCardDraw);
                break;
            }
            case 10: {
                yourCardDraw = ten;
                System.out.println(yourCardDraw);
                break;
            }
            case 11: {
                yourCardDraw = eleven;
                System.out.println(yourCardDraw);
                break;
            }
            case 12: {
                yourCardDraw = twelve;
                System.out.println(yourCardDraw);
                break;
            }
            case 13: {
                yourCardDraw = thirteen;
                System.out.println(yourCardDraw);
                break;
            }
        }
        System.out.println("Here's the computer card: ");  
        
        int computerCard = randomCard();
        String computerCardDraw ="";
        switch (computerCard) {
            case 1: {
                computerCardDraw = one;
                System.out.println(computerCardDraw);
                break;
            }
            case 2: {
                computerCardDraw = two;
                System.out.println(computerCardDraw);
                break;
            }
            case 3: {
                computerCardDraw = three;
                System.out.println(computerCardDraw);
                break;
            }
            case 4: {
                computerCardDraw = four;
                System.out.println(computerCardDraw);
                break;
            }
            case 5: {
                computerCardDraw = five;
                System.out.println(computerCardDraw);
                break;
            }
            case 6: {
                computerCardDraw = six;
                System.out.println(computerCardDraw);
                break;
            }
            case 7: {
                computerCardDraw = seven;
                System.out.println(computerCardDraw);
                break;
            }
            case 8: {
                computerCardDraw = eight;
                System.out.println(computerCardDraw);
                break;
            }
            case 9: {
                computerCardDraw = nine;
                System.out.println(computerCardDraw);
                break;
            }
            case 10: {
                computerCardDraw = ten;
                System.out.println(computerCardDraw);
                break;
            }
            case 11: {
                computerCardDraw = eleven;
                System.out.println(computerCardDraw);
                break;
            }
            case 12: {
                computerCardDraw = twelve;
                System.out.println(computerCardDraw);
                break;
            }
            case 13: {
                computerCardDraw = thirteen;
                System.out.println(computerCardDraw);
                break;
            }
        }
        System.out.println("The computer will river 5 cards random");
        System.out.println("The contestant who will have the maximum matches will win the game!");
        int yourScore = 0;
        int computerScore = 0;

        for(int i = 0; i <= 4; i++) {
            int randomCardComputer = randomCard();
            switch (randomCardComputer) {
                case 1: {
                    computerCardDraw = one;
                    System.out.print(computerCardDraw);
                    break;
                }
                case 2: {
                    computerCardDraw = two;
                    System.out.print(computerCardDraw);
                    break;
                }
                case 3: {
                    computerCardDraw = three;
                    System.out.print(computerCardDraw);
                    break;
                }
                case 4: {
                    computerCardDraw = four;
                    System.out.print(computerCardDraw);
                    break;
                }
                case 5: {
                    computerCardDraw = five;
                    System.out.print(computerCardDraw);
                    break;
                }
                case 6: {
                    computerCardDraw = six;
                    System.out.print(computerCardDraw);
                    break;
                }
                case 7: {
                    computerCardDraw = seven;
                    System.out.print(computerCardDraw);
                    break;
                }
                case 8: {
                    computerCardDraw = eight;
                    System.out.print(computerCardDraw);
                    break;
                }
                case 9: {
                    computerCardDraw = nine;
                    System.out.print(computerCardDraw);
                    break;
                }
                case 10: {
                    computerCardDraw = ten;
                    System.out.print(computerCardDraw);
                    break;
                }
                case 11: {
                    computerCardDraw = eleven;
                    System.out.print(computerCardDraw);
                    break;
                }
                case 12: {
                    computerCardDraw = twelve;
                    System.out.print(computerCardDraw);
                    break;
                }
                case 13: {
                    computerCardDraw = thirteen;
                    System.out.print(computerCardDraw);
                    break;
                }
            }
                if(randomCardComputer == yourCard) {
                    yourScore ++;
                }  else if (randomCardComputer == computerCard) {
                    computerScore++;
                }
        }
        System.out.println("\nYour score is : " + yourScore);
        System.out.println("Computer score is: " + computerScore);

        if (yourScore > computerScore) {
            System.out.println("\nYou win with " + (yourScore - computerScore) + " points");
        } else if(yourScore < computerScore) {
            System.out.println("The computer wins with " + (computerScore - yourScore) + " points");
        }
        else {
            System.out.println("Nobody wins");
        }
    }
    /**
     * Function name randomCard
     * 
     * @return number range 1 -13 
     * 
     * Inside the function:
     * 1. yields a random number range 1-13 (int)
     * 2. return the numer
     * 
     */
    public static int randomCard () {
        double rand = Math.random();
        rand = rand * 13;
        rand = rand + 1;
        int card = (int) rand;
        return card;
    }
}
/*
 * range 0.0001 - 0.9999
 * range 0.0001 - 12.9999
 * range 1.0001 = 13.9999
 * range 1 - 13 int
 * 
 */