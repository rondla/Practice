package org.personal.dsa.arraysAndHashing;

import java.util.Arrays;

public class ContainsDuplicates {

    public static void main(String[] args) {

        int[] in = {1, 2, 3, 3};
        Arrays.sort(in);

        for (int i = 1; i < in.length; i++) {
            if (in[i] == in[i - 1]) {
                System.out.println(true);
                break;
            }
        }

    }
}
