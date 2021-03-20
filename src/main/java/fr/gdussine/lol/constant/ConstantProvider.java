package fr.gdussine.lol.constant;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.gdussine.lol.core.RiotRequesterHelper;
import fr.gdussine.lol.ddragon.model.Champion;
import okhttp3.HttpUrl;

public class ConstantProvider {

	private RiotRequesterHelper requester;
	private ObjectMapper mapper;
	private final String format = "docs/lol/%s.json";
	private List<Season> seasons;
	private List<Queue> queues;
	private List<Map> maps;
	private List<GameMode> gameModes;
	private List<GameType> gameTypes;
	private java.util.Map<String, Champion> championsByName;
	private java.util.Map<Integer, Champion> championsById;

	public ConstantProvider(RiotRequesterHelper requester) {
		this.mapper = new ObjectMapper();
		this.requester = requester;
	}

	private <T> List<T> load(Class<T> clazz) throws JsonMappingException, JsonProcessingException {
		String name = clazz.getSimpleName().substring(0, 1).toLowerCase() + clazz.getSimpleName().substring(1) + "s";
		HttpUrl url = requester.getPlatformlUrl(PlatformHost.STATIC, String.format(format, name));
		JavaType type = mapper.getTypeFactory().constructCollectionLikeType(List.class, clazz);
		return mapper.readValue(requester.runOld(url), type);
	}

	public void loadChampions() {
		HttpUrl url = requester.getPlatformlUrl(PlatformHost.DDRAGON, "cdn/10.10.3216176/data/en_US/champion.json");
		JavaType type = mapper.getTypeFactory().constructMapLikeType(java.util.Map.class, String.class, Champion.class);
		try {
			championsByName = mapper.readValue(mapper.readTree(requester.runOld(url)).get("data").toString(), type);
			championsById = new HashMap<Integer, Champion>();
			for (Entry<String, Champion> champion : championsByName.entrySet()) {
				championsById.put(champion.getValue().getKey(), champion.getValue());
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public void loadSeasons() throws JsonMappingException, JsonProcessingException {
		seasons = load(Season.class);
	}

	public void loadQueues() throws JsonMappingException, JsonProcessingException {
		queues = load(Queue.class);
	}

	public void loadMaps() throws JsonMappingException, JsonProcessingException {
		maps = load(Map.class);
	}

	public void loadGameModes() throws JsonMappingException, JsonProcessingException {
		gameModes = load(GameMode.class);
	}

	public void loadGameTypes() throws JsonMappingException, JsonProcessingException {
		gameTypes = load(GameType.class);
	}

	public List<Season> getSeasons() throws JsonMappingException, JsonProcessingException {
		if (seasons == null) {
			loadSeasons();
		}
		return seasons;
	}

	public List<Queue> getQueues() throws JsonMappingException, JsonProcessingException {
		if (queues == null) {
			loadQueues();
		}
		return queues;
	}

	public List<Map> getMaps() throws JsonMappingException, JsonProcessingException {
		if (maps == null) {
			loadMaps();
		}
		return maps;
	}

	public List<GameMode> getGameModes() throws JsonMappingException, JsonProcessingException {
		if (gameModes == null) {
			loadGameModes();
		}
		return gameModes;
	}

	public List<GameType> getGameTypes() throws JsonMappingException, JsonProcessingException {
		if (gameTypes == null) {
			loadGameTypes();
		}
		return gameTypes;
	}

	public java.util.Map<String, Champion> getChampionsByName() throws JsonMappingException, JsonProcessingException {
		if (championsByName == null) {
			loadChampions();
		}
		return championsByName;
	}

	public java.util.Map<Integer, Champion> getChampionsById() {
		if (championsById == null) {
			loadChampions();
		}
		return championsById;
	}

}
