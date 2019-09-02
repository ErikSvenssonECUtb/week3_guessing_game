package se.ecutb.erik;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        boolean keepAlive = true;

        do{
            NumberGame game = new NumberGame(5);
            UserInterface session = new UserInterface(game);
            session.run();
            System.out.println("Do you want to quit? (y/n)");
            switch(UserInput.getString().trim().toLowerCase()){
                case "y":
                    keepAlive = false;
                    System.out.println("Bye!");
                    break;

            }
        }while(keepAlive);
    }
}
