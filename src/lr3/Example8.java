package lr3;

class Node {
    public int value;      // значение узла
    public Node next;      // ссылка на следующий узел

    // конструктор
    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class Example8 {
    public static void main(String[] args) {
        // создание независимых узлов
        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        // построение однонаправленного списка
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        // вывод значений на экран
        System.out.print("Значения полей: ");
        Node ref = node0;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
    }
}
