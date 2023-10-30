package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Utils {

    public static int getMax(ArrayList<Integer> numbers) {
        return Collections.max(numbers);
    }

    public static ArrayList<String> toArrayList(String carNameInputs) {
        return new ArrayList<>(Arrays.asList(carNameInputs.split(",")));
    }
}
