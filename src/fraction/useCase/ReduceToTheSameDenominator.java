package fraction.useCase;

import fraction.Fraction;
import fraction.exceptions.AlreadyReducedToTheSameDenominatorException;
import fraction.exceptions.ZeroOnDenominatorException;

public class ReduceToTheSameDenominator {

    public static void execute (Fraction leftFraction, Fraction rightFraction) {
        if ( leftFraction.getDenominator() == rightFraction.getDenominator() ) throw new AlreadyReducedToTheSameDenominatorException();
        int newLeftFractionNumerator = leftFraction.getNumerator() * rightFraction.getDenominator();
        int newLeftFractionDenominator = leftFraction.getDenominator() * rightFraction.getDenominator();
        int newRightFractionNumerator = rightFraction.getNumerator() * leftFraction.getDenominator();
        int newRightFractionDenominator = rightFraction.getDenominator() * leftFraction.getDenominator();
        leftFraction.setNumerator(newLeftFractionNumerator);
        rightFraction.setNumerator(newRightFractionNumerator);
        try {
            leftFraction.setDenominator(newLeftFractionDenominator);
            rightFraction.setDenominator(newRightFractionDenominator);
        } catch (ZeroOnDenominatorException e) {
            throw new RuntimeException(e);
        }
    }
}
