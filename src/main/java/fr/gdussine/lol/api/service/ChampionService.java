package fr.gdussine.lol.api.service;

import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.champion.ChampionInfo;

public interface ChampionService {

	public CompletableFuture<ChampionInfo> rotation();

}
