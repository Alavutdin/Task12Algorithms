package Lesson12.task2.task1;

public class Solution {
    // Пузырьковая сортировка
    public static void main(String[] args) {
        int [] array= new int[]{5,7,1,2,9,0,3};
        dubbleSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }


    }
    public static void dubbleSort(int[] array){
        boolean finish;
        do {
            finish=true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i]>array[i+1]){
                    int temp = array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    finish=false;
                }
            }
        }while (!finish);



    }
}
