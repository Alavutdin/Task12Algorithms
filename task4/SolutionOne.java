package Lesson12.task2.task4;

/*1. Реализуйте метод, принимающий в качестве аргументов
двумерный массив.
Метод должен проверить что длина строк и столбцов с одинаковым
индексом одинакова, детализировать какие строки со столбцами
не требуется.*/
public class SolutionOne {
    public static void main(String[] args) {
        int [][] ints = new int[3][];
        ints[0]=new int []{1,2,3,4};
        ints[1]=new int []{1};
        ints[2]=new int []{1,2,3};

        try {
            System.out.println(isArraySquared(ints));
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Exist");
    }
    public static boolean isArraySquared(int [][]array){
        try {
            if (array == null) {
                throw new NullPointerException();
            }
            for (int[] ints : array) {
                if (ints.length != array.length) {
                    throw new RuntimeException();
                }
            }
        } catch (RuntimeException e) {
            return false;
        }
        return true;
    }
}
