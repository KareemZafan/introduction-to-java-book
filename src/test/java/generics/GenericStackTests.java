package generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static generics.GenericStack.getStackMaxValue;

public class GenericStackTests {
    private GenericStack<String> stack1;

    @BeforeEach
    public void beforeTest() {
        stack1 = new GenericStack<>();
    }

    @Test
    public void testPeek() {
        stack1.push("London");
        stack1.push("Berlin");
        stack1.push("Cairo");
        stack1.pop();
        Assertions.assertEquals("Berlin", stack1.peek());

    }

    @Test
    public void testPush() {
        stack1.push("London");
        Assertions.assertEquals("London", stack1.peek());
    }

    @Test
    public void testSize() {
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");
        Assertions.assertEquals(3, stack1.getSize());

    }

    @Test
    public void testPop() {
        stack1.push("London");
        stack1.push("Berlin");
        stack1.push("Rome");
        String removed = stack1.pop();
        Assertions.assertEquals("Rome", removed);
        Assertions.assertEquals("Berlin", stack1.peek());
        Assertions.assertEquals(2, stack1.getSize());


    }

    @Test
    public void testIsEmpty() {
        Assertions.assertTrue(stack1.isEmpty());
    }

    @Test
    public void testStackMaxValue() {
        stack1.push("Ahmed");
        stack1.push("Kareem");
        stack1.push("Yassen");

        Assertions.assertEquals("Yassen", getStackMaxValue(stack1));

        GenericStack<Double> stack = new GenericStack<>();
        stack.push(1.4);
        stack.push(1.5);
        stack.push(-1.4);
        stack.push(2.5);
        Assertions.assertEquals(2.5, getStackMaxValue(stack));

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(100);
        stack2.push(140);
        stack2.push(-400);
        stack2.push(809);
        Assertions.assertEquals(809, getStackMaxValue(stack2));

        GenericStack<Character> stack3 = new GenericStack<>();
        stack3.push('a');
        stack3.push('o');
        stack3.push('l');
        stack3.push('d');
        Assertions.assertEquals('o', getStackMaxValue(stack3));

    }


}
