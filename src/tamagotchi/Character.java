package tamagotchi;

public class Character {

	private String characterName; 
	private int characterStamina; 
	private int characterClean; 
	private int characterExp; 
	private int characterLevel; 
	
	private int[] minExp = {0, 0, 100, 250};
	
	public Character() {}
	public Character(String characterName) {
		this.characterName = characterName;
		this.characterStamina = 80;
		this.characterClean = 50;
		this.characterExp = 0;
		this.characterLevel = 1;
	}
	
	public void gainStamina(int amount) {
		characterStamina += amount;
		if (characterStamina > 80) {
			characterStamina = 80;
		}
		
	}
	
	public void loseStamina(int amount) {
		characterStamina -= amount;
		if (characterStamina < 0) {
			characterStamina = 0;
		}
	}
	
	public void gainClean (int amount) {
		characterClean += amount;
		if (characterClean > 50) {
			characterClean = 50;
		}
		
	}
	
	public void loseClean (int amount) {
		characterClean -= amount;
		if (characterClean < 0) {
			characterClean = 0;
		}
	}
	
	public boolean gainExp (int amount) {
		
		characterExp += amount;
		
		boolean isLevelUp = false;
		for (int nxtLevel = characterLevel + 1; nxtLevel <= 3; nxtLevel++) {
			if (characterExp >= minExp[nxtLevel]) {
				characterLevel = nxtLevel;
				isLevelUp = true;
			}
		}
		
		if (characterExp > 250) characterExp = 250;
		
		return isLevelUp;
	}
	
	public void loseExp(int amount) {
		
		characterExp -= amount;
		
		if (characterExp < minExp[characterLevel]) {
			characterExp = minExp[characterLevel];
		}
	}
	
	public int getLvExp(int level) {
		if (level > 3) return minExp[3];
		return minExp[level];
	}
	
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public int getCharacterStamina() {
		return characterStamina;
	}
	public void setCharacterStamina(int characterStamina) {
		this.characterStamina = characterStamina;
	}
	public int getCharacterClean() {
		return characterClean;
	}
	public void setCharacterClean(int characterClean) {
		this.characterClean = characterClean;
	}
	public int getCharacterExp() {
		return characterExp;
	}
	public void setCharacterExp(int characterExp) {
		this.characterExp = characterExp;
	}
	public int getCharacterLevel() {
		return characterLevel;
	}
	public void setCharacterLevel(int characterLevel) {
		this.characterLevel = characterLevel;
	}
	@Override
	public String toString() {
		return "Character [characterName=" + characterName + ", characterStamina=" + characterStamina
				+ ", characterClean=" + characterClean + ", characterExp=" + characterExp + ", characterLevel="
				+ characterLevel + "]";
	}

}
