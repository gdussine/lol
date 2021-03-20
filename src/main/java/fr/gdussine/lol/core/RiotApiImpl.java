package fr.gdussine.lol.core;

import java.io.File;

import fr.gdussine.lol.api.service.ChampionService;
import fr.gdussine.lol.api.service.LeagueExpService;
import fr.gdussine.lol.api.service.LeagueService;
import fr.gdussine.lol.api.service.MasteryService;
import fr.gdussine.lol.api.service.MatchService;
import fr.gdussine.lol.api.service.SpectatorService;
import fr.gdussine.lol.api.service.StatusService;
import fr.gdussine.lol.api.service.SummonerService;
import fr.gdussine.lol.api.service.ThirdPartyService;
import fr.gdussine.lol.api.service.impl.LeagueServiceImpl;
import fr.gdussine.lol.api.service.impl.MasteryServiceImpl;
import fr.gdussine.lol.api.service.impl.MatchServiceImpl;
import fr.gdussine.lol.api.service.impl.SpectatorServiceImpl;
import fr.gdussine.lol.api.service.impl.StatusServiceImpl;
import fr.gdussine.lol.api.service.impl.SummonerServiceImpl;
import fr.gdussine.lol.api.service.impl.ThirdPartyServiceImpl;
import fr.gdussine.lol.constant.ConstantProvider;
import fr.gdussine.lol.constant.PlatformHost;

public class RiotApiImpl implements RiotApi {

	private RiotRequesterHelper requester;

	private SummonerService summoners;
	private StatusService status;
	private MasteryService masteries;
	private LeagueService leagues;
	private ConstantProvider constants;

	private ChampionService champions;

	private LeagueExpService leaguesExp;

	private MatchService matchs;

	private SpectatorService spectators;

	private ThirdPartyService thirdParty;

	public RiotApiImpl(PlatformHost platform, String token) {
		requester = new RiotRequesterHelper(token, platform);
		generateServices();
	}

	public RiotApiImpl(PlatformHost platform, String token, File cacheDir, int cacheSize) {
		requester = new RiotRequesterHelper(token, platform, cacheDir, cacheSize);
		generateServices();
	}

	private void generateServices() {
		this.summoners = new SummonerServiceImpl(requester);
		this.status = new StatusServiceImpl(requester);
		this.masteries = new MasteryServiceImpl(requester);
		this.leagues = new LeagueServiceImpl(requester);
		this.constants = new ConstantProvider(requester);
		this.matchs = new MatchServiceImpl(requester);
		this.spectators = new SpectatorServiceImpl(requester);
		this.thirdParty = new ThirdPartyServiceImpl(requester);
	}

	@Override
	public SummonerService summoners() {
		return summoners;
	}

	@Override
	public StatusService status() {
		return status;
	}

	@Override
	public MasteryService masteries() {
		return masteries;
	}

	@Override
	public LeagueService leagues() {
		return leagues;
	}

	@Override
	public ConstantProvider constants() {
		return constants;
	}

	@Override
	public ChampionService champions() {
		return champions;
	}

	@Override
	public LeagueExpService leaguesExp() {
		return leaguesExp;
	}

	@Override
	public MatchService matchs() {
		return matchs;
	}

	@Override
	public SpectatorService spectators() {
		return spectators;
	}

	@Override
	public ThirdPartyService thirdParty() {
		return thirdParty;
	}

}
