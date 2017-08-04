import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by Andriy_Yarish on 8/2/2017.
 */
public class InsertionSort {
    private int[] randomArr;

    public InsertionSort(int[] randomArr) {
        this.randomArr = randomArr;
    }

    public InsertionSort() {
        initArray();
    }


    public int[] sort() {

        Arrays.stream(randomArr).forEach(s -> System.out.print(s + ","));

        for(int j=1; j<randomArr.length; j++){
            int key = randomArr[j];
            int i=j-1;
            while (i>=0 && randomArr[i] > key){
                int temp = randomArr[i+1];
                randomArr[i+1]=randomArr[i];
                randomArr[i] = temp;
                i-=1;
            }
        }
        System.out.println("------->>>");
        Arrays.stream(randomArr).forEach(s -> System.out.print(s + ","));
        return randomArr;
    }


    private  void initArray(){
        int [] arr = new int[30];
        for(int i=0; i<30; i++)
            arr[i] = new Random().nextInt(100);
        randomArr = arr;
    }

    public int[] getRandomArr() {
        return randomArr;
    }
}


