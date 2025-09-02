package Functions;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr1 = {2,5,7,89,10,20};
        int target = 20;
        System.out.println(Searchone(arr1, target));
    }
    static int Searchone(int[] arr, int key){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
