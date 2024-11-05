package fraction.exceptions;

public class AlreadyReducedToTheSameDenominatorException extends RuntimeException {
    public AlreadyReducedToTheSameDenominatorException() {
        super("Les deux fractions ont déja le même dénominateur.");
    }
}
