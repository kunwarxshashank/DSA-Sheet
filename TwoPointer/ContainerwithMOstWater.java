class Solution {
    public int maxArea(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int h = 1;
        int max = 0;

        while(i<j){
            int diff = j-i;
            h = Math.min(arr[i], arr[j]);
            max = Math.max(max, diff*h);
            if(arr[i]<arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}