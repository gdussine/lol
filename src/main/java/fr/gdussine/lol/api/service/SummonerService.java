package fr.gdussine.lol.api.service;

import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.summoner.Summoner;

public interface SummonerService {

	public CompletableFuture<Summoner> byName(String summonerName);

	public CompletableFuture<Summoner> byAccountId(String encryptedAccountId);

	public CompletableFuture<Summoner> byPUUID(String encryptedPUUID);

	public CompletableFuture<Summoner> bySummonerId(String encryptedSummonerId);

}
