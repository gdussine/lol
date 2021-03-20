package fr.gdussine.lol.api.model.status;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Incident {

	private boolean active;
	private long id;
	@JsonProperty("created_at")
	private String createdAt;
	private List<Message> updates;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public List<Message> getUpdates() {
		return updates;
	}

	public void setUpdates(List<Message> updates) {
		this.updates = updates;
	}

}
