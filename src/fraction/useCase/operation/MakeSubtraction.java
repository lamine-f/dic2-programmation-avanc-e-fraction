package fraction.useCase.operation;

import fraction.Fraction;

public class MakeSubtraction {

    public static Fraction execute (Fraction leftFraction, Fraction rightFraction) {
        boolean isSameDenominator = leftFraction.getDenominator() == rightFraction.getDenominator();
        Fraction clonedRightFraction = rightFraction.deepClone();
        clonedRightFraction.setNumerator( clonedRightFraction.getNumerator() * -1 );
        if (isSameDenominator)
            return Operation.sum(leftFraction.deepClone(), clonedRightFraction );
        return Operation.reduceBeforeSum(leftFraction.deepClone(), clonedRightFraction);
    }
}
