package Practice1_Amazon;

public class CountTrailingZeroes {
    public static void main(String[] args) {
        System.out.println("Finding trailing zeroes in factorial of n");
        int n = 100;
        int count = 0, temp;
        for (int i = n; i > 0; i--) {
            if (i % 5 == 0) {
                temp = i;
                while (temp > 1 && temp % 5 == 0) {
                    temp = temp / 5;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
