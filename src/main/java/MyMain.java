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
        int a;
        int b;
        if (arr[0] > arr[1]){
            a = arr[0];
            b = arr[1];
        }
        else{
            a = arr[1];
            b = arr[0];
        }
        for (int i = 2; i < arr.length; i++){
            if ((arr[i] <= a) && arr[i] > b){
                b = arr[i];
            }
            if (arr[i] > a){
                b = a;
                a = arr[i];
            }
        }

        return b;

    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double[] a = new double[arr.length-1];
        for(int i = 0; i <arr.length -1; i++){
            a[i] = Double.valueOf(arr[i+1])/Double.valueOf(arr[i]);
        }
        int b = 0;
        for (int i = 1; i < a.length; i++){
            if (a[i] == a[i-1]){
                b+=1;
            }
        }
        if (b == a.length -1){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(reverse(null));
        System.out.println(secondLargest(null));
        System.out.println(isGeometric(null));

    
    }
}
