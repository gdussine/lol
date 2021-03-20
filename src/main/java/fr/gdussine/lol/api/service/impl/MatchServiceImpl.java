package fr.gdussine.lol.api.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.gdussine.lol.api.model.match.Match;
import fr.gdussine.lol.api.model.match.MatchList;
import fr.gdussine.lol.api.model.match.MatchTimeline;
import fr.gdussine.lol.api.service.AbstractService;
import fr.gdussine.lol.api.service.MatchService;
import fr.gdussine.lol.api.service.RiotService;
import fr.gdussine.lol.core.RiotRequesterHelper;

@RiotService(game = "lol", name = "match", version = 4)
public class MatchServiceImpl extends AbstractService implements MatchService {

	private static final String BY_ID = "matches/%d", BY_ACCOUNT = "matchlists/by-account/%s",
			TIMELINE = "timelines/by-match/%d";

	public MatchServiceImpl(RiotRequesterHelper requester) {
		super(requester);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CompletableFuture<Match> byId(Long matchId) {
		return one(Match.class, BY_ID, matchId);
	}

	@Override
	public CompletableFuture<MatchList> byAccount(String encryptedAccountId) {
		return one(MatchList.class, BY_ACCOUNT, encryptedAccountId);
	}

	@Override
	public CompletableFuture<MatchList> byAccount(String encryptedAccountId, Integer champion, Integer queue,
			Long endTime, Long beginTime, Integer endIndex, Integer beginIndex) {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> params = new HashMap<String, String>();
		try {
			if (champion != null)
				params.put("champion", mapper.writeValueAsString(champion));
			if (queue != null)
				params.put("queue", mapper.writeValueAsString(queue));
			if (endTime != null)
				params.put("endTime", endTime + "");
			if (beginTime != null)
				params.put("beginTime ", beginTime + "");
			if (endIndex != null)
				params.put("endIndex", endIndex + "");
			if (beginIndex != null)
				params.put("beginIndex", beginIndex + "");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return one(MatchList.class, BY_ACCOUNT, params, encryptedAccountId);
	}

	@Override
	public CompletableFuture<MatchTimeline> timeline(Long matchId) {
		return one(MatchTimeline.class, TIMELINE, matchId);
	}

}
