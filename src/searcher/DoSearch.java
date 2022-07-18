package searcher;

import java.io.IOException;

public class DoSearch {

	public static void main(String[] args) throws IOException {
		WordSearcher wordSearcher = new WordSearcher();
		wordSearcher.setInFileName("needed_nouns.txt");
		wordSearcher.setOutFileName("found_nouns.txt");
		
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.ENTRY_PLACE,"ë",2));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.ENTRY_PLACE,"è",1));
		//wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.ENTRY_PLACE,"ð",1));
		//wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.IS_ENTRY_EXCEPT_PLACE,"ò",1));
		//wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.IS_ENTRY_EXCEPT_PLACE,"ò",2));
		//wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.IS_ENTRY_EXCEPT_PLACE,"î",4));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ï",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"î",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ê",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"à",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"á",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"å",3));
		wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ò",3));
		//wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ø",3));
		//wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"é",3));
//		//wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"à",3));
//		//wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ä",3));
//		//wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ë",3));
//		//wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ü",3));
//		//wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ù",3));
//		//wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"å",3));
//		//wordSearcher.searchConditions.add(new SearchCondition(SearchConditionKind.NO_ENTRY,"ê",3));
		
		wordSearcher.searchFile();
	}

}
