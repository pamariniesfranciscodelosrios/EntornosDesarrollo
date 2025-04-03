package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void testAddTask() {
        ToDoList list = new ToDoList();
        list.addTask("Learn JUnit");
        assertEquals(1, list.getTaskCount());
        assertTrue(list.containsTask("Learn JUnit"));
    }

    @Test
    void testRemoveTask() {
        ToDoList list = new ToDoList();
        list.addTask("Write tests");
        list.removeTask("Write tests");
        assertEquals(0, list.getTaskCount());
    }

    @Test
    void testInvalidTaskAddition() {
        ToDoList list = new ToDoList();
        assertThrows(IllegalArgumentException.class, () -> list.addTask(""));
    }
}