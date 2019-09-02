package se.ecutb.erik;

public class NumberGame {

    //Nummer användaren ska gissa på
    private int secretNumber;
    //Antalet gissningar som gjorts
    private int guessAmount;
    //Max antal gissningar
    private int maxGuesses;

    public NumberGame(int secretNumber){
        this.secretNumber = secretNumber;
        guessAmount = 1;
        maxGuesses = 5;
    }

    public int getGuessAmount(){
        return guessAmount;
    }

    public int getMaxGuesses(){
        return maxGuesses;
    }

    public boolean guess(int guess){
        guessAmount ++;
        if(guess > secretNumber){
            System.out.println("Your number was too high");
            return false;
        }else if(guess < secretNumber){
            System.out.println("Your number was too low");
            return false;
        }else{
            System.out.println("You guessed correctly!!");
            return true;
        }
    }

}
