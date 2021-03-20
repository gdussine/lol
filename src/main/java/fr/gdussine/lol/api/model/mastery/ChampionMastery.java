package fr.gdussine.lol.api.model.mastery;

public class ChampionMastery {

	private boolean chestGranted;
	private long championPointsUntilNextLevel, championPointsSinceLastLevel, championId, lastPlayTime;
	private int championLevel, championPoints, tokensEarned;
	private String summonerId;

	public boolean isChestGranted() {
		return chestGranted;
	}

	public void setChestGranted(boolean chestGranted) {
		this.chestGranted = chestGranted;
	}

	public long getChampionPointsUntilNextLevel() {
		return championPointsUntilNextLevel;
	}

	public void setChampionPointsUntilNextLevel(long championPointsUntilNextLevel) {
		this.championPointsUntilNextLevel = championPointsUntilNextLevel;
	}

	public long getChampionPointsSinceLastLevel() {
		return championPointsSinceLastLevel;
	}

	public void setChampionPointsSinceLastLevel(long championPointsSinceLastLevel) {
		this.championPointsSinceLastLevel = championPointsSinceLastLevel;
	}

	public long getChampionId() {
		return championId;
	}

	public void setChampionId(long championId) {
		this.championId = championId;
	}

	public long getLastPlayTime() {
		return lastPlayTime;
	}

	public void setLastPlayTime(long lastPlayTime) {
		this.lastPlayTime = lastPlayTime;
	}

	public int getChampionLevel() {
		return championLevel;
	}

	public void setChampionLevel(int championLevel) {
		this.championLevel = championLevel;
	}

	public int getChampionPoints() {
		return championPoints;
	}

	public void setChampionPoints(int championPoints) {
		this.championPoints = championPoints;
	}

	public int getTokensEarned() {
		return tokensEarned;
	}

	public void setTokensEarned(int tokensEarned) {
		this.tokensEarned = tokensEarned;
	}

	public String getSummonerId() {
		return summonerId;
	}

	public void setSummonerId(String summonerId) {
		this.summonerId = summonerId;
	}

}
