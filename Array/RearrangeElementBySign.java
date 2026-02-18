public class RearrangeElementBySign {
    public  int[] reArrange(int arr[]) {

        int n = arr.length;
        int newarr[] = new int[n];
        int pindex = 0; int nindex=1;

        

        for (int i = 0; i < arr.length ; i++) {
            
            // add positive element to pindex = 0,2,4,6
            if(arr[i]>0){
                newarr[pindex] = arr[i];
                pindex += 2;
            }else{
                newarr[nindex] = arr[i];
                nindex +=2;

            }
            
        }

        return newarr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -4, -5, -6 };
        RearrangeElementBySign obj = new RearrangeElementBySign();
        int result[] = obj.reArrange(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
