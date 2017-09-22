package tasks.linkedlist.centralnode;

/**
 * User: User
 * Date: 14.09.17
 * Time: 12:58
 */
/*
* Задача: найти средний элемент в LinkedList за один проход
* Решение:
* два указателя. Первый будет увеличиваться при прохождении одного узла списка, второй — при прохождении 2 узлов.
* В момент, когда 2ой указатель дойдёт до конца списка (наткнётся на NULL), первый будет указывать на середину списка.
Успешно справились с этим вопросом? Получите следующий.
* */
public class Central {
    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();
        linkedList.add( new LinkedList.Node("1"));
        linkedList.add( new LinkedList.Node("2"));
        linkedList.add( new LinkedList.Node("3"));
        linkedList.add( new LinkedList.Node("4"));
        linkedList.add( new LinkedList.Node("5"));
        linkedList.add( new LinkedList.Node("6"));
        linkedList.add( new LinkedList.Node("7"));
        linkedList.add( new LinkedList.Node("8"));
        linkedList.add( new LinkedList.Node("9"));
        linkedList.add( new LinkedList.Node("10"));
        LinkedList.Node current = head;
        int length = 0;
        LinkedList.Node middle = head;
        while(current.next() != null){
            length++;
            if(length%2 ==0){
                middle = middle.next();
            }
            current = current.next();
        }
        if(length%2 == 1){
            middle = middle.next();
        }
        System.out.println("length of LinkedList: " + length);
        System.out.println("middle element of LinkedList : " + middle);
    }
}
class LinkedList{
    private Node head;
    private Node tail;
    public LinkedList(){
        this.head = new Node("head");
        tail = head;
    }
    public Node head(){
        return head;
    }
    public void add(Node node){
        tail.next = node;
        tail = node;
    }
    public static class Node{
        private Node next;
        private String data;
        public Node(String data){
            this.data = data;
        }
        public String data() {
            return data;
        }
        public void setData(String data) {
            this.data = data;
        }
        public Node next() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        public String toString(){
            return this.data;
        }
    }
}
