package fr.gdussine.lol.constant;

public class Queue {
	
	private int queueId;
	private String map ;
	private String description;
	private String notes;
	public int getQueueId() {
		return queueId;
	}
	public void setQueueId(int queueId) {
		this.queueId = queueId;
	}
	public String getMap() {
		return map;
	}
	public void setMap(String map) {
		this.map = map;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "Queue [queueId=" + queueId + ", map=" + map + ", description=" + description + "]";
	}

}
