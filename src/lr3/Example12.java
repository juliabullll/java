package lr3;

class Nodee {
    public int value;
    public Nodee next;

    Nodee(int value, Nodee next) {
        this.value = value;
        this.next = next;
    }
}

public class Example12 {
    private Nodee head;

    public Example12() {
        this.head = null;
    }

    public void createHead(int[] values) {
        head = null;
        for (int i = 0; i < values.length; i++) {
            head = new Nodee(values[i], head);
        }
    }

    public void createTail(int[] values) {
        head = null;
        Nodee tail = null;
        for (int i = 0; i < values.length; i++) {
            Nodee newNode = new Nodee(values[i], null);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    public String toString() {
        if (head == null) {
            return "Список пуст";
        }
        StringBuilder sb = new StringBuilder();
        Nodee ref = head;
        while (ref != null) {
            sb.append(ref.value).append(" ");
            ref = ref.next;
        }
        return sb.toString().trim();
    }

    public void AddFirst(int value) {
        head = new Nodee(value, head);
    }

    public void AddLast(int value) {
        Nodee newNode = new Nodee(value, null);
        if (head == null) {
            head = newNode;
            return;
        }
        Nodee ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newNode;
    }

    public void Insert(int value, int position) {
        if (position == 0) {
            AddFirst(value);
            return;
        }
        Nodee ref = head;
        for (int i = 0; i < position - 1; i++) {
            if (ref == null) {
                return;
            }
            ref = ref.next;
        }
        if (ref == null) {
            return;
        }
        ref.next = new Nodee(value, ref.next);
    }

    public void RemoveFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void RemoveLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Nodee ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public void Remove(int position) {
        if (head == null) {
            return;
        }
        if (position == 0) {
            RemoveFirst();
            return;
        }
        Nodee ref = head;
        for (int i = 0; i < position - 1; i++) {
            if (ref.next == null) {
                return;
            }
            ref = ref.next;
        }
        if (ref.next == null) {
            return;
        }
        ref.next = ref.next.next;
    }

    public void createHeadRec(int[] values, int index) {
        if (index >= values.length) {
            return;
        }
        head = new Nodee(values[index], head);
        createHeadRec(values, index + 1);
    }

    public void createTailRec(int[] values) {
        head = null;
        createTailRecHelper(values, 0);
    }

    private void createTailRecHelper(int[] values, int index) {
        if (index >= values.length) {
            return;
        }
        AddLast(values[index]);
        createTailRecHelper(values, index + 1);
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Nodee node) {
        if (node == null) {
            return "";
        }
        String result = toStringRecHelper(node.next);
        if (result.isEmpty()) {
            return String.valueOf(node.value);
        }
        return node.value + " " + result;
    }

    public static void main(String[] args) {
        Example12 list = new Example12();
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("Цикл");

        list.createHead(new int[]{5, 4, 3, 2, 1});
        System.out.println("createHead: " + list.toString());

        list.createTail(values);
        System.out.println("createTail: " + list.toString());

        list.AddFirst(0);
        System.out.println("AddFirst(0): " + list.toString());

        list.AddLast(6);
        System.out.println("AddLast(6): " + list.toString());

        list.Insert(99, 3);
        System.out.println("Insert(99,3): " + list.toString());

        list.RemoveFirst();
        System.out.println("RemoveFirst(): " + list.toString());

        list.RemoveLast();
        System.out.println("RemoveLast(): " + list.toString());

        list.Remove(2);
        System.out.println("Remove(2): " + list.toString());

        System.out.println("\nРекурсия");

        Example12 list2 = new Example12();
        list2.createHeadRec(new int[]{5, 4, 3, 2, 1}, 0);
        System.out.println("createHeadRec: " + list2.toStringRec());

        Example12 list3 = new Example12();
        list3.createTailRec(new int[]{1, 2, 3, 4, 5});
        System.out.println("createTailRec: " + list3.toStringRec());
    }
}