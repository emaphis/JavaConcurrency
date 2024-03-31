
package javathreads.ch02.example1;

/**
 * Factorial example 1
 * @author emaph
 */
public class Factorial {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.print(n + "! is ");
        int fact = 1;
        while (n > 1)
            fact *= n--;
        System.out.println(fact);
    }

}
