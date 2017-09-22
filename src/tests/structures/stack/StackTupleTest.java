package tests.structures.stack;

import tasks.structures.stack.StackTuple;

/**
 * User: User
 * Date: 19.09.17
 * Time: 14:01
 */
public class StackTupleTest {
    StackTuple<String> stackTuple = new StackTuple<String>(String.class, 5);

    @org.junit.Test
    public void testPush() throws Exception {
        stackTuple.push("15");
        stackTuple.push("25");
        stackTuple.push("35");
        stackTuple.push("45");
        stackTuple.push("55");
        stackTuple.push("65");
        stackTuple.push("75");

        for(int i=0, size = stackTuple.size() ;i<size;i++)
            stackTuple.pop();
    }

    @org.junit.Test
    public void testPop() throws Exception {

    }
}
