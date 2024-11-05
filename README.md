# Gestion des Fractions

## Structure des Classes
Les classes principales du projet incluent :
- **Main** : Point d'entrée du programme.
- **fraction.Fraction** : Représente une fraction avec un numérateur et un dénominateur.
- **fraction.exceptions.ZeroOnDenominatorException** : Exception levée lorsqu'un dénominateur nul est détecté.
- **fraction.useCase.DoInversion** : Classe pour inverser une fraction.
- **fraction.useCase.DoSimplification** : Classe pour simplifier une fraction.
- **fraction.useCase.ReduceToTheSameDenominator** : Classe pour réduire deux fractions à un même dénominateur.
- **fraction.useCase.operation.MakeAddition** : Classe pour additionner deux fractions.
- **fraction.useCase.operation.MakeSubtraction** : Classe pour soustraire deux fractions.

## Fonctionnalités
- **Addition et Soustraction** : Permet d'additionner ou de soustraire deux fractions en ajustant leurs dénominateurs si nécessaire.
- **Inversion** : Inverse une fraction en échangeant numérateur et dénominateur.
- **Simplification** : Simplifie une fraction en divisant son numérateur et son dénominateur par leur PGCD.
- **Gestion des Erreurs** : Empêche l'utilisation de dénominateurs nuls, avec des exceptions appropriées.

## Utilisation
1. Compilez les fichiers :
   ```bash
   javac Main.java fraction/*.java
   ```
2. Exécutez le programme :
   ```bash
   java Main
   ```

## Conclusion
Ce projet démontre la gestion des fractions en Java avec une approche orientée objet, incluant l'encapsulation et une gestion robuste des exceptions.