package fr.gdussine.lol.api.model.match;

public class MatchParticipantFrame {

	private int participantId, minionsKilled, teamScore, dominionScore, totalGold, level, xp, currentGold,
			jungleMinionsKilled;

	private MatchPosition position;

	public int getParticipantId() {
		return participantId;
	}

	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}

	public int getMinionsKilled() {
		return minionsKilled;
	}

	public void setMinionsKilled(int minionsKilled) {
		this.minionsKilled = minionsKilled;
	}

	public int getTeamScore() {
		return teamScore;
	}

	public void setTeamScore(int teamScore) {
		this.teamScore = teamScore;
	}

	public int getDominionScore() {
		return dominionScore;
	}

	public void setDominionScore(int dominionScore) {
		this.dominionScore = dominionScore;
	}

	public int getTotalGold() {
		return totalGold;
	}

	public void setTotalGold(int totalGold) {
		this.totalGold = totalGold;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getCurrentGold() {
		return currentGold;
	}

	public void setCurrentGold(int currentGold) {
		this.currentGold = currentGold;
	}

	public int getJungleMinionsKilled() {
		return jungleMinionsKilled;
	}

	public void setJungleMinionsKilled(int jungleMinionsKilled) {
		this.jungleMinionsKilled = jungleMinionsKilled;
	}

	public MatchPosition getPosition() {
		return position;
	}

	public void setPosition(MatchPosition position) {
		this.position = position;
	}

}
