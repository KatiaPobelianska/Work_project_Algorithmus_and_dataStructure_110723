package unit_23_11_29_customLinkedStack;

public class Main {
    public static void main(String[] args) {
        CustomLinkedStack stack = new CustomLinkedStack();
        // Добавление элементов
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Вывод размера стека
        System.out.println("Размер стека: " + stack.size());

        // Просмотр верхнего элемента без удаления
        System.out.println("Верхний элемент: " + stack.peek());

        // Поиск элемента в стеке
        String searchElement = "B";
        int position = stack.search(searchElement);
        if (position != -1) {
            System.out.println(searchElement + " найден на позиции " + position + " сверху стека.");
        } else {
            System.out.println(searchElement + " не найден в стеке.");
        }

        // Извлечение и удаление элемента из стека
        String poppedElement = stack.pop();
        System.out.println("Извлеченный элемент: " + poppedElement);

        // Проверка, пуст ли стек
        System.out.println("Стек пуст? " + stack.isEmpty());

        // Вывод размера стека после извлечения
        System.out.println("Размер стека: " + stack.size());
    }
}
