package arraylinkedlist;

class MyLinkedList {

        private Node head;

        void print()
        {
            Node current = head;
            while (current != null)
            {
                System.out.println(current.data);
                current = current.next;
            }
        }

        void addFirst(Object data)
        {
            Node toAdd = new Node();

            toAdd.data = data;
            toAdd.next = head;

            head = toAdd;
        }

        void addLast(Object data)
        {
            if (head == null)
            {
                head = new Node();

                head.data = data;
                head.next = null;
            }
            else
            {
                Node toAdd = new Node();
                toAdd.data = data;

                Node current = head;
                while (current.next != null)
                {
                    current = current.next;
                }

                current.next = toAdd;
            }
        }
    }



