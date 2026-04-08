package day18;

public enum Company02 {
	SK("에스케이"),
	KT("케이티"),
	LG("엘지"),
	알뜰폰("알뜰폰");
	
	private final String value;
	
	Company02(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
}
