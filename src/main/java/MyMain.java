public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++){
            int a = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = a;
        }
        return arr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        int x = len - 2;
        int y = arr[x];
        return y;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        int counter = 0;
        int secondcounter = 0;

        int x = arr[0];
        int y = arr[1];
        double a = (double)Math.log(y) / Math.log(x);
        double b = (double)y/x;

        for(int i = 1; i < arr.length; i++){
            double z = Math.log(arr[i]) / Math.log(arr[i-1]);
            if(z == a) {
                counter = counter + 0;
            }
            else{
                counter = counter + 1;
            }
        }
        for(int i = 1; i < arr.length; i++){
            double z = (double)(arr[i]) / (arr[i-1]);
            if (z == b){
                secondcounter = secondcounter + 0;
            }
            else {
                secondcounter = secondcounter + 1;
            }
        }
        if (counter == 0 || secondcounter == 0){
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
