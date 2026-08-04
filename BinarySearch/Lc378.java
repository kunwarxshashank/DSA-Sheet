class Solution {

    public int findCount(int [][] arr, int mid){
        int n = arr.length-1; // 1
        int m = arr[0].length-1; // 1
        int low = arr[0][0]; // 1
        int high = arr[n][m]; // 3
        int col = 0; // 
        int row = m; // 1
        int count = 0;

        while(row>=0 && col <= m){
            if(arr[row][col]>mid){
                // remove the row
                row --;
            }else if(arr[row][col]<=mid){
                // pura col count kro
                count += row+1;
                col ++;
            }
        }

        return count;
    }

    public boolean checkExistinMatrix(int [][] arr, int target){
        int row = arr.length-1;
        int col =0;

        while(row>=0 && col <=arr[0].length-1){
            if(arr[row][col]>target){
                // delete the row
                row--;
            }else if(arr[row][col]<target){
                // delete the col
                col++;
            }else{
                return true;
            }
        }
        return false;
    }
    


    public int kthSmallest(int[][] arr, int k) {
        int n = arr.length-1; // 1
        int m = arr[0].length-1; // 1
        int low = arr[0][0]; // 1
        int high = arr[n][m]; // 3
        int col = 0;
        int row = m;
        int count = 0;
        int mid = 0;

       
        while(low < high){
            mid = low+(high-low)/2;
            count = findCount(arr, mid); // 3 2 
            if(count < k){
                low = mid + 1;
            }else{
                high = mid;
            }

        }

        return low;
    }
}