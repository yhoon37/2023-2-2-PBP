import java.util.Scanner;


public class WordLength {
    public static void main(String[] args) {
        final WordSet wordSet = new WordSet();
        final Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            final String word = scanner.next();
            if(word.equalsIgnoreCase("QUIT")) break;

            wordSet.add(word);
        }
        scanner.close();

        System.out.println(wordSet.getLongestWord());
        System.out.println(wordSet.getShortestWord());
        System.out.println(wordSet.getWordCount());
        System.out.println(wordSet.getAverageLength());

    }
}

//WordLength 코드가 주어진ㄷ
//일련 단어를 입력받음 "Quit"문자열(대소문 구분없이 입력되면 출력하고 프로그램 중료
//동일 단어 중복 저장X, "Quit" 제외 단어는 대소문자 구분
//-출력
//1행: 가장 긴 단어
//2행: 가장 짧은 단어
//3행: 저장된 단어수; 동일 단어는 1개로 카운트
//4행: 단어 길이의 평균
//1,2,행 출렧시 단어가 여러개인 경우 입력 순서대로전부 출력

