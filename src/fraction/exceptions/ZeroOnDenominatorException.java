package fraction.exceptions;

public class ZeroOnDenominatorException extends Exception {
    public ZeroOnDenominatorException() {
        super("Le dénominateur ne doit pas être nul.");
    }
}
