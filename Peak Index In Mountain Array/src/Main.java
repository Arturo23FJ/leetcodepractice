public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        int[] arr2 = {0, 2, 1, 0};
        int[] arr3 = {0, 10, 5, 2};

        System.out.println(peakIndexInMountainArray(arr));
        System.out.println(peakIndexInMountainArray(arr2));
        System.out.println(peakIndexInMountainArray(arr3));
    }

    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}