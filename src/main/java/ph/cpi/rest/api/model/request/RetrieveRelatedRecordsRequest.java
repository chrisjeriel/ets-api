package ph.cpi.rest.api.model.request;

public class RetrieveRelatedRecordsRequest {
	
	private String module;
	private String referenceId;
	
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	@Override
	public String toString() {
		return "RetrieveRelatedRecordsRequest [module=" + module + ", referenceId=" + referenceId + "]";
	}
	
}
