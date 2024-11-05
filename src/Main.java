import fraction.Fraction;
import fraction.exceptions.ZeroOnDenominatorException;
import fraction.useCase.DoInversion;
import fraction.useCase.operation.MakeAddition;
import fraction.useCase.operation.MakeSubtraction;

public class Main {

    public static void main(String[] args) {
        try {
            Fraction f1 = new Fraction(1, 2);
            Fraction f2 = new Fraction(-3, 2);
            System.out.printf("f1 = %s\n" , f1);
            System.out.printf("f2 = %s\n" , f2);
            DoInversion.execute(f2);
            System.out.printf("Inversion de f2      : f2 = %s  \n", f2);
            System.out.printf("Addition de f1 et f2 : f3 = %s + %s = %s \n", f1, f2, MakeAddition.execute(f1, f2));
            System.out.printf("f1 soustrait de f2   : f4 = %s - %s = %s \n", f1, f2, MakeSubtraction.execute(f1, f2));
        } catch (ZeroOnDenominatorException e) {
            System.out.println(e.getMessage());
        }
    }
}