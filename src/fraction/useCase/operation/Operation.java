package fraction.useCase.operation;

import fraction.Fraction;
import fraction.exceptions.DifferentDenominatorsAdditionException;
import fraction.exceptions.ZeroOnDenominatorException;
import fraction.useCase.DoSimplification;
import fraction.useCase.ReduceToTheSameDenominator;

public abstract class Operation {

    protected static Fraction sum (Fraction leftFraction, Fraction rightFraction) {
        boolean isSameDenominator = leftFraction.getDenominator() == rightFraction.getDenominator();
        if (!isSameDenominator) throw new DifferentDenominatorsAdditionException();
        try {
            Fraction fraction = new Fraction(
                    leftFraction.getNumerator() + rightFraction.getNumerator(),
                    leftFraction.getDenominator()
            );
            DoSimplification.execute(fraction);
            return fraction;
        } catch (ZeroOnDenominatorException e) {
            throw new RuntimeException(e);
        }
    }

    protected static Fraction reduceBeforeSum (Fraction leftFraction, Fraction rightFraction) {
        ReduceToTheSameDenominator.execute(leftFraction, rightFraction);
        return sum(leftFraction, rightFraction);
    }

}