package fr.gdussine.lol.api.model.status;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShardStatus {

	private List<String> locales;
	private String hostname, name, slug;
	private List<Service> services;
	@JsonProperty("region_tag")
	private String regionTag;

	public List<String> getLocales() {
		return locales;
	}

	public void setLocales(List<String> locales) {
		this.locales = locales;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public String getRegionTag() {
		return regionTag;
	}

	public void setRegionTag(String regionTag) {
		this.regionTag = regionTag;
	}

}
