package com.example.demo6.controller;

import com.fasterxml.jackson.databind.util.LinkedNode;

import java.util.LinkedList;

public class lianbiao {

    public static void main(String[] args) {
//        LinkedNode<Integer> node = new LinkedNode<Integer>(1);
//        for(int i=0;i<100;i++){
//            linkedNode.next(i);
//        }

        LinkedList list = new LinkedList();
        list.push("4");
        list.push("3");
        list.push("2");
        list.push("1");

        System.out.println("测试头插法");
        System.out.println("大小"+list.size());
        System.out.println(list.pop());
        System.out.println(list.pop());System.out.println(list.pop());System.out.println(list.pop());
        System.out.println(list.size());


//        list.addNodeHead(4);
//        list.addNodeHead(3);
//        list.display();
//        list.addNodeHead(2);
//        list.addNodeHead(1);
        /*list.display();
        list.addNodeTail(4);
        list.display();
        System.out.println("测试某个位置删除法");
        list.deleteNode(3);
        list.display();
        System.out.println("测试删除重复数据前");
        list.addNodeHead(1);
        list.display();
        System.out.println("测试删除重复数据");
        list.deleteDuplecate1(list.head);
        list.display();
        System.out.println("测试删除重复数据1");
        list.addNodeIndex(2,1);
        list.display();
        list.deleteDuplecate(list.head);*/
//        list.display();
        System.out.println("链表的反转");
//        Node node = LinkedList.ReverseIteratively(list.head);
//        Node node1 = list.reverse(list.head);
//        while (node1 != null){
//            System.out.println(node1.data);
//            node1 = node1.next;
//        }
    }


}
