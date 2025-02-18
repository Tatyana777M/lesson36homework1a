public class MyLinkedList {
    public static class myLinkedList extends MyList {
        private Node head = null;
        private Node tail = null;
        private int size = 0;

        @Override
        public void add(String element) {
            Node node = new Node(null, element , null);
            if (head == null) {
                head = node;
            } else {
                tail.setNext(node);
                node.setPrev(tail);
            }
            tail = node;
            size++;
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public String get(int index) {
            if (index >= 0 && index < size) {
                return getNodeByIndex(index).getValue();
            }
            return null;
        }

        private Node getNodeByIndex(int index) {
            int counter = 0;
            if (index < 0 || index >= size) {
                return null;
            }
            Node currentNode = head;

            while (currentNode != null && counter < index) {
                currentNode = currentNode.getNext();
                counter++;
            }
            return currentNode;
        }

        @Override
        public void print() {
            Node node = head;
            while (node != null) {
                System.out.println(node.getValue());
                node = node.getNext();
            }
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            Node currentNode = head;
            while (currentNode != null) {
                result.append(currentNode.getValue()).append(System.lineSeparator());
                currentNode = currentNode.getNext();
            }
            return result.toString();
        }


        private static class Node {
            private Node prev;
            private String value;
            private Node next;

            public Node(Node prev, String value, Node next) {
                this.prev = prev;
                this.value = value;
                this.next = next;
            }

            public Node getPrev() {
                return prev;
            }

            public void setPrev(Node prev) {
                this.prev = prev;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public Node getNext() {
                return next;
            }

            public void setNext(Node next) {
                this.next = next;
            }
        }
    }
}
