package doublyLinkedList;

public class DoublyLinkedList<T> {
    /**
     * Atributos
     * Node first: Referencia al primer nodo de la lista
     * Node last: Referencia al último nodo de la lista
     * int size: tamaño de la lista
     */
    private NodeD<T> first;
    private NodeD<T> last;
    private int size;

    /**
     * Constructor
     * Iniciliza los atributos
     */
    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    /**
     * Método length
     *
     * @return tamaño de la lista
     */
    public int length() {
        return this.size;
    }

    /**
     * Metodo encargado de buscar un nodo segun su posicion
     *
     * @param pos : < this.length
     * @return nodo en la pos
     */
    public NodeD<T> find(int pos) {
        return find_aux(pos);
    }

    /**
     * Metodo booleano
     *
     * @return si la lista esta vacia
     */
    public boolean isEmpty() {
        return this.first == null;
    }

    /**
     * Metodo encargado de agregar al inicio de la lista
     *
     * @param item valor a insertar
     */
    public void addFirst(T item) {
        this.addFirst_aux(item);
    }

    /**
     * Busca un nodo por indice
     *
     * @param pos < this.length
     * @return item del nodo
     */
    public T findItem(int pos) {
        return this.findI_aux(pos);
    }

    /**
     * Metodo encargado de agregar al final de la lista un dato
     *
     * @param item dato a insertar de tipo T
     */
    public void addLast(T item) {
        this.addLast_aux(item);
    }

    /**
     * Elimina un nodo por su posicion
     *
     * @param pos posicion a eliminar
     */
    public void deletePos(int pos) {
        this.deletePos_aux(pos);
    }

    //Metodos privados
    private void deletePos_aux(int pos) {
        NodeD<T> temp = this.first;
        if (!this.isEmpty()) {
            if (this.size == 1) {
                this.first = null;
                this.last = this.first;
            } else if (pos == 0) {
                temp.getNext().setPrevious(null);
                this.first = temp.getNext();
                //this.first.setPrevious(null);
                this.size--;
            } else if (!this.isEmpty()) {

                for (int i = 0; i < pos; ++i) {
                    temp = temp.getNext();
                }
                if (pos == this.size - 1) {
                    temp.getPrevious().setNext(null);
                    this.last = temp.getPrevious();
                    this.size--;
                } else {
                    temp.getPrevious().setNext(temp.getNext());
                    temp.getNext().setPrevious(temp.getPrevious());
                    this.size--;
                }
            }
        }
    }

    private NodeD<T> find_aux(int pos) {

        NodeD<T> temp = this.first;
        if (this.isEmpty()) {
            return null;
        } else {
            if (pos <= this.length()) {

                for (int i = 0; i < pos; i++) {

                    temp = temp.getNext();
                }

                return temp;
            }

            return null;
        }
    }

    private void addFirst_aux(T item) {
        if (this.first == null) {
            this.first = new NodeD<>();
            this.first.setItem(item);
            this.last = this.first;
            this.size++;
        } else {
            NodeD<T> newFirst = new NodeD<>();
            newFirst.setItem(item);
            newFirst.setNext(this.first);
            this.first.setPrevious(newFirst);
            this.first = newFirst;
            this.size++;
        }


    }

    private T findI_aux(int pos) {
        NodeD<T> temp = this.first;
        if (this.isEmpty()) {
            return null;
        } else {
            if (pos <= this.length()) {
                for (int i = 0; i < pos; i++) {
                    temp = temp.getNext();
                }
                return temp.getItem();

            }
            return null;
        }
    }

    public void addLast_aux(T item) {
        if (this.first == null) {
            this.last = new NodeD<T>();
            this.last.setItem(item);
            this.first = this.last;
            this.size++;
        } else {
            NodeD<T> newLast = new NodeD<>();
            newLast.setItem(item);
            newLast.setPrevious(this.last);
            this.last.setNext(newLast);
            this.last = newLast;
            this.size++;
        }
    }

}





