public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
            //To avoid the exception, add a check before accessing array elements
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }

        String str = null;
        try {
            System.out.println(str.length()); //NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
            //To avoid the exception, add a check before accessing the string length
            if(str != null){
                System.out.println(str.length());
            }
        }
    }
}