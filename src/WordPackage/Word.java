package WordPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Word implements Comparable<Word>{
	// 하나의 단어에 뜻을 여러개 저장하기 위한 클래스
	
	private String word;
	private List<String> mean;
	
	public Word() {
		mean = new ArrayList<>();
	}
	
	public Word(String word) {
		this();
		this.word = word;
	}
	
	public Word(String word, List<String> mean) {
		this.word = word;
		this.mean = mean;
	}
	
	
	

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public List<String> getMean() {
		return mean;
	}

	public void setMean(List<String> mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return word + ": " + mean;
	}

	@Override
	public int hashCode() {
		return Objects.hash(word);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}

	@Override
	public int compareTo(Word o) {
		// this와 o를 비교 => 오름차순
		return this.word.compareTo(o.getWord());
	}
	
	
	
	
	
	
	
	
	
	
	//END
	
}
