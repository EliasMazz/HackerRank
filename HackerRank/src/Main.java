import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 19,20, 21};

        Arrays.sort(array);

        int number = 0;

        for (int i = 0; i < array.length; i++) {
            if (array.length > i ) {
                if (array[i] + 1 == array[i + 1]) {
                    continue;
                } else {
                    number = array[i] + 1;
                    break;
                }
            }
        }

        System.out.println(number);
    }
}

