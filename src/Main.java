public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.add("Андрей ");
        list.add("Олег ");
        list.add("Дима ");
        list.add("Антон ");
        System.out.print("Список: ");
        list.print();
        System.out.print("Список в обратную сторону : ");
        list.printReverse();
    }
}