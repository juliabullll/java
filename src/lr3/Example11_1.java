package lr3;

class NodeHead {
    public int value;
    public NodeHead next;

    NodeHead(int value, NodeHead next) {
        this.value = value;
        this.next = next;
    }
}

public class Example11_1 {
    public static void main(String[] args) {
        NodeHead head = null;

        for (int i = 0; i <= 9; i++) {
            head = new NodeHead(i, head);
        }

        System.out.print("Список (с головы): ");
        NodeHead ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
    }
}
