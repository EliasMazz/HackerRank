import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        int K = 3;

        int[] A = {3, 8, 9, 7, 6};


        for (int i = 0; i < K; i++) {
            A = rotateArray(A);
        }

        System.out.println(Arrays.toString(A));


    }

    public static int[] rotateArray(int[] A) {

        int[] newArray = new int[A.length];

        for (int x = 0; x <= A.length - 1; x++) {
            newArray[(x + 1) % A.length] = A[x];
        }

        return newArray;
    }
}

