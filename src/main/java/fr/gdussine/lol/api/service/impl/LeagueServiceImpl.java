package fr.gdussine.lol.api.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.league.LeagueEntry;
import fr.gdussine.lol.api.model.league.LeagueList;
import fr.gdussine.lol.api.model.league.Queue;
import fr.gdussine.lol.api.model.league.Rank;
import fr.gdussine.lol.api.model.league.Tier;
import fr.gdussine.lol.api.service.AbstractService;
import fr.gdussine.lol.api.service.LeagueService;
import fr.gdussine.lol.api.service.RiotService;
import fr.gdussine.lol.core.RiotRequesterHelper;

@RiotService(game = "lol", name = "league", version = 4)
public class LeagueServiceImpl extends AbstractService implements LeagueService {

	private final static String BY_SUMMONER = "entries/by-summoner/%s",
			CHALLENGER_BY_QUEUE = "challengerleagues/by-queue/%s",
			GRANDMASTER_BY_QUEUE = "grandmasterleagues/by-queue/%s", MASTER_BY_QUEUE = "masterleagues/by_queue/%s",
			BY_QUEUE_TIER_DIVISION = "entries/%s/%s/%s", BY_ID = "leagues/%s";

	public LeagueServiceImpl(RiotRequesterHelper requester) {
		super(requester);
	}

	public CompletableFuture<LeagueList> challenger(Queue queue) {
		return one(LeagueList.class, CHALLENGER_BY_QUEUE, queue);
	}

	public CompletableFuture<LeagueList> master(Queue queue) {
		return one(LeagueList.class, MASTER_BY_QUEUE, queue);
	}

	public CompletableFuture<LeagueList> grandmaster(Queue queue) {
		return one(LeagueList.class, GRANDMASTER_BY_QUEUE, queue);
	}

	public CompletableFuture<Set<LeagueEntry>> bySummoner(String encryptedSummonerId) {
		return set(LeagueEntry.class, BY_SUMMONER, encryptedSummonerId);
	}

	public CompletableFuture<Set<LeagueEntry>> byQueueTierDivision(Queue queue, Tier tier, Rank division, int page) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("page", page + "");
		return set(LeagueEntry.class, BY_QUEUE_TIER_DIVISION, params, queue, tier, division);
	}

	public CompletableFuture<Set<LeagueEntry>> byQueueTierDivision(Queue queue, Tier tier, Rank division) {
		return set(LeagueEntry.class, BY_QUEUE_TIER_DIVISION, queue, tier, division);
	}

	public CompletableFuture<LeagueList> byId(String leagueId) {
		return one(LeagueList.class, BY_ID, leagueId);
	}

}
