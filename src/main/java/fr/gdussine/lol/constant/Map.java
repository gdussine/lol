package fr.gdussine.lol.constant;

public class Map {

	private int mapId;
	private String mapName;
	private String notes;

	public int getMapId() {
		return mapId;
	}

	public void setMapId(int mapId) {
		this.mapId = mapId;
	}

	public String getMapName() {
		return mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Map [mapId=" + mapId + ", mapName=" + mapName + "]";
	}

}
