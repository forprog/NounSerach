package searcher;

import java.io.IOException;

public class DoWordExtraction {

	public static void main(String[] args) throws IOException {
		WordsByLengthExtractor wordExtractor = new WordsByLengthExtractor();
		wordExtractor.extractWordsFromFile("russian_nouns.txt", "needed_nouns.txt", false, 5);
	}
}
