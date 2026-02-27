package org.example;

import java.util.ArrayList;

public class Queue {

    private ArrayList<String> peopleInQueue = new ArrayList<>();

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("Simon");
        System.out.println(queue.state());
    }

    public void add(String name){
        peopleInQueue.add(name);
    }

    public void next(){
        if (!peopleInQueue.isEmpty()) {
            peopleInQueue.removeFirst();
        }
    }

    public ArrayList<String> state(){
        return this.peopleInQueue;
    }
}
