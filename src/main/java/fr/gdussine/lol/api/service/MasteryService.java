package fr.gdussine.lol.api.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.mastery.ChampionMastery;

public interface MasteryService {

	public CompletableFuture<List<ChampionMastery>> bySummoner(String encryptedSummonerId);

	public CompletableFuture<ChampionMastery> bySummonerAndChampion(String encryptedSummonerId, Long championId);

	public CompletableFuture<Integer> score(String encryptedSummonerId);

}
