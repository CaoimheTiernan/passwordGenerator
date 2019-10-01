import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    private HashMap<Integer,List> listsByLength;
    public Dictionary(){
        listsByLength = new HashMap<>();
    }

    public void addWords() throws FileNotFoundException {
        File file = new File("words_alpha.txt");

        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
           String current = scanner.next();
           if(!listsByLength.containsKey(current.length())){
               List temp = new List();
               temp.add(current);
               listsByLength.put(current.length(),temp);
           }
           else{
               listsByLength.get(current.length()).add(current);
           }
        }

    }



}
