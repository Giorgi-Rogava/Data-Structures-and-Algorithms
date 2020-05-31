package Lafore.CHAPTER_4.Stacks_And_Queues.LISTING_4_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReverseApp {


    public static void main(String[] args) throws IOException {

        String input, output;

        while (true) {

            System.out.println("Enter a String: ");

            System.out.flush();

            input = getString();

            if (input.equals("")) {
                break;
            }

            Reverser theReverser = new Reverser(input);

            output = theReverser.doRev();

            System.out.println("Reversed: " + output);

        }

    }


    public static String getString() throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s = bufferedReader.readLine();

        return s;
    }


}
