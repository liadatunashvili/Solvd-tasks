import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {

        int[] array = {3,5,2,6,1};
        System.out.println(Arrays.toString(sort(array)));

    }


    public static int[] sort(int[] arr){

        if(arr.length == 1){
            return arr;
        }

        int middle = arr.length/2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }

        for (int i = 0; i < right.length ; i++) {
            right[i] = arr[i + middle];
        }

        int[] leftArray = sort(left);
        int[] rightArray =  sort(right);

        return merge(leftArray, rightArray);
    }


    public static int[] merge(int[] arrLeft, int[] arrRight){
        int[] finalArray = new int[arrRight.length + arrLeft.length];
        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < arrLeft.length && pointer2 < arrRight.length){

            if(arrLeft[pointer1] <= arrRight[pointer2]){
                finalArray[pointer1+pointer2] = arrLeft[pointer1];
                pointer1++;
            } else if (arrLeft[pointer1] > arrRight[pointer2]) {
                finalArray[pointer1+pointer2] = arrRight[pointer2];

                pointer2++;
            }

        }

        if(pointer2 < arrRight.length){
            for (int i = pointer2; i <arrRight.length ; i++) {

                finalArray[i+pointer1] = arrRight[i];
            }

        } else if (pointer1 < arrLeft.length) {
            for (int i = pointer1; i < arrLeft.length; i++) {
                finalArray[i+pointer2] = arrLeft[i ];

            }
        }

             return finalArray;
    }
}
