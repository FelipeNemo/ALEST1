public class LinkedListOfInteger {

    // Classe interna Node
    private class Node {
        public Integer element;
        public Node next;

        public Node(Integer element) {
            this.element = element;
            next = null;
        }

        public Node(Integer element, Node next) {
            this.element = element;
            this.next = next;
        }
    }


    // Referência para o primeiro elemento da lista encadeada.
    private Node head;
    // Referência para o último elemento da lista encadeada.
    private Node tail;
    // Contador para a quantidade de elementos que a lista contem.
    private int count;


    /**
     * Construtor da lista.
     */
    public LinkedListOfInteger() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Esvazia a lista
     */
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Adiciona um elemento ao final da lista.
     *
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Integer element) {
        Node n = new Node(element);
        if (head == null) { // testamos se head é nulo para ver se já existe elemento dentro do head
            head = n; // se o head for nulo eu adiciono n(nodo/objeto) ao heaad
        } else {
            tail.next = n; // o next do tail(fim do nodo) recebe n
        }
        tail = n; // confirma que o tail(fim) recebe o nodo(n)
        count++;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        Node aux = head; // criamos um nodo auxiliar para "salvar" as conexões

        while (aux != null) { // o auxliar percorre a lista enquanto o next dos nodos não forem nulos, ou sej, até o ultimo nodo em que next==null
            s.append(aux.element.toString());
            s.append("\n");
            aux = aux.next;
        }

        return s.toString();
    }

    ///////////////////////////////////////////////////
    //// EXERCICIOS - VEJA SLIDES E ENUNACIADO
    ///////////////////////////////////////////////////

    // 1 - implemente o método isEmpty
    /*
     * Retorna true se a lista nao contem elementos.
     *
     * @return true se a lista nao contem elementos
     */
    //assinatura do metodo
    //public boolean isEmpty()
    public boolean isEmpty() {
        return head == null; // Retorna true se a lista não conter elementos e se false caso contrário
    }


    // 2 - implemente o método size
    /*
     * Retorna o numero de elementos da lista.
     *
     * @return o numero de elementos da lista
     */
    ////assinatura do metodo
    //public int size()
    public int size(){ // O(1)
        return count;
    }



    // 3 - implemente o método get(complexidade O(n))
    /*
     * Retorna o elemento de uma determinada posicao da lista.
     * @param index a posição da lista
     * @return o ultimo elemento da posicao especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */

    /* Exemplo - veja o main
    Lista:
        2
        4
        8
        lista.get(1)
        Elemento na segunda posicao da lista: 4
     */

    //assinatura do metodo
    //public Integer get(int index)
    public int get(int index) { // O(1)
        if ((index < 0) || (index >= size())) {
            throw new IndexOutOfBoundsException("Index = " + index);
        }
        return lista[index];
    }

}