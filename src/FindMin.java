public class FindMin {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,10,2};
        int result = finding(arr) ;
        System.out.println("min of array = "+ result);
    }

    private static int finding(int[] arr) {
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
