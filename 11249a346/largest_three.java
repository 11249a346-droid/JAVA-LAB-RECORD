public class largest_three {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 15;

        if (a >= b && a >= c) {
            System.out.println(a + " is largest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + "is largest number.");
        } else {
            System.out.println(c + "is largest number.");
        }
    }

}
