package Lesson12.task2.task1;

public class SolutionThree {
    // Сортировка вставками
    public static void main(String[] args) {
        int [] array= new int[]{5,7,1,2,9,0,3};
        insertSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
    public static void insertSort(int [] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
