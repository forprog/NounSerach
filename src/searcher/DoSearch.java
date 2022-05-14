package searcher;

import java.io.IOException;

public class DoSearch {

	public static void main(String[] args) throws IOException {
		WordSearcher wordSearcher = new WordSearcher();
		wordSearcher.setInFileName("needed_nouns.txt");
		wordSearcher.setOutFileName("found_nouns.txt");
		
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.ENTRY_PLACE,"à",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.IS_ENTRY_EXCEPT_PLACE,"î",1));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.IS_ENTRY_EXCEPT_PLACE,"ê",2));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ç",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"õ",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"â",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ï",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ð",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ë",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ñ",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ò",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"á",3));
		
		wordSearcher.searchFile();
	}

}
