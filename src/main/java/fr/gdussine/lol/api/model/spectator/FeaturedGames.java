package fr.gdussine.lol.api.model.spectator;

import java.util.List;

public class FeaturedGames {

	private long clientRefreshInterval;

	private List<FeaturedGameInfo> gameList;

	public long getClientRefreshInterval() {
		return clientRefreshInterval;
	}

	public void setClientRefreshInterval(long clientRefreshInterval) {
		this.clientRefreshInterval = clientRefreshInterval;
	}

	public List<FeaturedGameInfo> getGameList() {
		return gameList;
	}

	public void setGameList(List<FeaturedGameInfo> gameList) {
		this.gameList = gameList;
	}

}
