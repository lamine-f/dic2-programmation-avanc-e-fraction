package fraction.useCase.operation;

import fraction.Fraction;

public class MakeAddition {

    public static Fraction execute (Fraction leftFraction, Fraction rightFraction) {
        boolean isSameDenominator = leftFraction.getDenominator() == rightFraction.getDenominator();
        if (isSameDenominator)
            return Operation.sum(leftFraction.deepClone(), rightFraction.deepClone());
        return Operation.reduceBeforeSum(leftFraction.deepClone(), rightFraction.deepClone());
    }
}
