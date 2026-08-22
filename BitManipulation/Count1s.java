class Count1s {
    public static void main(String[] args) {
        int n = 11;
        int count = 0;
        while (n > 0) {
            int bit = n / 2;
            if (bit == 1) {
                count++;
            }

            n = n / 2;
        }

        System.out.println(count);

    }
}