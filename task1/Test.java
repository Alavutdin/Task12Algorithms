package Lesson12.task2.task1;

public class Test {
    public static void main(String[] args) {
        int [] array = {7,45,8,1,2,9};
        getArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void getArray(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    int temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
    }
}
