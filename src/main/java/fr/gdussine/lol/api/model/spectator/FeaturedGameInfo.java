package fr.gdussine.lol.api.model.spectator;

import java.util.List;

public class FeaturedGameInfo {

	private long gameId, gameStartTime, mapId, gameLength, gameQueueConfigId;

	private String gameType, platformId, gameMode;

	private List<BannedChampion> bannedChampions;

	private Observer observers;

	private List<FeaturedParticipant> participants;

	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	public long getGameStartTime() {
		return gameStartTime;
	}

	public void setGameStartTime(long gameStartTime) {
		this.gameStartTime = gameStartTime;
	}

	public long getMapId() {
		return mapId;
	}

	public void setMapId(long mapId) {
		this.mapId = mapId;
	}

	public long getGameLength() {
		return gameLength;
	}

	public void setGameLength(long gameLength) {
		this.gameLength = gameLength;
	}

	public long getGameQueueConfigId() {
		return gameQueueConfigId;
	}

	public void setGameQueueConfigId(long gameQueueConfigId) {
		this.gameQueueConfigId = gameQueueConfigId;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getGameMode() {
		return gameMode;
	}

	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}

	public List<BannedChampion> getBannedChampions() {
		return bannedChampions;
	}

	public void setBannedChampions(List<BannedChampion> bannedChampions) {
		this.bannedChampions = bannedChampions;
	}

	public Observer getObservers() {
		return observers;
	}

	public void setObservers(Observer observers) {
		this.observers = observers;
	}

	public List<FeaturedParticipant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<FeaturedParticipant> participants) {
		this.participants = participants;
	}

}
