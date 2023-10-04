package fr.but3.tver;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * @author TVersepuech
 */
public final class DefaultStack implements SimpleStack {

    /**
     * Liste d'items représentant une SimpleStack.
     */
    private final List<Item> stack = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(final Item item) {
        stack.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }
}
