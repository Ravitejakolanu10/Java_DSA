public class binary {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50,60};
        int target = 50;
        int result = bs(arr, target);
        System.out.println(target+ " is found at "+ result+" index");
    }

    public static int bs(int arr[],int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target ){
                low = mid + 1 ;
            }
            else if(arr[mid] > target ){
                high = mid - 1 ;
            }
        }
        return -1;
    }
}

