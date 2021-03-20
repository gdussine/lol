package fr.gdussine.lol.api.service.impl;

import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.summoner.Summoner;
import fr.gdussine.lol.api.service.AbstractService;
import fr.gdussine.lol.api.service.RiotService;
import fr.gdussine.lol.api.service.SummonerService;
import fr.gdussine.lol.core.RiotRequesterHelper;

@RiotService(game = "lol", name = "summoner", version = 4)
public class SummonerServiceImpl extends AbstractService implements SummonerService {

	public SummonerServiceImpl(RiotRequesterHelper requester) {
		super(requester);
	}

	private final static String BY_ACCOUNT_ID = "summoners/by-account/%s", BY_NAME = "summoners/by-name/%s",
			BY_PUUID = "summoners/by-puuid/%s", BY_SUMMONER_ID = "summoners/%s";

	public CompletableFuture<Summoner> byName(String summonerName) {
		return one(Summoner.class, BY_NAME, summonerName);
	}

	public CompletableFuture<Summoner> byAccountId(String encryptedAccountId) {
		return one(Summoner.class, BY_ACCOUNT_ID, encryptedAccountId);
	}

	public CompletableFuture<Summoner> byPUUID(String encryptedPUUID) {
		return one(Summoner.class, BY_PUUID, encryptedPUUID);
	}

	public CompletableFuture<Summoner> bySummonerId(String encryptedSummonerId) {
		return one(Summoner.class, BY_SUMMONER_ID, encryptedSummonerId);
	}

}
