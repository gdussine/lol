package fr.gdussine.lol.core;

import fr.gdussine.lol.api.service.ChampionService;
import fr.gdussine.lol.api.service.LeagueExpService;
import fr.gdussine.lol.api.service.LeagueService;
import fr.gdussine.lol.api.service.MasteryService;
import fr.gdussine.lol.api.service.MatchService;
import fr.gdussine.lol.api.service.SpectatorService;
import fr.gdussine.lol.api.service.StatusService;
import fr.gdussine.lol.api.service.SummonerService;
import fr.gdussine.lol.api.service.ThirdPartyService;
import fr.gdussine.lol.constant.ConstantProvider;

public interface RiotApi {

	public ChampionService champions();

	public LeagueExpService leaguesExp();

	public MatchService matchs();

	public SpectatorService spectators();

	public ThirdPartyService thirdParty();

	public SummonerService summoners();

	public StatusService status();

	public MasteryService masteries();

	public LeagueService leagues();

	public ConstantProvider constants();

}
