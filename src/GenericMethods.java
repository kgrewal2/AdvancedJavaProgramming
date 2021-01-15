import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    static Integer[] intArray = {1, 2, 3, 4, 5};

    public static List arrayToList(Object[] array, List<Object> list) {
        for (Object o : array) {
            list.add(o);
        }
        return list;
    }

    public static <T> List<T> arrayToListUsingGenerics(T[] array, List<T> list) {
        for (T t : array) {
            list.add(t);
        }
        return list;
    }


    public static void main(String[] args) {
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());

        // No Compile-Time Error but Runtime Error
        List<String> stringList = arrayToList(intArray, new ArrayList<>());

        // Compile-Time Error
        // List<String> anotherStringList = arrayToListUsingGenerics(intArray, new ArrayList<>());
    }
}
