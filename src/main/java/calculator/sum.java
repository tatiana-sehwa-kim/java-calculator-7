package calculator;

import java.util.ArrayList;

public class sum {

    public int sum(ArrayList<String> list) {
        int total = 0;
        for (String s : list) {
            total += Integer.parseInt(s);
        }
        return total;
    }
}
