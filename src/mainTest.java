import doublyLinkedList.BubbleSort;
import doublyLinkedList.DoublyLinkedList;
import doublyLinkedList.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class mainTest {
    @Test
    public void testBubble() throws Exception {
        DoublyLinkedList result = new DoublyLinkedList();
        DoublyLinkedList expected = new DoublyLinkedList();

        result.addFirst(5);
        result.addLast(1);
        result.addLast(4);
        result.addLast(2);
        result.addLast(8);
        result.addLast(9);

        expected.addFirst(1);
        expected.addLast(2);
        expected.addLast(4);
        expected.addLast(5);
        expected.addLast(8);
        expected.addLast(9);



        BubbleSort.bubbleSort(result);
        //QuickSort.quickSort(result);

        int cont = 0;

        if(result.length() == expected.length()){
            while(cont < result.length()){
                assertEquals((Integer) expected.findItem(cont), (Integer) result.findItem(cont));

                cont++;
            }
        }
    }

    @Test
    public void testBubbleFail() throws Exception {
        DoublyLinkedList result = new DoublyLinkedList();
        DoublyLinkedList expected = new DoublyLinkedList();

        result.addFirst(5);
        result.addLast(1);
        result.addLast(4);
        result.addLast(3);
        result.addLast(8);
        result.addLast(9);

        expected.addFirst(1);
        expected.addLast(2);
        expected.addLast(4);
        expected.addLast(5);
        expected.addLast(8);
        expected.addLast(9);



        BubbleSort.bubbleSort(result);
        //QuickSort.quickSort(result);

        int cont = 0;

        if(result.length() == expected.length()){
            while(cont < result.length()){
                assertEquals((Integer) expected.findItem(cont), (Integer) result.findItem(cont));

                cont++;
            }
        }
    }

    @Test
    public void testBubbleNull() throws Exception {
        DoublyLinkedList result = null;
        DoublyLinkedList expected = new DoublyLinkedList();

        /*
        result.addFirst(5);
        result.addLast(1);
        result.addLast(4);
        result.addLast(3);
        result.addLast(8);
        result.addLast(9);
         */

        expected.addFirst(1);
        expected.addLast(2);
        expected.addLast(4);
        expected.addLast(5);
        expected.addLast(8);
        expected.addLast(9);



        BubbleSort.bubbleSort(result);
        //QuickSort.quickSort(result);

        int cont = 0;

        if(result.length() == expected.length()){
            while(cont < result.length()){
                assertEquals((Integer) expected.findItem(cont), (Integer) result.findItem(cont));

                cont++;
            }
        }
    }

    @Test
    public void testQuick() throws Exception {
        DoublyLinkedList result = new DoublyLinkedList();
        DoublyLinkedList expected = new DoublyLinkedList();

        result.addFirst(5);
        result.addLast(1);
        result.addLast(4);
        result.addLast(2);
        result.addLast(8);
        result.addLast(9);

        expected.addFirst(1);
        expected.addLast(2);
        expected.addLast(4);
        expected.addLast(5);
        expected.addLast(8);
        expected.addLast(9);

        QuickSort.quickSort(result);

        int cont = 0;

        if(result.length() == expected.length()){
            while(cont < result.length()){
                assertEquals((Integer) expected.findItem(cont), (Integer) result.findItem(cont));

                cont++;
            }
        }
    }

    @Test
    public void testQuickFail() throws Exception {
        DoublyLinkedList result = new DoublyLinkedList();
        DoublyLinkedList expected = new DoublyLinkedList();

        result.addFirst(5);
        result.addLast(1);
        result.addLast(4);
        result.addLast(3);
        result.addLast(8);
        result.addLast(9);

        expected.addFirst(1);
        expected.addLast(2);
        expected.addLast(4);
        expected.addLast(5);
        expected.addLast(8);
        expected.addLast(9);

        QuickSort.quickSort(result);

        int cont = 0;

        if(result.length() == expected.length()){
            while(cont < result.length()){
                assertEquals((Integer) expected.findItem(cont), (Integer) result.findItem(cont));

                cont++;
            }
        }
    }

    @Test
    public void testQuickNull() throws Exception {
        DoublyLinkedList result = null;
        DoublyLinkedList expected = new DoublyLinkedList();

        expected.addFirst(1);
        expected.addLast(2);
        expected.addLast(4);
        expected.addLast(5);
        expected.addLast(8);
        expected.addLast(9);

        QuickSort.quickSort(result);

        int cont = 0;

        if(result.length() == expected.length()){
            while(cont < result.length()){
                assertEquals((Integer) expected.findItem(cont), (Integer) result.findItem(cont));

                cont++;
            }
        }
    }

}