import java.util.Scanner;

public class Presenter {
    private Scanner reader;
    Presenter(){
       reader = new Scanner(System.in);
    }

    public int[] getUserInput(){
       int[] lengthAndNumOfWords = new int[2];
        System.out.println("Choose length of words : ");
        lengthAndNumOfWords[(LengthOrNumOfWords.LENGTH_OF_WORDS).ordinal()] = reader.nextInt();
        System.out.println("Choose number of words in password");
       lengthAndNumOfWords[(LengthOrNumOfWords.NUMBER_OF_WORDS.ordinal())] = reader.nextInt();
        reader.close();
        return lengthAndNumOfWords;
    }

    public void presentNewPassword(String[] words){
        String password = "";
        for(int i = 0; i < words.length; i++){
            if(i > 0){
                password += "-";
            }
            password += words[i];
        }

        System.out.println("Your new password is :");
        System.out.println(password);
    }





}
