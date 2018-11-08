import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();
        int[] array = {1,1,2,2,3,3,4,4,6};

        for (int num : array) {
            boolean repeatedNumber = set.add(num);
            if(repeatedNumber == false) {
                set.remove(num);
            }
        }

        System.out.println(set.iterator().next());
    }
}

