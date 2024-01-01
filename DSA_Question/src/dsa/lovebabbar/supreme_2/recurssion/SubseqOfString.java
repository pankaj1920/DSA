package dsa.lovebabbar.supreme_2.recurssion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubseqOfString {
    public static void main(String[] args) {

        String str = "abc";

        findSubSeq(str);

        System.out.println( findSubSeqList(str));;
    }

    private static ArrayList<String> findSubSeqList(String str) {
        ArrayList<String> outputStrList = new ArrayList<>();
        int index = 0;
        String outputStr = "";

        subSeqList(str, outputStr, outputStrList, index);
        return outputStrList;
    }

    private static void subSeqList(String str, String outputStr, ArrayList<String> outputStrList, int index) {

        if (index >= str.length()) {
            outputStrList.add(outputStr);
            return;
        }

        char word = str.charAt(index);
        subSeqList(str, outputStr, outputStrList, index + 1);
        outputStr += word;
        subSeqList(str, outputStr, outputStrList, index + 1);
    }

    private static void findSubSeq(String str) {

        String outputStr = "";
        int index = 0;

        subSeq(str, outputStr, index);
    }

    private static void subSeq(String str, String outputStr, int index) {
        if (index >= str.length()) {
            System.out.println("=> " + outputStr);
            return;
        }
        char word = str.charAt(index);
        //exclude
        subSeq(str, outputStr, index + 1);
        outputStr += word;
        subSeq(str, outputStr, index + 1);
    }
}
