
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	// To retrieve list of even numbers

	public static void main(String[] args) {
		List<Integer> list1 = List.of(1, 2, 3, 6, 3, 8, 9, 5, 7, 90, 70).stream().filter(x -> x % 2 == 0)
				.collect(Collectors.toList());

		List<Integer> list2 = List.of(1, 2, 3, 6, 3, 8, 9, 5, 7, 90, 70);

		Stream<Integer> stream2 = list2.stream();
		stream2.forEach(e -> {
			System.out.println(e);
		});
	}

}
