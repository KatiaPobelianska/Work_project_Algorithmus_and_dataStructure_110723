package home_task_23_11_29.task_1;

/*Реализовать метод search() у написанной на занятии очереди CustomArrayQueue
(см. код в репозитории).
public int search(int element) -  определяет, существует ли объект в очереди.
Если элемент найден, возвращает позицию элемента с вершины стека.
В противном случае он возвращает -1.*/
public class CustomArrayQueue {
    private int[] data;
    private int tail;
    private int head;
    private int count;

    public CustomArrayQueue(int capacity) {
        data = new int[capacity];
        count = 0;
        head = -1;
        tail = -1;
    }

    public void enqueue(int element) { // O(1)
        if (count >= data.length) throw new RuntimeException("Queue is full");
        if (++tail == data.length) tail = 0;
        data[tail] = element;
        if (head == -1) head++;
        count++;
    }

    public int dequeue() { // O(1)
        if (count == 0) throw new RuntimeException("Queue is empty");
        int result = data[head];
        if (++head == data.length) head = 0;
        if (--count == 0) {
            head = -1;
            tail = -1;
        }
        return result;
    }

    public int search(int element) {
        int index = head;
        int position = 0;
        for (int i = 0; i < count; i++) {
            if (data[index] == element) return position;

            index = (index + 1) % data.length;
            position++;
        }
        return -1;
    }

    public static void main(String[] args) {
        CustomArrayQueue queue = new CustomArrayQueue(5);

        // Test 1
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        // Test 2
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        // Test 3
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        // Test search()
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println("Search for 6: " + queue.search(6)); // Очікуємо 0
        System.out.println("Search for 7: " + queue.search(7)); // Очікуємо 1

    }

}
