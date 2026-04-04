package lr3;

class NodeTail {
    public int value;
    public NodeTail next;

    NodeTail(int value, NodeTail next) {
        this.value = value;
        this.next = next;
    }
}

public class Example11_2 {
    public static void main(String[] args) {
        NodeTail head = null;
        NodeTail tail = null;

        for (int i = 0; i <= 9; i++) {
            NodeTail newNode = new NodeTail(i, null);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.print("Список (с хвоста): ");
        NodeTail ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
    }
}
