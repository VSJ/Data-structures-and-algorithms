package com.vishal.Datastructures;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vj028567 on 6/27/15.
 */
public final class MiscString {
    public static void isAnagram(String str1, String str2) {
        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();
        int str1Sum = 0, str2Sum = 0;
        if (str1 != null || str2 != null || str1.length() != str2.length()) {
            System.out.println("Strings => " + str1 + " and " + str2 + " are not anagrams");
        }
        else if (str1 == str2) {
            System.out.println("Strings => " + str1 + " and " + str2 + " are anagrams");
        }
        else {
            for (int i = 0; i < str1CharArray.length; i++) {
                str1Sum+= str1CharArray[i];
                str2Sum+= str2CharArray[i];
            }
            if (str1Sum != str2Sum)
                System.out.println("Strings => " + str1 + " and " + str2 + " are not anagrams");
            else {
                System.out.println("Strings => " + str1 + " and " + str2 + " are anagrams");
            }
        }
    }
    static public void countCharsForAnagram(String str1, String str2) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String str1 = br.readLine();
        //String str2 = br.readLine();
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] str1CharArray = str1.replaceAll("\\s+","").toCharArray();
        char[] str2CharArray = str2.replaceAll("\\s+","").toCharArray();
        int noOfCharacters = 0;
        for (int i = 0; i < str1CharArray.length; i++) {
            Object value = charCountMap.get(str1CharArray[i]);
            if (value != null) {
                charCountMap.put(str1CharArray[i], charCountMap.get(str1CharArray[i]) + 1);
            } else {
                charCountMap.put(str1CharArray[i], 1);
            }
        }
        for (int i = 0; i < str2CharArray.length; i++) {
            Object value = charCountMap.get(str2CharArray[i]);
            if (value != null) {
                charCountMap.put(str2CharArray[i], charCountMap.get(str2CharArray[i]) - 1);
            } else {
                charCountMap.put(str2CharArray[i], -1);
            }
        }
        for (int value : charCountMap.values()) {
            if (value != 0) {
                value = Math.abs(value);
                for (int i = 0; i < value; i++)
                    noOfCharacters++;
            }
        }

        System.out.println(noOfCharacters);
    }

}
