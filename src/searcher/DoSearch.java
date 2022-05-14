package searcher;

import java.io.IOException;

public class DoSearch {

	public static void main(String[] args) throws IOException {
		WordSearcher wordSearcher = new WordSearcher();
		wordSearcher.setInFileName("needed_nouns.txt");
		wordSearcher.setOutFileName("found_nouns.txt");
		
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.ENTRY_PLACE,"�",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.IS_ENTRY_EXCEPT_PLACE,"�",1));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.IS_ENTRY_EXCEPT_PLACE,"�",2));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"�",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"�",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"�",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"�",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"�",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"�",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"�",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"�",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"�",3));
		
		wordSearcher.searchFile();
	}

}
