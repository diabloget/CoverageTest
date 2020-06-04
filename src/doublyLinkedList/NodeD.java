package doublyLinkedList;

public class NodeD<T> {
    private NodeD<T> previous;
    private NodeD<T> next;
    private T item;

    /**
     * Constructor
     * Se inicializa los atributos en null
     */
    public NodeD(){
        this.previous=null;
        this.next=null;
        this.item=null;
    }

    /**
     * Setter
     * Cambia el valor del item
     * @param item
     */
    public void setItem(T item) {
        this.item = item;
    }

    /**
     * Setter
     * Asigna el valor del la referencia al nodo anterior
     * @param previous
     */
    public void setPrevious(NodeD<T> previous) {
        this.previous = previous;
    }

    /**
     * Setter
     * Asigna el valor del la referencia al siguiente nodo
     * @param next
     */
    public void setNext(NodeD<T> next) {
        this.next = next;
    }

    /**
     * Getter
     * Devuelve el valor del item
     * @return item
     */
    public T getItem() {
        return this.item;
    }

    /**
     * Getter
     * Devuelve el valord e la referencia al anterior nodo
     * @return nodo anterior
     */
    public NodeD<T> getPrevious() {
        return this.previous;
    }

    /**
     * Getter
     * Devuelve el valorde la referencia al siguiente nodo
     * @return next
     */
    public NodeD<T> getNext() {
        return this.next;
    }
}
