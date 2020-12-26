package emailapp;

import java.text.*;
import java.util.*;
import java.util.regex.*;

public class test_test {
    public static void main(String[] args) {
        String line = "<Amee>safat codes like a ninja</amee>";
        int ok = 1;
        int startTagPosition = 0;
        int printed = 0;
        int tagPosition;
        String insideTag;
        String searchTag;
        while (ok == 1){
            tagPosition = line.indexOf('/', startTagPosition);
            if (tagPosition != -1) {
                searchTag = line.substring(
                        tagPosition + 1,
                        line.indexOf('>', tagPosition)
                );

                if (startTagPosition +2 < line.indexOf('/', startTagPosition)) {
                    insideTag = line.substring(
                            line.lastIndexOf('<' + searchTag + '>') + searchTag.length() + 2,
                            line.indexOf("</" + searchTag + '>', startTagPosition)
                    );
                if (insideTag.indexOf("/") == -1 && insideTag.indexOf("<")==-1 && insideTag.indexOf(">")==-1) {
                        System.out.println(insideTag);
                        printed = 1;
                    }
                }
                startTagPosition = line.indexOf('/', startTagPosition) + searchTag.length() + 2;
            } else {
                ok = 0;
            }
        }
        if (printed==0){
            System.out.println("None");
        }
    }
}


