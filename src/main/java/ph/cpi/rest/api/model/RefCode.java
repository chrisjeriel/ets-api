package ph.cpi.rest.api.model;

public class RefCode {
	
	private String code;
	private String identifier;
	private String description;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "RefCode [code=" + code + ", identifier=" + identifier + ", description=" + description + "]";
	}
}
