package unit_23_11_29_customLinkedStack;

public class CustomLinkedStack {
    private Node top;
    private int size;

    // Конструктор
    public CustomLinkedStack() {
        this.top = null;
        this.size = 0;
    }

    // Метод для добавления элемента в стек
    // Время выполнения: O(1)
    public void push(String element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Метод для извлечения и удаления элемента из стека
    // Время выполнения: O(1)
    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }

        String data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Метод для извлечения, не удаляя элемент из стека
    // Время выполнения: O(1)
    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }

        return top.data;
    }

    // Метод для проверки, пуст ли стек
    // Время выполнения: O(1)
    public boolean isEmpty() {
        return size == 0;
    }

    // Метод для получения размера стека
    // Время выполнения: O(1)
    public int size() {
        return size;
    }

    // Метод для поиска элемента в стеке
    // Время выполнения: O(n)
    public int search(String element) {
        Node current = top;
        int position = 1;

        while (current != null) {
            if (current.data.equals(element)) {
                return position;
            }
            current = current.next;
            position++;
        }

        return -1;
    }

    // Вспомогательный класс для представления узла связного списка
    private static class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
}
