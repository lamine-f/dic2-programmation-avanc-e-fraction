package fraction.exceptions;

public class DifferentDenominatorsAdditionException extends RuntimeException {
    public DifferentDenominatorsAdditionException() {
        super("Les deux fractions doivent avoir le même dénominateur.");
    }
}
