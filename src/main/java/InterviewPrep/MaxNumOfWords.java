package InterviewPrep;

public class MaxNumOfWords {

    public  static int mostWordsFound(String[] sentences) {

        int maxWords=0;
           int i;
        for (i=0; i <= sentences[i].length(); i++) {

            int j;
            for (j = 1; j < sentences[j].length(); j++) {

                sentences[j].split(" ");
               maxWords++;
            }
        }
            maxWords = Math.max(sentences[i].length(), maxWords);

        return maxWords;
    }


    public static void main(String[] args) {


        String[] sentences = {"i think so too", "this is great thanks very much"};

        System.out.println("max number of words" + mostWordsFound(sentences));
    }
}
