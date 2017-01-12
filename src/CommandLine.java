import java.util.Scanner;

/**
 * Created by WagnerMestrinho on 1/11/17.
 */
public class CommandLine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java Truth Serum");
        String one = scanner.next();
        String two = scanner.next();
        String three = scanner.next();
        String four = scanner.next();
        String five = scanner.next();

        System.out.println("----");

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);

        // start work of comparing

        boolean oneSameAsAnything = one.equals(two) || one.equals(three) || one.equals(four) || one.equals(five);
        boolean twoSameAsAnything = two.equals(one) || two.equals(three) || two.equals(four) || two.equals(five);
        boolean threeSameAsAnything = three.equals(one) || three.equals(two) || three.equals(four) || three.equals(five);
        boolean fourSameAsAnything = four.equals(one) || four.equals(two) || four.equals(three) || four.equals(five);
        boolean fiveSameAsAnything = five.equals(one) || five.equals(two) || five.equals(three) || five.equals(four);

        System.out.println("Java Don't Lies");

        System.out.println("1st checks out to be "+oneSameAsAnything);
        System.out.println("2nd checks out to be "+twoSameAsAnything);
        System.out.println("3rd checks out to be "+threeSameAsAnything);
        System.out.println("4th checks out to be "+fourSameAsAnything);
        System.out.println("5th checks out to be "+fiveSameAsAnything);
    }
}
