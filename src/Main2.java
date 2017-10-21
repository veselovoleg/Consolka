import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        int size = 3;

        List<List<Boolean>> cells = Stream
                .generate(() -> generateRow(size))
                .limit(size)
                .collect(Collectors.toList());

        System.out.println("original list: " + cells);
    }

    private static List<Boolean> generateRow(int size) {
        Random random = new Random();
        return Stream
                .generate(() -> random.nextBoolean())
                .limit(size)
                .collect(Collectors.toList());
    }
    }

