import doublyLinkedList.DoublyLinkedList;
import doublyLinkedList.QuickSort;

public class main {
    public static DoublyLinkedList list = new DoublyLinkedList();

    public static void main(String[] args){
        list.addFirst(5);
        list.addLast(1);
        list.addLast(4);
        list.addLast(2);
        list.addLast(8);
        list.addLast(9);

        int cont = 0;

        while(cont < list.length()){
            System.out.println(list.findItem(cont));
            cont++;
        }


        //BubbleSort.bubbleSort(bubble);
        QuickSort.quickSort(list);

        cont = 0;

        while(cont < list.length()){
            System.out.println(list.findItem(cont));
            cont++;
        }

    }

}
