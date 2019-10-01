import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
      Dictionary dictionary = new Dictionary();
        try{
            dictionary.addWords();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
