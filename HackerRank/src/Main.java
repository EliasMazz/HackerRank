import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        int binaryNumber = 32;
        char[] charArray = Integer.toBinaryString(binaryNumber).toCharArray();


        ArrayList<Integer> countGaps = new ArrayList<>();
        countGaps.add(0);


        int countZeros = 0;
        boolean firstOne = false;


        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '0') {
                countZeros++;
            } else {
                if (firstOne == true) {
                    countGaps.add(countZeros);
                    countZeros = 0;
                    firstOne = false;


                }
                firstOne = true;
            }
        }
    }
}

