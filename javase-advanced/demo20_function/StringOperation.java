package demo20_function;

import java.util.function.Predicate;

public class StringOperation {
    public boolean stringJudge(String str) {
        return str.startsWith("张") && str.length() == 3;

    }
}
