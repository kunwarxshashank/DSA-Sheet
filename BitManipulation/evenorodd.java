class evenorodd{
    public static void main(String[] args) {
        int n = 6; // [0 , 1, 1, 0]
        int bitmask = 1 << 0; // [0, 0, 0, 1]

        // [0, 1, 1, 0]
        // [0, 0, 0, 1]
        // [0, 0, 0, 0] Ans => 0

        if( (n&bitmask) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}