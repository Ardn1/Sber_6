package iterator;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyReverseIteratorTest {
    @Test
    public void iterateTest() throws Exception {
        List<Integer> inputLines = new ArrayList<>();
        inputLines.add(1);
        inputLines.add(5);
        inputLines.add(3);
        inputLines.add(4);

        List<Integer> resultLines = new ArrayList<>();
        resultLines.add(4);
        resultLines.add(3);
        resultLines.add(5);
        resultLines.add(1);

        MyReverseIterator iterMy = new MyReverseIterator(inputLines);

        int i = 0;
        while (iterMy.hasNext()) {
            if (resultLines.get(i) != iterMy.next())
                Assert.fail("Не корректный порядок");
            i++;
        }
    }
}