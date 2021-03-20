package fr.gdussine.lol.constant;

public class Season {

	private int id;
	private String season;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "Season [id=" + id + ", season=" + season + "]";
	}

}
