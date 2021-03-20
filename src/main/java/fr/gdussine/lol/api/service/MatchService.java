package fr.gdussine.lol.api.service;

import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.match.Match;
import fr.gdussine.lol.api.model.match.MatchList;
import fr.gdussine.lol.api.model.match.MatchTimeline;

public interface MatchService {

	public CompletableFuture<Match> byId(Long matchId);

	public CompletableFuture<MatchList> byAccount(String encryptedAccountId);

	public CompletableFuture<MatchList> byAccount(String encryptedAccountId, Integer champion, Integer queue,
			Long endTime, Long beginTime, Integer endIndex, Integer beginIndex);

	public CompletableFuture<MatchTimeline> timeline(Long matchId);

}
