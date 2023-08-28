package InterviewPrep.list;


import static org.apache.commons.lang3.StringUtils.split;

import java.util.ArrayList;
import java.util.Arrays;

public class SOLUTION1 {
        public static int mostWordsFound(String[] sentences) {

            int maxWords=0;

            for(int i = 0; i < sentences.length; i++)
            {
                maxWords=Math.max(maxWords,(sentences[i].split(" ")).length);

            }
            return maxWords;
    }

    public static void main(String args[])
    {

        String[] list = new String[3];
        list[0] = "Hello Hi";
        list[1] ="Good morning how do you do";
        list[2] ="Good morning how do you";
        System.out.println(mostWordsFound(list));


    }
}
