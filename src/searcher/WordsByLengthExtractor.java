package searcher;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WordsByLengthExtractor {

	private static boolean firstCharacterEntry(String sWord) {
		Boolean retValue = false;
		
		if (sWord.length() > 1) {
			String sFirstChar = sWord.substring(0, 1);
			String sWordCut = sWord.substring(1);
			retValue = sWordCut.contains(sFirstChar);
		} else {
			retValue = false;
		}
		
		return retValue;
	}
	
	private static boolean uniqueLetters(String sWord) {
		boolean retValue = true;
		
		for (int i = 0; i < sWord.length(); i++) {
			retValue = !firstCharacterEntry(sWord.substring(i)); 
			if (!retValue) {
				break;
			}
		}
		
		return retValue;
	}

	public void extractWordsFromFile(String inFileName, String outFileName, Boolean uniqueLetters, int wordLength) throws IOException {

		Scanner wordData = new Scanner(new File(inFileName),"UTF-8");
		PrintWriter writer = new PrintWriter(outFileName, "UTF-8");
		
		while (wordData.hasNext()) {
			String sWord = wordData.nextLine();
			if (sWord.length() == wordLength) {
				Boolean writeToFile = false;
				if (uniqueLetters) {
					writeToFile = uniqueLetters(sWord);
				} else {
					writeToFile = true;
				}
				if (writeToFile) {
					writer.println(sWord);
				}
			}
		}
		writer.close();
	}

}
