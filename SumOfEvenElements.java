
class SumOfEvenElements {
    public static void main(String[] args) {
        int a[] = {10, 21, 30, 41, 50};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum = sum + a[i];
            }
        }

        System.out.println("Sum of even elements = " + sum);
    }
}
