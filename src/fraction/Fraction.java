package fraction;

import fraction.exceptions.ZeroOnDenominatorException;

import java.util.Objects;

/**
 * La classe Fraction représente un nombre rationnel sous la forme d'un quotient de deux entiers.
 * Elle permet de manipuler des fractions en conservant leur forme mathématique et garantit
 * que le dénominateur est toujours positif.
 *
 * <p>Le numérateur (numerator) est la dividende et peut être un entier relatif.
 * Le dénominateur (denominator) est le diviseur et doit être un entier strictement positif.
 * Si le dénominateur fourni est négatif, il sera automatiquement rendu positif.
 *
 * <p>Contrainte :
 *  - Le dénominateur ne peut pas être nul. Si un dénominateur nul est fourni, une exception
 *    sera levée pour éviter la division par zéro.
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) throws ZeroOnDenominatorException {
        if (denominator == 0) throw new ZeroOnDenominatorException();
        if (denominator < 0) {
            setNumerator(numerator * -1);
            this.denominator = denominator * -1;
        }else {
            this.denominator = denominator;
        }
    }

    public Fraction ( int numerator, int denominator ) throws ZeroOnDenominatorException {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public Fraction deepClone () {
        try {
            return new Fraction(numerator, denominator);
        } catch (ZeroOnDenominatorException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}