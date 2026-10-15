
class OddElements {
    public static void main(String[] args) {
        int a[] = {10, 21, 30, 41, 50};

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
