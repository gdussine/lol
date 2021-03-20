package fr.gdussine.lol.api.model.league;

public class LeagueEntry implements Comparable<LeagueEntry> {

	private String leagueId, summonerId, summonerName, queueType;
	private Rank rank;
	private Tier tier;
	private int leaguePoints, wins, losses;
	private boolean hotStreak, veteran, freshBlood, inactive;
	private MiniSeries miniSeries;

	public String getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

	public String getSummonerId() {
		return summonerId;
	}

	public void setSummonerId(String summonerId) {
		this.summonerId = summonerId;
	}

	public String getSummonerName() {
		return summonerName;
	}

	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}

	public String getQueueType() {
		return queueType;
	}

	public void setQueueType(String queueType) {
		this.queueType = queueType;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Tier getTier() {
		return tier;
	}

	public void setTier(Tier tier) {
		this.tier = tier;
	}

	public int getLeaguePoints() {
		return leaguePoints;
	}

	public void setLeaguePoints(int leaguePoints) {
		this.leaguePoints = leaguePoints;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public boolean isHotStreak() {
		return hotStreak;
	}

	public void setHotStreak(boolean hotStreak) {
		this.hotStreak = hotStreak;
	}

	public boolean isVeteran() {
		return veteran;
	}

	public void setVeteran(boolean veteran) {
		this.veteran = veteran;
	}

	public boolean isFreshBlood() {
		return freshBlood;
	}

	public void setFreshBlood(boolean freshBlood) {
		this.freshBlood = freshBlood;
	}

	public boolean isInactive() {
		return inactive;
	}

	public void setInactive(boolean inactive) {
		this.inactive = inactive;
	}

	public MiniSeries getMiniSeries() {
		return miniSeries;
	}

	public void setMiniSeries(MiniSeries miniSeries) {
		this.miniSeries = miniSeries;
	}

	@Override
	public String toString() {
		return "LeagueEntry [summonerName=" + summonerName + ", queueType=" + queueType + ", rank=" + rank + ", tier="
				+ tier + ", leaguePoints=" + leaguePoints + "]";
	}

	@Override
	public int compareTo(LeagueEntry o) {
		if (this.getTier().compareTo(o.getTier()) != 0) {
			return this.getTier().compareTo(o.getTier());
		}
		if (this.getRank().compareTo(o.getRank()) != 0) {
			return this.getRank().compareTo(o.getRank());
		}
		return Integer.compare(this.leaguePoints, o.getLeaguePoints());
	}

}
