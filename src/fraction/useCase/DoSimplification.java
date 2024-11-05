package fraction.useCase;

import fraction.Fraction;
import fraction.exceptions.ZeroOnDenominatorException;
import fraction.utils.NumberUtils;

public class DoSimplification {

    public static void execute (Fraction fraction) {
        int gcd = NumberUtils.GCD(fraction.getNumerator(), fraction.getDenominator());
        fraction.setNumerator( fraction.getNumerator() / gcd );
        try {
            fraction.setDenominator( fraction.getDenominator() / gcd );
        } catch (ZeroOnDenominatorException e) {
            throw new RuntimeException(e);
        }
    }

}
