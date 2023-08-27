package Lesson12.task2.task2;

public class SolutionTwo {
    public static void main(String[] args) {
        int [] array= new int[]{5,7,1,2,9,0,3};
        System.out.println(binarySearch(array,3,0,array.length-1));
    }
    public static int binarySearch(int [] array, int value, int min, int max){
        int midpoint;

        if(max<min){
            return  -1;
        }else {
        midpoint= (max-min)/2+min;
    }
        if (array[midpoint]<value){
            return binarySearch(array,value,midpoint+1,max);
           }else{
            if (array[midpoint]>value){
                return binarySearch(array, value, min,midpoint-1);
            }else{
                return midpoint;
            }
            }
    }

}
