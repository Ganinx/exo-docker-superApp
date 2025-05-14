package org.example;

import org.example.model.Calculatrice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length != 2) {
            System.err.println("❌ Erreur : Veuillez fournir exactement deux entiers en arguments!!!");
            System.err.println("➡️  Usage : java -jar maSuperAppJava.jar <entier1> <entier2>");
            System.exit(1);
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            Calculatrice calc = new Calculatrice();
            int resultat = calc.additionner(a, b);

            System.out.println("✅ Résultat : " + a + " + " + b + " = " + resultat);
        } catch (NumberFormatException e) {
            System.err.println("❌ Erreur : Les arguments doivent être des entiers valides.");
            System.exit(1);
        }
    }
}
