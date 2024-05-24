package junittests;

import java.util.ArrayList;
import java.util.List;

import javaqueryexperiments.testclasses.CombinationCreator;

public class CombinationsTest<T> {

	public static void main(String[] args) {
		List<List<Integer>> integerLists = new ArrayList<>();
		integerLists.add(List.of(1, 2));
		integerLists.add(List.of(3, 4));
		integerLists.add(List.of(5, 6));

		CombinationCreator<Integer> combinations = new CombinationCreator<>(integerLists);

		while (!combinations.isFinished())
			System.out.println(combinations.getNext());
	}
}
