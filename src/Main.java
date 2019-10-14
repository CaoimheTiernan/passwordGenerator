import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {

        Dictionary dictionary = new Dictionary();
        try{
            dictionary.addWords();
            Presenter presenter = new Presenter();
            int[] lengthAndNumWords = presenter.getUserInput();
            Chooser chooser = new Chooser(dictionary.getWordsOfLength(lengthAndNumWords[LengthOrNumOfWords.LENGTH_OF_WORDS.ordinal()]));
            String[] choosenWords = chooser.chooseNumRandomWords(lengthAndNumWords[LengthOrNumOfWords.NUMBER_OF_WORDS.ordinal()]);
            presenter.presentNewPassword(choosenWords);

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
