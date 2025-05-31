import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class uniquePermutation {
    
    static TreeSet<String> set = new TreeSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        input = new String(chars);

        generatePermutations("", input);
        
        for (String perm : set) {
            System.out.println(perm);
        }
    }

    public static void generatePermutations(String prefix, String remaining) {
        int n = remaining.length();
        if (n == 0) {
            set.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, n));
            }
        }
    }
}
