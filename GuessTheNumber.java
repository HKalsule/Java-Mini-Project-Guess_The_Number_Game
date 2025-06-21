import java.util.Scanner;
import java.util.Random;
class Game{

private int r;
private int k;
private int n;

    public Game(){
        Random random = new Random();
        r = random.nextInt(100);
        n = 0;
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Guess -> ");
        k = sc.nextInt();
        n++;
    }
    public boolean isCorrectNumber(){
        if(k>r){
            System.out.println("Too high! Try a smaller number.");
            return false;
        }
        else if(k<r){
            System.out.println("Too low! Try a larger number.");
            return false;
        }
        else{
            System.out.println("Thats Correct! You Guessed it finally :) \n");   
            return true;
        }
    }
    public int getAttempts(){
        return n;
    }
    public void yourScore(){
        if(n<=5){
            System.out.println("Damn Man You Are Good At This \n");
        }
        else if(n<=15){
            System.out.println("Seems Like I Need To Easy My Level \n");
        }
        else{
            System.out.println("Well That Poor But Try Again \n");
        }
    }
    public boolean PlayAgain(){
        System.out.println("1 -> Play Again.");
        System.out.println("2 -> Exit.");
        Scanner newbie = new Scanner(System.in);
        k = newbie.nextInt();
        if(k==1){
            return true;
        }
        else{
            return false;
        }
    }
    public void displayReplayMessage(boolean playAgain) {
    if (playAgain) {
        System.out.println("Ohh! So You Wanna Try Again? Let's Go!\n");
    } else {
        System.out.println("Game Over. Thanks for playing!");
    }
}

}
public class GuessTheNumber {
    public static void main(String[] args) {
        boolean playAgain = true;
        System.out.println("Welcome to 'Guess The Number' Game!");

        while (playAgain){

        Game g1 = new Game();
        boolean correct = false;

        while(!correct){
        g1.takeUserInput();
        correct = g1.isCorrectNumber();
        }
        System.out.println("You Guessed It In " + g1.getAttempts() + " Times.");
        g1.yourScore();
        playAgain = g1.PlayAgain();
        g1.displayReplayMessage(playAgain);
    }
}
}
