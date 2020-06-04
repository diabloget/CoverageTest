package doublyLinkedList;

public class QuickSort {

    static NodeD partition(NodeD current,NodeD pivot) {
        int x = (Integer) pivot.getItem();

        NodeD i = current.getPrevious();

        for(NodeD j = current; j != pivot; j = j.getNext())
        {
            if((Integer) j.getItem() <= x)
            {
                i = (i==null) ? current : i.getNext();
                int temp = (Integer) i.getItem();
                i.setItem(j.getItem());
                j.setItem(temp);
            }
        }

        i = (i==null) ? current : i.getNext();
        int temp = (Integer) i.getItem();
        i.setItem(pivot.getItem());
        pivot.setItem(temp);
        return i;
    }

    static void _quickSort(NodeD current,NodeD pivot) {
        if(pivot != null && current != pivot && current != pivot.getNext()) {
            NodeD temp = partition(current, pivot);
            _quickSort(current, temp.getPrevious());
            _quickSort(temp.getNext(), pivot);
        }
    }

    //Main QuickSort
    static public void quickSort(DoublyLinkedList list) {

        // Call the recursive QuickSort
        _quickSort(list.find(0), list.find(list.length()-1));
    }
}
