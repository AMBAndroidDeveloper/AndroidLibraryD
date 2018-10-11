package moumita_enterprise.com.statlib;

import java.util.Collection;
import java.util.Iterator;

public class CentralTendency {
    public static Number arithmeticMean(Collection<? extends Number> numbers) {
        Iterator<? extends Number> iterator = numbers.iterator();
        Number firstNumberInCollection = iterator.next();
        if (firstNumberInCollection instanceof Integer) {
            return countMeanInt(numbers);
        } else if (firstNumberInCollection instanceof Long) {
            return countMeanLong(numbers);
        }
        return countMeanDouble(numbers);
    }

    private static Number countMeanLong(Collection<? extends Number> numbers) {
        double result = 0;
        for (Number number : numbers) {
            result += number.longValue();
        }
        return result;
    }

    private static Number countMeanDouble(Collection<? extends Number> numbers) {
        double result = 0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return result;
    }

    private static Number countMeanInt(Collection<? extends Number> numbers) {
        double result = 0;
        for (Number number : numbers) {
            result += number.intValue();
        }
        return result;
    }
}
