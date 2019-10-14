import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chooser {
 private  List<String> words;
    Chooser(List<String> words){
        this.words = words;
    }

    String[] chooseNumRandomWords(int numberOfWords){
        String[] arrayOfWords = new String[numberOfWords];
        Random rand = new Random();

        for(int i = 0; i < numberOfWords; i++){
            int chosenWord = rand.nextInt(words.size());
            arrayOfWords[i] = words.get(chosenWord);
        }
        return arrayOfWords;
    }
}
