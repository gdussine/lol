package fr.gdussine.lol.api.model.match;

import java.util.List;

public class TeamStats {

	private int towerKills, riftHeraldKills;
	private boolean firstBlood;
	private int inhibitorKills;
	private List<TeamBans> bans;
	private boolean firstBaron, firstDragon, firstInhibitor, firstTower;
	private int dominionVictoryScore, dragonKills, baronKills;
	private int vilemawKills;
	private boolean firstRiftHerald;
	private int teamId;
	private String win;
	private int participantId;
	private Player player;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getParticipantId() {
		return participantId;
	}

	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}

	public int getTowerKills() {
		return towerKills;
	}

	public void setTowerKills(int towerKills) {
		this.towerKills = towerKills;
	}

	public int getRiftHeraldKills() {
		return riftHeraldKills;
	}

	public void setRiftHeraldKills(int riftHeraldKills) {
		this.riftHeraldKills = riftHeraldKills;
	}

	public boolean isFirstBlood() {
		return firstBlood;
	}

	public void setFirstBlood(boolean firstBlood) {
		this.firstBlood = firstBlood;
	}

	public int getInhibitorKills() {
		return inhibitorKills;
	}

	public void setInhibitorKills(int inhibitorKills) {
		this.inhibitorKills = inhibitorKills;
	}

	public List<TeamBans> getBans() {
		return bans;
	}

	public void setBans(List<TeamBans> bans) {
		this.bans = bans;
	}

	public boolean isFirstBaron() {
		return firstBaron;
	}

	public void setFirstBaron(boolean firstBaron) {
		this.firstBaron = firstBaron;
	}

	public boolean isFirstDragon() {
		return firstDragon;
	}

	public void setFirstDragon(boolean firstDragon) {
		this.firstDragon = firstDragon;
	}

	public boolean isFirstInhibitor() {
		return firstInhibitor;
	}

	public void setFirstInhibitor(boolean firstInhibitor) {
		this.firstInhibitor = firstInhibitor;
	}

	public boolean isFirstTower() {
		return firstTower;
	}

	public void setFirstTower(boolean firstTower) {
		this.firstTower = firstTower;
	}

	public int getDominionVictoryScore() {
		return dominionVictoryScore;
	}

	public void setDominionVictoryScore(int dominionVictoryScore) {
		this.dominionVictoryScore = dominionVictoryScore;
	}

	public int getDragonKills() {
		return dragonKills;
	}

	public void setDragonKills(int dragonKills) {
		this.dragonKills = dragonKills;
	}

	public int getBaronKills() {
		return baronKills;
	}

	public void setBaronKills(int baronKills) {
		this.baronKills = baronKills;
	}

	public int getVilemawKills() {
		return vilemawKills;
	}

	public void setVilemawKills(int vilemawKills) {
		this.vilemawKills = vilemawKills;
	}

	public boolean isFirstRiftHerald() {
		return firstRiftHerald;
	}

	public void setFirstRiftHerald(boolean firstRiftHerald) {
		this.firstRiftHerald = firstRiftHerald;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getWin() {
		return win;
	}

	public void setWin(String win) {
		this.win = win;
	}

}
