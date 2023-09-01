package org.example;

import java.util.Comparator;

/**
 * Связный список
 *
 * @param <T>
 */
public class LinkedList<T> {
    /**
     * Указатель на первый элемент связного списка
     */
    private Node head;

    /**
     * Узел связанного списка
     */

    public class Node {
        public LinkedList<T>.Node next;
        //public Node next; - old construct
        /**
         * Value of node
         */
        public T value;

        public Node() {
        }
    }

    /**
     * Добавление нового элемента в начало связного списка
     *
     * @param value значение
     */
    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    /**
     * Удалить первый элемент связного списка
     */
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public boolean contains(T value) {
        for (LinkedList<T>.Node node = this.head; node != null; node = node.next) {
            if (node.value.equals(value)) {
                return true;
            }
        }

        return false;
    }

    public void sort(Comparator<T> comparator) {
        for (LinkedList<T>.Node node = this.head; node != null; node = node.next) {
            LinkedList<T>.Node minValueNode = node;

            for (LinkedList<T>.Node node2 = node.next; node2 != null; node2 = node2.next) {
                if (comparator.compare(minValueNode.value, node2.value) > 0) {
                    minValueNode = node2;
                }
            }

            if (minValueNode != node) {
                T buf = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buf;
            }
        }

    }

    public void addLast(T value) {
        LinkedList<T>.Node node = new Node();
        node.value = value;
        if (this.head == null) {
            this.head = node;
        } else {
            Node lastNode;
            for (lastNode = this.head; lastNode.next != null; lastNode = lastNode.next) {

            }

            lastNode.next = node;
        }

    }

    public void removeLast() {
        if (this.head != null) {
            for (LinkedList<T>.Node node = this.head; node.next != null; node = node.next) {
                if (node.next.next == null) {
                    node.next = null;
                    return;
                }
            }

            this.head = null;
        }
    }
//  Разворот
   // базовая функция
    public void pivot() {
        if (head != null && head.next != null) {
            Node temp = head;
            pivot(head.next, head);
            temp.next = null;
        }
    }
// рекурсивная функция разворота
    private void pivot(Node currentNode, Node previousNode){
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            pivot(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        LinkedList<T>.Node node = this.head;

        while (node != null) {
            stringBuilder.append(node.value);
            node = node.next;
            if (node != null) {
                stringBuilder.append('\n');
            }
        }

        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
