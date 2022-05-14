package searcher;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WordSearcher {
	private String inFileName;
	private String outFileName;
	public ArrayList<SearchCondition> searchConditions = new ArrayList<SearchCondition>();
	
	public void searchFile() throws IOException {

		Scanner wordData = new Scanner(new File(inFileName),"UTF-8");
		PrintWriter writer = new PrintWriter(outFileName, "UTF-8");
		
		while (wordData.hasNext()) {
			String sWord = wordData.nextLine();
			if (wordFits(sWord)) {
				writer.println(sWord);
			}
		}
		writer.close();
	}
	
	private Boolean wordFits(String sWord) {
		boolean retVal = false;

		for (SearchCondition searchCondition : searchConditions) {
			retVal = wordFitsCondition(sWord,searchCondition);
			if (!retVal) {
				break;
			}
		}
		
		return retVal;
	}

	private static boolean wordFitsCondition(String sWord, SearchCondition searchCondition) {
		boolean retVal = false;
		
		switch (searchCondition.getKind()) {
		case ENTRY_PLACE:
			retVal = sWord.substring(searchCondition.getPoistion(), searchCondition.getPoistion()+1).equals(searchCondition.getLetter());
			break;
		case IS_ENTRY:
			retVal = sWord.contains(searchCondition.getLetter());
			break;

		case NO_ENTRY:
			retVal = !sWord.contains(searchCondition.getLetter());
			
			break;
		case IS_ENTRY_EXCEPT_PLACE:
			retVal = sWord.contains(searchCondition.getLetter()) && !sWord.substring(searchCondition.getPoistion(), searchCondition.getPoistion()+1).equals(searchCondition.getLetter());
			
			break;
		default:
			break;
		}
		
		return retVal;
	}

	public String getInFileName() {
		return inFileName;
	}

	public void setInFileName(String inFileName) {
		this.inFileName = inFileName;
	}

	public String getOutFileName() {
		return outFileName;
	}

	public void setOutFileName(String outFileName) {
		this.outFileName = outFileName;
	}
}
