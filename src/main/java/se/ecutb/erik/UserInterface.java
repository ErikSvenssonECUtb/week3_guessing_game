package se.ecutb.erik;

public class UserInterface {

    private NumberGame game;
    private boolean winner;

    public UserInterface(NumberGame game){
        this.game = game;
    }

    public void run(){
        while(!winner & game.getGuessAmount() <= game.getMaxGuesses()){
            System.out.println("Guess " + game.getGuessAmount() + "/" + game.getMaxGuesses());
            System.out.println("Guess a number");
            int guess = UserInput.getInt();
            winner = game.guess(guess);
        }
    }
}
