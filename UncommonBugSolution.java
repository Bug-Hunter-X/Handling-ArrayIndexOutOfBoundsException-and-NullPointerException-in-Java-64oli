public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            //Check array bounds
            if (0 <= 5 && 5 < arr.length) {
                System.out.println(arr[5]);
            } else {
                System.out.println("Index out of bounds!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        String str = null;
        try {
            //Null check before accessing length
            if(str != null){
                System.out.println(str.length());
            }else{
                System.out.println("String is null!");
            }
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}