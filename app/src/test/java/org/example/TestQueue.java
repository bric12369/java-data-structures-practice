package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestQueue {
    @Test
    public void canAddAndStatePeople() {
        Queue queue = new Queue();
        queue.add("Simon");
        ArrayList<String> result = queue.state();
        Assert.assertEquals("Simon", result.get(0));

        queue.add("Jack");
        ArrayList<String> result2 = queue.state();
        Assert.assertEquals(List.of("Simon", "Jack"), result2);
    }

    @Test
    public void nextRemovesFirstPersonFromQueue(){
        Queue queue = new Queue();
        queue.add("Simon");
        queue.add("Jack");
        queue.next();
        Assert.assertEquals(List.of("Jack"), queue.state());

        queue.next();
        Assert.assertEquals(List.of(), queue.state());
    }

    @Test
    public void nextDoesNothingIfQueueEmpty(){
        Queue queue = new Queue();
        queue.next();
        Assert.assertEquals(List.of(), queue.state());
    }
}
