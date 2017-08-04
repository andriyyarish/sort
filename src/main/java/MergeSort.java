import java.util.Arrays;
import java.util.Random;

/**
 * Created by andy on 8/3/2017.
 */
public class MergeSort extends AbstractSort {

    public MergeSort(int[] randomArr) {
        this.randomArr = randomArr;
    }

    public MergeSort() {
        initArray();
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(mergeSort.getRandomArr());
    }

    public int[] sort() {

        return null;
    }

    public int[] mergeSort(int[] list) {
        if (list.length <= 1) {
            return list;
        }
        //Split the array in half in two parts
            int[] left = new int[list.length / 2];
            int[] right = new int[list.length - left.length];

            System.arraycopy(list, 0, left, 0, left.length);
            System.arraycopy(list, left.length, right, 0, right.length);

            System.out.println("left:\n ");
            printArray(left);
            System.out.println("right\n");
            printArray(right);
        //Sort each half recursively
            mergeSort(left);
            mergeSort(right);
        //Merge both halves together, overwriting to original array
            merge(left, right, list);

            printArray(list);

        return list;
    }

    private void merge(int[] left, int[] right, int[] list) {
        //Index Position in first array - starting with first element
        int iLeft = 0;
        //Index Position in second array - starting with first element
        int iRight = 0;
        //Index Position in merged array - starting with first position
        int iMerged = 0;

        //Compare elements at iFirst and iSecond,
        //and move smaller element at iMerged
        while (iLeft < left.length && iRight < right.length){
            if(left[iLeft] < right[iRight]){
                list[iMerged] = left[iLeft];
                iLeft++;
            }else {
                list[iMerged] = right[iRight];
                iRight++;
            }
            iMerged++;
        }
        System.arraycopy(left, iLeft, list, iMerged, left.length - iLeft);
        System.arraycopy(right, iRight, list, iMerged, right.length - iRight);
    }


    private void initArray() {
        int[] arr = new int[30];
        for (int i = 0; i < 30; i++)
            arr[i] = new Random().nextInt(100);
        randomArr = arr;
        printArray(randomArr);
    }

    public int[] getRandomArr() {
        return randomArr;
    }
}
