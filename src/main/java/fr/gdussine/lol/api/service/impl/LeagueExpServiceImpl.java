package fr.gdussine.lol.api.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.league.LeagueEntry;
import fr.gdussine.lol.api.model.league.Queue;
import fr.gdussine.lol.api.model.league.Rank;
import fr.gdussine.lol.api.model.league.Tier;
import fr.gdussine.lol.api.service.AbstractService;
import fr.gdussine.lol.api.service.LeagueExpService;
import fr.gdussine.lol.api.service.RiotService;
import fr.gdussine.lol.core.RiotRequesterHelper;

@RiotService(game = "lol", name = "league-exp", version = 4)
public class LeagueExpServiceImpl extends AbstractService implements LeagueExpService {

	private static final String BY_QUEUE_TIER_DIVISION = "entries/%s/%s/%s";

	public LeagueExpServiceImpl(RiotRequesterHelper requester) {
		super(requester);
	}

	@Override
	public CompletableFuture<Set<LeagueEntry>> byQueueTierDivision(Queue queue, Tier tier, Rank division, int page) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("page", page + "");
		return set(LeagueEntry.class, BY_QUEUE_TIER_DIVISION, params, queue, tier, division);
	}

	@Override
	public CompletableFuture<Set<LeagueEntry>> byQueueTierDivision(Queue queue, Tier tier, Rank division) {
		return set(LeagueEntry.class, BY_QUEUE_TIER_DIVISION, queue, tier, division);
	}

}
