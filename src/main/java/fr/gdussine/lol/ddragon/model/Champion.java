package fr.gdussine.lol.ddragon.model;

import java.util.Map;

public class Champion {

	private String version;
	private String id;
	private int key;
	private String name;
	private String title;
	private String blurb;
	private Map<String, Integer> info;
	private ChampionImage image;
	private String[] tags;
	private String partype;
	private ChampionStats stats;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBlurb() {
		return blurb;
	}

	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}

	public Map<String, Integer> getInfo() {
		return info;
	}

	public void setInfo(Map<String, Integer> info) {
		this.info = info;
	}

	public ChampionImage getImage() {
		return image;
	}

	public void setImage(ChampionImage image) {
		this.image = image;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public String getPartype() {
		return partype;
	}

	public void setPartype(String partype) {
		this.partype = partype;
	}

	public ChampionStats getStats() {
		return stats;
	}

	public void setStats(ChampionStats stats) {
		this.stats = stats;
	}

	@Override
	public String toString() {
		return "Champion [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Champion other = (Champion) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

}
