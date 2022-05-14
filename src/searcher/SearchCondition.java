package searcher;

public class SearchCondition {
	private SearchConditionKind Kind;
	private String Letter;
	private int Poistion;
	
	public SearchCondition(SearchConditionKind searchConditionKind,String Letter,int Poistion) {
		setKind(searchConditionKind);
		setLetter(Letter);
		setPoistion(Poistion);
	}
	
	public SearchConditionKind getKind() {
		return Kind;
	}
	public void setKind(SearchConditionKind kind) {
		Kind = kind;
	}
	public String getLetter() {
		return Letter;
	}
	public void setLetter(String letter) {
		Letter = letter;
	}
	public int getPoistion() {
		return Poistion;
	}
	public void setPoistion(int poistion) {
		Poistion = poistion;
	}
}
