package logos.hometask5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String enterSentence = sc.nextLine();
        String[] arrayWords = enterSentence.split(" ");
        int maxCounter = 0;
        String maxWord = null;
        for (String word : arrayWords) {
            int counter = 0;
            for(int i = 0; i<arrayWords.length; i++){
                if(arrayWords[i].equals(word)){
                    counter++;
                }
            }
            if(counter>maxCounter){
                maxCounter=counter;
                maxWord = word;
            }
        }
        System.out.println("Word " + maxWord + " is repeated " + maxCounter + " bouts");
    }
    }

