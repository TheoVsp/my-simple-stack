package fr.but3.tver;

import java.util.EmptyStackException;

/**
 * Interface SimpleStack.
 * @author TVersepuech
 */
public interface SimpleStack {
    /**
     * Tests if this stack is empty.
     * @return true si vide false sinon
     */
    boolean isEmpty();
    /**
     * @return the number of items in this stack.
     */
    int getSize();
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     * @param item un item
     */
    void push(Item item);
    /**
     * Looks at the object at the top of this stack without removing it from the
     stack.
     * @return that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    Item peek() throws EmptyStackException;
    /**
     * Removes the object at the top of this stack.
     * @return that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    Item pop() throws EmptyStackException;
}
