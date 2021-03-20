package fr.gdussine.lol.api.service;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.league.LeagueEntry;
import fr.gdussine.lol.api.model.league.Queue;
import fr.gdussine.lol.api.model.league.Rank;
import fr.gdussine.lol.api.model.league.Tier;

public interface LeagueExpService {

	public CompletableFuture<Set<LeagueEntry>> byQueueTierDivision(Queue queue, Tier tier, Rank division, int page);

	public CompletableFuture<Set<LeagueEntry>> byQueueTierDivision(Queue queue, Tier tier, Rank division);

}
