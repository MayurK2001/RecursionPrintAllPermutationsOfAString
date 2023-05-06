public class Main {
    public static void main(String[] args) {
        System.out.println("All subsequences:");
        subSequences("ABC", 0, "");
        System.out.println("--------------------");
        System.out.println("All permutations:");
        printAllPermutations("ABC", 0);
    }
    static void printAllPermutations(String s, int i){
        if(i == s.length()-1){
            System.out.println(s);
            return;
        }
        for(int j = i ; j < s.length() ; j ++){
            s = swap(s, i, j);
            printAllPermutations(s, i+1);
            s = swap(s, i, j); // IMP --> Backtracking
        }
    }
    static void subSequences(String s, int i, String curr){
        if(i == s.length()) {
            System.out.println(curr);
            return;
        }
        subSequences(s, i+1, curr);
        subSequences(s, i+1, curr+s.charAt(i));
    }
    static String swap(String s, int i, int j){
        char []arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
}