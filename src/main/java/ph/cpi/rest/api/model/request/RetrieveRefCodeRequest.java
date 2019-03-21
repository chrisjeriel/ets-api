package ph.cpi.rest.api.model.request;

public class RetrieveRefCodeRequest {
	
	private String identifier;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public String toString() {
		return "RetrieveRefCodeRequest [identifier=" + identifier + "]";
	}
}
