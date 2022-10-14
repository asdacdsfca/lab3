import static org.junit.Assert.*;
import org.junit.*;
import java.util.LinkedList.*;
import java.util.ArrayList;

public class LinkedListTest {
    @Test
    public void testAppend() {
        LinkedList testLst = new LinkedList();
        ArrayList<Integer> lst = new ArrayList<>();
        testLst.append(1);
        testLst.append(2);
        testLst.append(3);
        // testLst.toString();
        // LinkedList temp = testLst;
        // while (testLst.next != null){
        //     lst.add(testLst.value);
        //     testLst = testLst.next;
        // }
        // ArrayList<Integer> lst2 = new ArrayList<>();
        // lst2.add(1);
        // lst2.add(2);
        // lst2.add(3);
        assertEquals(1, testLst.root.value);
        assertEquals(2, testLst.root.next.value);
        assertEquals(3, testLst.root.next.next.value);
    }
}