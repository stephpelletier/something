import java.util.Scanner;

/**
 * Created by stephane on 2016-07-27.
 */
public class Main {

    public static void main(String [] args) {
        System.out.println("Hello Wordl!");

        Scanner inputScanner = new Scanner(System.in);
        boolean isLive = true;
        while(isLive){
            String input = inputScanner.next();



            if(input.equals("exit")) {
                isLive = false;
            }
        }

        System.out.println("Good bye");
    }
}
