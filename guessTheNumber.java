package codeWithHarry;
import java.util.Random;
import java.util.*;

class Game{
    int userNum;
    int computerNum;
    int count;
    Scanner sc = new Scanner(System.in);

    public Game(){
        Random r = new Random();
        computerNum = r.nextInt(100);
    }
    public void takeUserInput(){
        System.out.print("Guess the number between 1 and 100 : ");
        userNum = sc.nextInt();
        isCorrectnumber();
       
    }
    public void isCorrectnumber(){
        if(userNum==computerNum){
            System.out.println("Congratulations! you guessed it right. Yes! The number was "+computerNum);
            setCount();
            getCount();
        }else if (userNum<computerNum){
            System.out.println("the Number you entered is smaller. try a bigger number Take another try...");
            setCount();
            getCount();
            takeUserInput();
        }else{
            System.out.println("the Number you entered is greater. try a smaller number. Take another try...");
            setCount();
            getCount();
            takeUserInput();
        }
    }
    public void setCount(){
        count++;
    }
    public void getCount(){
        System.out.println("The number of Guesses taken are: "+count);
    }
}

public class guessTheNumber {
    public static void main(String[] args) {
        Game G1 = new Game();
        // System.out.println(G1.computerNum);
        while(true){
            G1.takeUserInput();
            // G1.isCorrectnumber();
            if (G1.computerNum==G1.userNum){
                break;
            }
        }   
    }
}
