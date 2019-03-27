package markcalculationexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class MarkCalculator {


    public static  List<String> readFromFile( String filename) throws Exception{

        List<String>  lines =new ArrayList<>();
        BufferedReader b= new BufferedReader(
                new FileReader(
                        new File(filename))) ;

        String line=null;
        while ((line=b.readLine() )!=null){
            //System.out.println(line);
            lines.add(line);

        }

        return lines;

    }


    static Map<String,AnswerKey > createAsnwerKeyMap(List<String> answerKeylines){
        Map<String,AnswerKey > answerKeyMap = new HashMap<>();
        for (String x : answerKeylines){
            String []  val =x.split(",");
            AnswerKey ans= new AnswerKey(val[0], val[1], Integer.parseInt(val[2]));
            answerKeyMap.put(ans.getQuestionNo(), ans);
        }
        return answerKeyMap;
    }


    static  Set<Answer> createAsnwerSheet(List<String> answerSheetlines){
       Set<Answer> answerSet= new HashSet<>();
        for (String x : answerSheetlines){
            String []  val =x.split(",");
            Answer ans= new Answer(val[0], val[1]);
            answerSet.add( ans);
        }
        return answerSet;
    }


    static int processAnswerSheet( Map<String,AnswerKey > ansMap ,  Set<Answer> ansSet){

        int total=0;
        for ( Answer a : ansSet){
            if (a.getAnswer().equals(((AnswerKey)ansMap.get(a.getQuestionNo())).getAnswer() )   ){
                total= total + ((AnswerKey)ansMap.get(a.getQuestionNo())).getMark();
            }
        }

        return total;
    }


    public static void main(String[] args) throws  Exception {

        List<String> answerKeylines = readFromFile("/Users/vijesh/markexample/answerkey.csv");
        List<String> answerSheetlines = readFromFile("/Users/vijesh/markexample/answersheet.csv");

        Map<String,AnswerKey > ansMap = createAsnwerKeyMap(answerKeylines);
        Set<Answer> ansSet =  createAsnwerSheet(answerSheetlines);


        int totalMark = processAnswerSheet(ansMap, ansSet );
        System.out.println(ansMap);
        System.out.println(ansSet);
        System.out.println(totalMark);

       }

}


class AnswerKey{

    private String questionNo;
    private String answer;
    private int mark;

    public AnswerKey(String questionNo, String answer, int mark) {
        this.questionNo = questionNo;
        this.answer = answer;
        this.mark = mark;
    }

    public String getQuestionNo() {
        return questionNo;
    }

    public String getAnswer() {
        return answer;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "AnswerKey{" +
                "questionNo='" + questionNo + '\'' +
                ", answer='" + answer + '\'' +
                ", mark=" + mark +
                '}';
    }
}


class Answer {


    private String questionNo;
    private String answer;

    public Answer(String questionNo, String answer) {
        this.questionNo = questionNo;
        this.answer = answer;
    }

    public String getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(String questionNo) {
        this.questionNo = questionNo;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "questionNo='" + questionNo + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}