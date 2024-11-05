package fraction.useCase;

import fraction.Fraction;
import fraction.exceptions.ZeroOnDenominatorException;

public class DoInversion {

    public static void execute (Fraction fraction) throws ZeroOnDenominatorException {
        int lastNumerator = fraction.getNumerator();
        if (lastNumerator == 0) throw new ZeroOnDenominatorException();
        fraction.setNumerator(fraction.getDenominator());
        fraction.setDenominator(lastNumerator);
    }
}
