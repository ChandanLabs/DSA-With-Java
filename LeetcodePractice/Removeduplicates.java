class Removedplicates{
    public static int RemovedplicatesNumber(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int i = 0;
        for (int j = 1; j < arr.length ; j++) {
            if(arr[j] != arr[i]){
                i++;
                arr[j] = arr[i];
            }
            // return i + 1;
        }
         return i + 1;
        // return arr[i];
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4};
        int ans = RemovedplicatesNumber(arr);
        System.out.println(ans);
    }
}