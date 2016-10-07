/**
 * This program is intended to have 3 slots used
 * to verify is someone wins or not, if not
 * they have the option to play again if they win
 * they get money added to their account
 */
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author SMJR
 */
public class Slots 
{
    
    public static void main(String[] args) 
    {
        double money = 0.0;
        double costPerGame = 1.50;
        Random randomString = new Random();
        String[] Slots =
        {"Cherry", "Oranges","Plums", "Bells", "Melons", "Bars"};
        Scanner input = new Scanner(System.in);
        
        //ask user how much money they want to enter
        System.out.println("----------------------\n"
                + "WELCOME TO THE SLOTS GAME!!!\n"
                + "-------------------------\n");
        
        System.out.print("How much money do you have:");
        money = input.nextDouble();
        //display how much $ you have
        System.out.println("You have " + money +
                " dollars to play");
        
        double totalWin = 0;
        totalWin += money;
        int endGame = 0;
        while (endGame != -1)
            //get random string for each slot
        {
        System.out.println("Type -1 if you want to quit "
                + "otherwise hit 0 and ENTER!");
        endGame = input.nextInt();
        int select1 = randomString.nextInt(Slots.length);
        int select2 = randomString.nextInt(Slots.length);
        int select3 = randomString.nextInt(Slots.length);
        String choice1 = Slots[select1];
        String choice2 = Slots[select2];
        String choice3 = Slots[select3];
        //display the random strings selected
        System.out.println("\n\nSlot 1 : " 
                + choice1 );
        System.out.println("Slot 2 : " 
                + choice2);
        System.out.println("Slot 3 : " 
                + choice3);
        
            if ((choice1.equals(choice2)) && (choice2.equals(choice3))
                && (choice1.equals(choice3)))
            {
            double three = 3.0;
            System.out.println("Great!! YOU just won 3x you "
                    + "MONEY!!");
            totalWin *= three; 
            money += totalWin;
            money -= costPerGame;
            System.out.printf("You have %.2f left\n", money);
            
            
            }
        else if ((choice1.equals(choice2)) || (choice3.equals(choice2)) ||
                (choice1.equals(choice3)))
            {
            double two = 2;
            System.out.println("Are Great!! YOU just won 2x you "
                    + "MONEY!!");
            totalWin *= two;
            money += totalWin;
            money -= costPerGame;
            System.out.printf("You have %.2f money left\n", money);                        
            }
        else
        {
            System.out.println("You did not win.");
            
            
            System.out.printf("You have %.2f left!\n", money);
            money -= costPerGame;
            
        }
            
        }
        System.out.printf("\nYou have %.2f dollars "
                + "\nAnd won %.2f From Slots!!\n See you soon!", money,
                totalWin);
    }
}