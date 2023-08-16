import java.util.Iterator;
import java.util.List;

public class Test1 {
    public List<String> removeList(List<String> list) throws MyException {
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            if("Three".equalsIgnoreCase(iter.next())) {
                iter.remove();
            }
        }
        try {
            list.get(list.size());
        } catch (Exception e) {
            throw new MyException();
        }
        return list;
    }

    public List<String> sample1 (List<String> list) {
        //String s = "";

        try {
            return removeList(list);
        } catch (MyException e) {
            throw new RuntimeException(e);
        }
    }

    public static String sample2 () {
        String s = "";

        return s;
    }

    public class MyException extends Exception {
        MyException() {
            System.out.println("UnExpected Error code");
        }
    }
}
