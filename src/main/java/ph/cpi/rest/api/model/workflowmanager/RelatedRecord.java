package ph.cpi.rest.api.model.workflowmanager;

public class RelatedRecord {

	private String module;
	private String referenceId;
	private String referenceNo;
	
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
	public String getReferenceNo() {
		return referenceNo;
	}
	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}
	@Override
	public String toString() {
		return "RelatedRecord [module=" + module + ", referenceId=" + referenceId + ", referenceNo=" + referenceNo
				+ "]";
	}
	
}
