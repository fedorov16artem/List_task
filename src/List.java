public class List {
    private Node head;  // Ссылка на первый элемент
    private Node tail; // Ссылка на последний элемент

    // Метод добавления элемента в список
    public void add(Object data) {
        // Создание нового узла
        Node newNode = new Node(data);
        if (head == null) { // Если список пуст
            // Присваиваем новый узел как начало и конец списка
            head = newNode;
            tail = newNode;
        } else { // Если список уже содержит элементы
            // Присваиваем ссылки на элементы соседних узлов
            newNode.setPrev(tail);
            tail.setNext(newNode);
            // Обновляем конец списка
            tail = newNode;
        }
    }
    // Метод вывода списка на экран
    public void print() {
        Node current = head;
        while (current != null) { // Пока не достигнут конец списка
            System.out.print(current.getData() + " "); // Выводим значение узла на экран
            current = current.getNext(); // Переходим к следующему узлу
        }
        System.out.println(); // Переходим на следующую строку
    }
    // Метод вывода списка в обратном порядке на экран
    public void printReverse() {
        Node current = tail;
        while (current != null) { // Пока не достигнут начало списка
            System.out.print(current.getData() + " "); // Выводим значение узла на экран
            current = current.getPrev(); // Переходим к предыдущему узлу
        }
        System.out.println(); // Переходим на следующую строку
    }

}