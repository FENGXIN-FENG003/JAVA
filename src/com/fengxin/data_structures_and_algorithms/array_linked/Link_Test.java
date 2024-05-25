package com.fengxin.data_structures_and_algorithms.array_linked;

/**
 * @author FENGXIN
<<<<<<< HEAD
 *         单链表的实现
 *         下标索引head.next 从0开始
 *         说明：指定位置的操作时，以第一个结点head.next为起始结点，for循环中索引 (i = 0;i < index;i++)
 *         即为指定位置index的前一个位置
 **/
public class Link_Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(7);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.add(3, 0);
        linkedList.remove(2);
        linkedList.addFirst(6);
        linkedList.addLast(4);
        System.out.println(linkedList.get(4));
        linkedList.printLinkedList();
    }
}

// 单链表类
class LinkedList<E> {
    // 单链表结点
    public static class Node<E> {
        E value;
        Node<E> next;

        Node(E value) {
            this.value = value;
            this.next = null;
        }
    }

    // 链表头
    Node<E> head;
    // 链表长度
    private int size;
    // 链表尾
    Node<E> tail;

    // 链表构造函数
    public LinkedList() {
        this.head = new Node<>(null);
        tail = head;
        this.size = 0;
    }

    // 添加元素在链表头部
=======
 * 单链表的实现
 * 下标索引head.next 从0开始
 * 说明：指定位置的操作时，以第一个结点head.next为起始结点，for循环中索引 (i = 0;i < index;i++) 即为指定位置index的前一个位置
 **/
public class Link_Test {
    public static void main (String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<> ();
        linkedList.addFirst (7);
        linkedList.addFirst (2);
        linkedList.addFirst (1);
        linkedList.add (3,0);
        linkedList.remove (2);
        linkedList.addFirst (6);
        linkedList.addLast (4);
        System.out.println (linkedList.get (4));
        linkedList.printLinkedList ();
    }
}
// 单链表类
class LinkedList<E> {
//    单链表结点
    public static class Node<E> {
        E value;
        Node<E> next;
        Node(E value){
            this.value = value;
            this.next = null;
        }
}
//    链表头
    Node<E> head;
//    链表长度
    private int size;
//    链表尾
    Node<E> tail;
//    链表构造函数
    public LinkedList() {
        this.head = new Node<> (null);
        tail = head;
        this.size = 0;
    }
//     添加元素在链表头部
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
    public void addFirst(E value) {
        Node<E> newNode = new Node<>(value);
        newNode.next = head.next;
        head.next = newNode;
<<<<<<< HEAD
        // 如果添加之前链表为空，头尾结点是相等的地址，则需要更新尾节点指向新节点
=======
        //如果添加之前链表为空，头尾结点是相等的地址，则需要更新尾节点指向新节点
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
        if (tail == head) {
            tail = newNode;
        }
        size++;
    }
<<<<<<< HEAD

