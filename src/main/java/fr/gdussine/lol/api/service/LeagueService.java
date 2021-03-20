package fr.gdussine.lol.api.service;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.league.LeagueEntry;
import fr.gdussine.lol.api.model.league.LeagueList;
import fr.gdussine.lol.api.model.league.Queue;
import fr.gdussine.lol.api.model.league.Rank;
import fr.gdussine.lol.api.model.league.Tier;

public interface LeagueService {

	public CompletableFuture<LeagueList> challenger(Queue queue);

	public CompletableFuture<LeagueList> master(Queue queue);

	public CompletableFuture<LeagueList> grandmaster(Queue queue);

	public CompletableFuture<Set<LeagueEntry>> bySummoner(String encryptedSummonerId);

	public CompletableFuture<Set<LeagueEntry>> byQueueTierDivision(Queue queue, Tier tier, Rank division);

	public CompletableFuture<Set<LeagueEntry>> byQueueTierDivision(Queue queue, Tier tier, Rank division, int page);

	public CompletableFuture<LeagueList> byId(String leagueId);

}
