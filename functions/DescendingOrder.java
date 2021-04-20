package functions;

import java.util.Arrays;

public class DescendingOrder {
    public int sortDesc(final int num){
        int [] arrnum = new int[10];
        int i = 0;
        int wholeNum = num / 10;
        arrnum[i] = (num % 10);

        while (wholeNum > 0){
            i++;
            arrnum[i] = (wholeNum % 10);
            wholeNum /= 10;
        }

        Arrays.sort(arrnum);
        int number = 0;
        for (int j = arrnum.length - 1; j > 0 & i >= 0; j--, i--){
            number += arrnum[j] * Math.pow(10, i);
        }
        return number;
    }
}
