package doublyLinkedList;

public class BubbleSort {
    public static DoublyLinkedList bubbleSort(DoublyLinkedList list)
    {
        int swap, i;
        NodeD current;
        NodeD tempNode = null;

        // Checking for empty list
        if (list.find(0) == null)
            return null;

        do
        {
            swap = 0;
            current = list.find(0);

            while (current.getNext() != tempNode)
            {
                if ((Integer) current.getItem() > (Integer) current.getNext().getItem())
                {
                    int t = (Integer) current.getItem();
                    current.setItem(current.getNext().getItem());
                    current.getNext().setItem(t);
                    swap = 1;
                }
                current = current.getNext();
            }
            tempNode = current;
        }
        while (swap != 0);
            return list;
    }
}
