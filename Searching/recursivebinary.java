public class recursivebinary {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50,60};
        int target = 50;
        int result = rbs(arr, target,0, arr.length-1);
        System.out.println(target+ " is found at "+ result+" index");
    }
    public static int rbs(int arr[], int target,int low ,int high){
        if(low > high){
            return -1;
        }
        int mid = (low + high) / 2;
        if(arr[mid]==target){
            return mid;
        }
        else if (arr[mid] < target ){
            return rbs(arr, target, mid+1, high);
        }
        else{
            return rbs(arr, target, low, mid-1);
        }
    }

}
