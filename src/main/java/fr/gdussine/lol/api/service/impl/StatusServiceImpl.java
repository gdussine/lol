package fr.gdussine.lol.api.service.impl;

import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.status.ShardStatus;
import fr.gdussine.lol.api.service.AbstractService;
import fr.gdussine.lol.api.service.RiotService;
import fr.gdussine.lol.api.service.StatusService;
import fr.gdussine.lol.core.RiotRequesterHelper;

@RiotService(game = "lol", name = "status", version = 3)
public class StatusServiceImpl extends AbstractService implements StatusService {

	private final static String SHARD_DATA = "shard-data";

	public StatusServiceImpl(RiotRequesterHelper requester) {
		super(requester);
	}

	public CompletableFuture<ShardStatus> shardData() {
		return one(ShardStatus.class, SHARD_DATA);
	}

}
