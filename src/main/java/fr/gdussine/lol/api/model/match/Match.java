package fr.gdussine.lol.api.model.match;

import java.util.List;

public class Match {

	private long gameId;
	private List<TeamStats> participantIdentities;
	private int queueId;
	private String gameType;
	private long gameDuration;
	private List<TeamStats> teams;
	private String platformId;
	private long gameCreation;
	private int seasonId;
	private String gameVersion;
	private int mapId;
	private String gameMode;
	private List<Participant> participants;

	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	public List<TeamStats> getParticipantIdentities() {
		return participantIdentities;
	}

	public void setParticipantIdentities(List<TeamStats> participantIdentities) {
		this.participantIdentities = participantIdentities;
	}

	public int getQueueId() {
		return queueId;
	}

	public void setQueueId(int queueId) {
		this.queueId = queueId;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public long getGameDuration() {
		return gameDuration;
	}

	public void setGameDuration(long gameDuration) {
		this.gameDuration = gameDuration;
	}

	public List<TeamStats> getTeams() {
		return teams;
	}

	public void setTeams(List<TeamStats> teams) {
		this.teams = teams;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public long getGameCreation() {
		return gameCreation;
	}

	public void setGameCreation(long gameCreation) {
		this.gameCreation = gameCreation;
	}

	public int getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(int seasonId) {
		this.seasonId = seasonId;
	}

	public String getGameVersion() {
		return gameVersion;
	}

	public void setGameVersion(String gameVersion) {
		this.gameVersion = gameVersion;
	}

	public int getMapId() {
		return mapId;
	}

	public void setMapId(int mapId) {
		this.mapId = mapId;
	}

	public String getGameMode() {
		return gameMode;
	}

	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

}
