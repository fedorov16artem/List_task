public class Node {
    private Object data; // переменная для хранения данных в узле
    private Node next; // ссылка на следующий узел
    private Node prev; // ссылка на предыдущий узел

    public Node(Object data) { // конструктор, принимающий данные в качестве аргумента
        this.data = data; // установка данных
    }
    public Object getData() { // метод для получения данных из узла
        return data; // возвращаемые данные
    }
    public void setData(Object data) { // метод для установки данных в узел
        this.data = data; // установка данных
    }
    public Node getNext() { // метод для получения ссылки на следующий узел
        return next; // возвращаемая ссылка
    }
    public void setNext(Node next) { // метод для установки ссылки на следующий узел
        this.next = next; // установка ссылки
    }
    public Node getPrev() { // метод для получения ссылки на предыдущий узел
        return prev; // возвращаемая ссылка
    }
    public void setPrev(Node prev) { // метод для установки ссылки на предыдущий узел
        this.prev = prev; // установка ссылки
    }
}