    // 添加元素在链表尾部
    public void addLast(E value) {
=======
//     添加元素在链表尾部
    public void addLast(E value){
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
        Node<E> newNode = new Node<>(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }
<<<<<<< HEAD

    // 添加元素在指定位置
=======
//    添加元素在指定位置
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
    public void add(int index, E value) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("索引超出范围");
        }
<<<<<<< HEAD
        // 如果索引等于链表长度，则直接添加到链表尾部
        if (index == size) {
=======
        //如果索引等于链表长度，则直接添加到链表尾部
        if(index == size){
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
            addLast(value);
            return;
        }
        Node<E> newNode = new Node<>(value);
<<<<<<< HEAD
        // 移动到指定位置的前一个位置
        Node<E> prev = head;
        for (int i = 0; i < index; i++) {
=======
        //移动到指定位置的前一个位置
        Node<E> prev = head;
        for (int i = 0 ; i < index; i++) {
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }
<<<<<<< HEAD

    // 删除链表头部元素
    public E removeFirst() {
        // 如果链表为空，则抛出异常
=======
//    删除链表头部元素
    public E removeFirst() {
        //如果链表为空，则抛出异常
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
        if (head.next == null) {
            throw new IllegalArgumentException("链表为空");
        }
        Node<E> first = head.next;
        head.next = first.next;
        first.next = null;
<<<<<<< HEAD
        // 如果删除后链表为空，则更新尾节点
        if (size == 1) {
=======
        //如果删除后链表为空，则更新尾节点
        if(size == 1)
        {
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
            final boolean b = tail == head;
        }
        size--;
        return first.value;
    }
<<<<<<< HEAD

    // 删除链表尾部元素
    public E removeLast() {
        // 如果链表为空，则抛出异常
        if (head.next == null) {
            throw new IllegalArgumentException("链表为空");
        }
        Node<E> prev = head;
        // 移动到尾节点的前一个位置
        while (prev.next != tail) {
            prev = prev.next;
        }
        // 保存尾节点的值
        E val = tail.value;
        // 删除尾节点
=======
//    删除链表尾部元素
    public E removeLast(){
        //如果链表为空，则抛出异常
        if(head.next == null){
            throw new IllegalArgumentException("链表为空");
        }
        Node<E> prev = head;
        //移动到尾节点的前一个位置
        while (prev.next != tail){
            prev = prev.next;
        }
        //保存尾节点的值
        E val = tail.value;
        //删除尾节点
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
<<<<<<< HEAD

    // 删除指定位置的元素
    public void remove(int index) {
        // 如果索引小于0或者大于等于链表长度，则抛出异常
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引超出范围");
        }
        // 如果链表为空，则抛出异常
        if (head.next == null) {
            throw new IllegalArgumentException("链表为空");
        }
        // 移动到指定位置的前一个位置
        Node<E> prev = head;
        for (int i = 0; i < index; i++) {
=======
//    删除指定位置的元素
    public void remove(int index){
//        如果索引小于0或者大于等于链表长度，则抛出异常
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("索引超出范围");
        }
//        如果链表为空，则抛出异常
        if(head.next == null){
            throw new IllegalArgumentException("链表为空");
        }
        //移动到指定位置的前一个位置
        Node<E> prev = head;
        for (int i = 0 ; i < index; i++) {
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
            prev = prev.next;
        }
        Node<E> toRemove = prev.next;
        prev.next = toRemove.next;
<<<<<<< HEAD
        // 如果删除的节点是尾节点，则更新尾节点
        if (toRemove == tail) {
=======
        //如果删除的节点是尾节点，则更新尾节点
        if(toRemove == tail){
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
            tail = prev;
        }
        size--;
        toRemove.next = null;
    }
<<<<<<< HEAD

    // 获取链表头部元素
    public E getFirst() {
        // 如果链表为空，则抛出异常
=======
//    获取链表头部元素
    public E getFirst() {
        //如果链表为空，则抛出异常
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
        if (head.next == null) {
            throw new IllegalArgumentException("链表为空");
        }
        return head.next.value;
    }
<<<<<<< HEAD

    // 获取链表尾部元素
    public E getLast() {
        // 如果链表为空，则抛出异常
=======
//    获取链表尾部元素
    public E getLast(){
        //如果链表为空，则抛出异常
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
        if (head.next == null) {
            throw new IllegalArgumentException("链表为空");
        }
        return tail.value;
    }
<<<<<<< HEAD

    // 获取指定位置的元素
    public E get(int index) {
        // 如果索引小于0或者大于等于链表长度，则抛出异常
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引超出范围");
        }
        // 如果链表为空，则抛出异常
        if (head.next == null) {
            throw new IllegalArgumentException("链表为空");
        }
        // 移动到指定位置
        Node<E> getNode = head.next;
        for (int i = 0; i < index; i++) {
=======
//    获取指定位置的元素
    public E get(int index){
        //如果索引小于0或者大于等于链表长度，则抛出异常
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("索引超出范围");
        }
        //如果链表为空，则抛出异常
        if(head.next == null){
            throw new IllegalArgumentException("链表为空");
        }
        //移动到指定位置
        Node<E> getNode = head.next;
        for (int i = 0 ; i < index ; i++) {
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
            getNode = getNode.next;
        }
        return getNode.value;
    }
<<<<<<< HEAD

    // 获取链表长度
    public int getSize() {
        return size;
    }

    // 修改指定链表位置的元素
    public void set(int index, E value) {
        // 如果索引小于0或者大于等于链表长度，则抛出异常
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引超出范围");
        }
        // 如果链表为空，则抛出异常
        if (head.next == null) {
            throw new IllegalArgumentException("链表为空");
        }
        // 移动到指定位置
        Node<E> setNode = head;
        for (int i = 0; i < index; i++) {
            setNode = setNode.next;
        }
        setNode.value = value;
        System.out.println("修改成功" + index + "的值为" + value);
    }

    // 打印链表
    public void printLinkedList() {
        // 如果链表为空，则抛出异常
        if (head.next == null) {
            throw new IllegalArgumentException("链表为空");
        }
        // 移动到第一个元素
        Node<E> printNode = head.next;
        for (int i = 0; i < size; i++) {
            if (printNode.next == null) {
                System.out.print(printNode.value);
                break;
            }
            System.out.print(printNode.value + "--->");
            printNode = printNode.next;
        }
    }

=======
//    获取链表长度
    public int getSize(){
        return size;
    }
//    修改指定链表位置的元素
    public void set(int index, E value){
        //如果索引小于0或者大于等于链表长度，则抛出异常
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("索引超出范围");
        }
        //如果链表为空，则抛出异常
        if(head.next == null){
            throw new IllegalArgumentException("链表为空");
        }
        //移动到指定位置
        Node<E> setNode = head;
        for (int i = 0 ; i < index ; i++){
            setNode = setNode.next;
        }
        setNode.value = value;
        System.out.println ("修改成功" +index +"的值为" + value);
    }
//    打印链表
    public void printLinkedList(){
        //如果链表为空，则抛出异常
        if(head.next == null){
            throw new IllegalArgumentException("链表为空");
        }
        //移动到第一个元素
        Node<E> printNode = head.next;
        for (int i = 0 ; i < size ; i++){
            if(printNode.next == null)
            {
                System.out.print (printNode.value);
                break;
            }
            System.out.print (printNode.value +"--->");
            printNode = printNode.next;
        }
    }
   
>>>>>>> de0b9a14d87dd28837984e4f7362ddb53226226d
}