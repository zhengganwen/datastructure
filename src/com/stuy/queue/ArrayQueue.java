package com.stuy.queue;

/**
 * 用数组实现一个队列
 * 这种是有弊端的，没有充分使用数组，当队列数据取玩完，不能再想队列里面添加元素，会提示队列已满
 * 数组不能复用
 */
public class ArrayQueue {
    private int[] arr;    //数组
    private int maxSize;  //数组大小
    private int front;    //队列头的指向的一个位置
    private int rear;     //队列尾部指向位置

    //队列构造器
    public ArrayQueue(int arrSize) {
        arr = new int[arrSize];
        maxSize = arrSize;
        front = -1;
        rear = -1;
    }

    //判断队列已经满了
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    //判断队列为空
    public boolean idEmpty() {
        return front == rear;
    }

    //队列添加数据
    public void addQueue(int n) {
        //判断队列是否满了
        if (isFull()) {
            System.out.println("队列已经满了，不能添加数据了");
            return;
        }
        rear++;   //队列尾部指针后移
        arr[rear] = n;
    }

    //队列取数据
    public int getQueue() {
        if (idEmpty()) {
            throw new RuntimeException("队列为空，不能取数据");
        }
        front++;    //队列头部指向的指针偏移
        return arr[front];
    }

    //遍历队列
    public void showQueue() {
        if (idEmpty()) {
            throw new RuntimeException("队列为空，不能取数据");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\n");
        }
    }

    //显示队列的头数据

    public int headerQueue() {
        if (idEmpty()) {
            throw new RuntimeException("队列为空，不能取数据");
        }
        return arr[front + 1];
    }
}
