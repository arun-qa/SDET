package mandatoryHomeWork.DSA.week16;

public class Assessment_ArrangeTheWords {

	public static String rearrangeSentence(String sentence) {
		
		//Cats and hats.
		String[] words = sentence.split(" ");

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].length() > words[j].length() || (words[i].length() == words[j].length() && i > j)) {
					// Swap words to ensure correct order
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}

		StringBuilder rearrangedSentence = new StringBuilder();
		for (String word : words) {
			rearrangedSentence.append(word);
			rearrangedSentence.append(" ");
		}

		String result = rearrangedSentence.toString().trim();
		if (!result.isEmpty()) {
			result = Character.toUpperCase(result.charAt(0)) + result.substring(1);
			result = result.substring(0, result.length() - 1) + ".";
		}

		return result;
	}

	public static void main(String[] args) {
		String sentence = "The lines are printed in reverse order.";
		String rearranged = rearrangeSentence(sentence);
		System.out.println(rearranged);
	}

}
