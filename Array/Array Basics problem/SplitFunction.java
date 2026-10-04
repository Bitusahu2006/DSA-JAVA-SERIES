import java.util.Arrays;

public class SplitFunction {
	public static void main(String[] args) {
		String sentence = "Welcome to Java programming";
		String[] words = sentence.split(" ");
		Arrays.sort(words);
		for (String word : words) {
			System.out.println(word);
		}
	}
}
