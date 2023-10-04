package fr.but3.tver;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class DefaultStackTest {
    private SimpleStack stack;
    private Item item1;
    private Item item2;

    @BeforeEach
    void setUp() {
        stack = new DefaultStack();
        item1 = new DefaultItem();
        item2 = new DefaultItem();
    }

    @Test
    void isEmptyTest() {
        assertTrue(stack.isEmpty());
        stack.push(item1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void getSizeTest() {
        assertEquals(0, stack.getSize());
        stack.push(item1);
        assertEquals(1, stack.getSize());
        stack.push(item2);
        assertEquals(2, stack.getSize());
    }

    @Test
    void pushTest() {
        stack.push(item1);
        assertEquals(1, stack.getSize());
        assertEquals(item1, stack.peek());
    }

    @Test
    void peekTest() {
        assertThrows(EmptyStackException.class, () -> stack.peek());
        stack.push(item1);
        assertEquals(item1, stack.peek());
        assertEquals(1, stack.getSize());
    }

    @Test
    void popTest() {
        assertThrows(EmptyStackException.class, () -> stack.pop());
        stack.push(item1);
        assertEquals(item1, stack.pop());
        assertEquals(0, stack.getSize());
    }
}
