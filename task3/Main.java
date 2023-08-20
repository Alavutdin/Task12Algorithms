package Lesson12.task2.task3;

public class Main {
    public static void main(String[] args) {

//  К уроку №3. Разворот двусвязного списка
//        DList list = new DList();
//        for (int i = 1; i <= 5; i++) {
//            list.pushFront(i);
//        }
//        list.print();
//        list.reverse();
//        list.print();

//  К уроку №4. Полноценное левостороннее красно-черное дерево.
        int[] array = new int[]{5, 7, 10, 3, 6, 20, 25, 35, 45, 55, 1, 2, 4, 30, 31};
        RedBlackTree tree = new RedBlackTree();
        for (int item : array) {
            tree.insert(item);
            System.out.println("insert");
        }
    }
}
