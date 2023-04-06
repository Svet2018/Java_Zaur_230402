package src.finalStatic;
import java.util.Arrays;
import java.util.Random;

public class ArrayClass {
    public static void main(String[] args) {



    int [] array = {1,2,3};
        System.out.println(array.length);

    int [] arraye;
    arraye = new int []{3,4,5};
        System.out.println(arraye[1]);

    int [] array4 = new int []{23,33,4};

    String[] array1 = new String[3];
    for (int i = 0; i < array1.length; i++){
        array1[i] = "privet" + i;
        System.out.println(array1[i]);
    }
        System.out.println();

    int[][] array2;
    array2 = new int[3][];
    array2[0] = new  int[5];
    array2[1] = new  int[2];
    array2[2] = new  int[7];

    for (int i = 0; i < array2.length; i++){
        for (int j = 0; j < array2[i].length; j++){
            array2[i][j] = i + j;
            System.out.println("array2["+ i + "]["+ j + "] = " + array2[i][j]);
        }
        System.out.println("-------------------");
    }

    int arr[] = {1,9,3,-8,0,5,4,1};
    for (int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
        System.out.println();
   //Метод сортировки массива
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
        System.out.println();

    //Метод поиска определенного значения в
        // массиве, работает только с отсортированными массивами
        //если элемент не найден возвращается отрицательное число
    int index1 = Arrays.binarySearch(arr, 0);
        System.out.println(index1);


        maxMin();


        //программка сортировки массива
        int[] aray = {5,8,1,-3,0,8,2,2};
        sortirovka(aray);
    }

    public static void maxMin(){
        int max = 0;
        int min = 1000;
        Random random = new Random();
        Random ind = new Random();
        int[] arr;
        arr = new int[random.nextInt(2,15)];

        System.out.println("arr[0] " + arr[0]);
        for (int i = 0; i < arr.length; i++){
            arr[i] = ind.nextInt(100);
            if (max <= arr[i]) {
                max = arr[i];
            }
            if (min >= arr[i]) {
                min = arr[i];
            }

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("arr.length " + arr.length);
        System.out.println(max + " " + min);
    }

    public static int[] sortirovka(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }

        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        return array;

    }

}
