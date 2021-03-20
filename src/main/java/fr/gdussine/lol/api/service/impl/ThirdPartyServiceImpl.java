package fr.gdussine.lol.api.service.impl;

import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.service.AbstractService;
import fr.gdussine.lol.api.service.RiotService;
import fr.gdussine.lol.api.service.ThirdPartyService;
import fr.gdussine.lol.core.RiotRequesterHelper;

@RiotService(game = "lol", name = "platform", version = 4)
public class ThirdPartyServiceImpl extends AbstractService implements ThirdPartyService {

	private static final String CODE = "third-party-code/by-summoner/%s";

	public ThirdPartyServiceImpl(RiotRequesterHelper requester) {
		super(requester);
	}

	@Override
	public CompletableFuture<String> code(String encryptedSummonerId) {
		return one(String.class, CODE, encryptedSummonerId);
	}

}
