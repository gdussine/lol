package fr.gdussine.lol.api.service.impl;

import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.champion.ChampionInfo;
import fr.gdussine.lol.api.service.ChampionService;
import fr.gdussine.lol.api.service.RiotService;
import fr.gdussine.lol.api.service.AbstractService;
import fr.gdussine.lol.core.RiotRequesterHelper;

@RiotService(game = "lol", name = "platform", version = 3)
public class ChampionServiceImpl extends AbstractService implements ChampionService {

	private final static String CHAMPION_ROTATIONS = "champion-rotations";

	public ChampionServiceImpl(RiotRequesterHelper requester) {
		super(requester);
	}

	@Override
	public CompletableFuture<ChampionInfo> rotation() {
		return one(ChampionInfo.class, CHAMPION_ROTATIONS);
	}

}
