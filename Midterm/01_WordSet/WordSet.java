import java.util.ArrayList;
import java.util.List;

public class WordSet {
    private final List<String> words = new ArrayList<>();
    public WordSet(){};
    public void add(String word){
        if(!words.contains(word)){
            words.add(word);
        }
    }

    public String getLongestWord(){
        final List<String> result = new ArrayList<>();
        int maxLength=0;
        for(String word: words){
            if(maxLength < word.length()){
                maxLength = word.length();
                result.clear();
                result.add(word);
            }
            else if(maxLength == word.length()){
                result.add(word);
            }
        }
        String msg ="";
        for(String word: result){
            msg = msg + word+ " ";
        }
        return msg;

    }

    public String getShortestWord(){
        final List<String> result = new ArrayList<>();
        int minLength=0;
        if(!words.isEmpty()) minLength = words.get(0).length();

        for(String word: words){
            if(minLength > word.length()){
                minLength = word.length();
                result.clear();
                result.add(word);
            }
            else if(minLength == word.length()){
                result.add(word);
            }
        }
        String msg ="";
        for(String word: result){
            msg = msg + word+ " ";
        }
        return msg;
    }

    public int getWordCount(){
        return words.size();
    }

    public double getAverageLength(){
        double sum = 0.0;
        for(String word : words){
            sum +=  word.length();
        }
        return sum/words.size();
    }
}
