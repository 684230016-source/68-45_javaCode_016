package Loop;
import java.util.Random;
import java.util.Scanner;
public class W13_01_GuessNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random xd = new Random();

        int ans = xd.nextInt(10) + 1;

        //System.out.println("Random number is generated" + ans);

        int count = 0;
        boolean win = false;
        //Loop until the guesses the correct number
        while (count  < 3) { 
            System.out.println("Enter number");
            int number = kb.nextInt();
            
            if (ans == number) {
                System.out.println("Correct You've guessed the number");
                System.out.println("==================WIN==================");
                win = true;
                break;
            }else{
                System.out.println("Incorrect guss Try again");
                System.out.println("==================LOSE==================");
            }
            count++;
        }
        if(win == false)
        System.out.println("Game Over The correct number was" + ans);
        kb.close();
    }
}
