public class linear{
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50,60};
        int target = 50;
        int result = ls(arr, target);
        System.out.println(target+ " is found at "+ result+" index");
    }

    public static int ls(int arr[],int target){
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
