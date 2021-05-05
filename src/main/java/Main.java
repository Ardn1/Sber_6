import iterator.MyReverseIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> writeLines = new ArrayList<>();
        writeLines.add(1);
        writeLines.add(5);
        writeLines.add(3);
        writeLines.add(4);
        MyReverseIterator iterMy = new MyReverseIterator(writeLines);
        while (iterMy.hasNext()) {
            System.out.println(iterMy.next());
        }

    }
}
