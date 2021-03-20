package fr.gdussine.lol.api.model.status;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Translation {

	@JsonProperty("updated_at")
	private String updatedAt;
	private String locale;
	private String content;

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
