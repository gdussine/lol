package fr.gdussine.lol.api.model.league;

public class LeagueItem {

	private int wins, leaguePoints, losses;
	private String summonerName, rank, summonerId;
	private MiniSeries miniSeries;
	private boolean inactive, veteran, hotStreak, freshBlood;

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLeaguePoints() {
		return leaguePoints;
	}

	public void setLeaguePoints(int leaguePoints) {
		this.leaguePoints = leaguePoints;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public String getSummonerName() {
		return summonerName;
	}

	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getSummonerId() {
		return summonerId;
	}

	public void setSummonerId(String summonerId) {
		this.summonerId = summonerId;
	}

	public MiniSeries getMiniSeries() {
		return miniSeries;
	}

	public void setMiniSeries(MiniSeries miniSeries) {
		this.miniSeries = miniSeries;
	}

	public boolean isInactive() {
		return inactive;
	}

	public void setInactive(boolean inactive) {
		this.inactive = inactive;
	}

	public boolean isVeteran() {
		return veteran;
	}

	public void setVeteran(boolean veteran) {
		this.veteran = veteran;
	}

	public boolean isHotStreak() {
		return hotStreak;
	}

	public void setHotStreak(boolean hotStreak) {
		this.hotStreak = hotStreak;
	}

	public boolean isFreshBlood() {
		return freshBlood;
	}

	public void setFreshBlood(boolean freshBlood) {
		this.freshBlood = freshBlood;
	}

}
