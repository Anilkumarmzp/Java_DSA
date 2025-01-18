import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class RemoveDuplicate {
    public static <T> Set<T> checkDuplicate(T[] array) {
        Set<T> seenRecord = new HashSet<>();

        return Arrays.stream(array)
                .filter(val -> !seenRecord.add(val))
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        Integer[] genarr = {1, 2, 3, 2, 4, 5, 1, 6, 3};
        Set<Integer> duplicates = checkDuplicate(genarr);
        System.out.println("Duplicate elements: " + duplicates);
    }
}
