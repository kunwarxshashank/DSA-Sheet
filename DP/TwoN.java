class TwoN{
    public static int recursion(int n) {
        // basecase me mera sabse lowst answer rhega

        if(n==1){
            return 2;
        }

        int ans = 2+recursion(n-1);
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = recursion(n);

        System.out.println(ans);
    }
}