class Hello {
    public static void main(String[] args) {
        System.out.println("ok");
        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.println((int)(n - i)/2);
            for (int j = 0; j < (n - i - 1) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
