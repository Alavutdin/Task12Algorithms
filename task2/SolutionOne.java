package Lesson12.task2.task2;

public class SolutionOne {
    public static void main(String[] args) {
        int [] array= new int[]{5,7,1,2,9,0,3};
        System.out.println(find(array,3));
    }

    public static int find(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
