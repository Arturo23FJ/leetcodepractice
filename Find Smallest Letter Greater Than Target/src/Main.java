public class Main {
    public static void main(String[] args) {
        char[] letters1 = {'c', 'f', 'j'};
        char[] letters2 = {'x', 'x', 'y', 'y'};

        System.out.println(nextGreatestLetter(letters1, 'a'));
        System.out.println(nextGreatestLetter(letters1, 'c'));
        System.out.println(nextGreatestLetter(letters2, 'z'));
    }

    public static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}