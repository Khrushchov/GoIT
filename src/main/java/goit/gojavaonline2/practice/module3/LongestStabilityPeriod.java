package goit.gojavaonline2.practice.module3;

import java.util.Arrays;
import java.util.List;

public class LongestStabilityPeriod {
    public int count(int[] gdp) {        int countMAX = 1;

        for (int i = 0; i < gdp.length; i++) {
            List<Integer> currentDif = Arrays.asList(-1, 0, 1);
            int count = 1;
            for (int j = i + 1; j < gdp.length; j++) {
                if (currentDif.contains(gdp[i] - gdp[j])) {
                    count++;
                    if (gdp[i] != gdp[j]) {
                        List<Integer> changeDif = Arrays.asList(0, gdp[i] - gdp[j]);
                        currentDif = changeDif;
                    }
                } else {
                    break;
                }
                countMAX = Math.max(countMAX, count);
            }
        }

        return countMAX;
    }
}
