package fr.gdussine.lol.api.model.league;

import java.util.List;

public class LeagueList {

	private String leagueId, tier, name, queue;
	private List<LeagueItem> entries;

	public String getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQueue() {
		return queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}

	public List<LeagueItem> getEntries() {
		return entries;
	}

	public void setEntries(List<LeagueItem> entries) {
		this.entries = entries;
	}

}
