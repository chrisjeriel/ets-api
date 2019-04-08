package ph.cpi.rest.api.model.request;

import java.util.List;

public class SavePolEndtOcRequest {
	private String policyId;
	private List<PolEndorsements> saveEndorsements;
	private List<PolEndorsements> deleteEndorsements;
	private List<UwDeductibles> saveDeductibleList;
	private List<UwDeductibles> deleteDeductibleList;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public List<PolEndorsements> getSaveEndorsements() {
		return saveEndorsements;
	}
	public void setSaveEndorsements(List<PolEndorsements> saveEndorsements) {
		this.saveEndorsements = saveEndorsements;
	}
	public List<PolEndorsements> getDeleteEndorsements() {
		return deleteEndorsements;
	}
	public void setDeleteEndorsements(List<PolEndorsements> deleteEndorsements) {
		this.deleteEndorsements = deleteEndorsements;
	}
	public List<UwDeductibles> getSaveDeductibleList() {
		return saveDeductibleList;
	}
	public void setSaveDeductibleList(List<UwDeductibles> saveDeductibleList) {
		this.saveDeductibleList = saveDeductibleList;
	}
	public List<UwDeductibles> getDeleteDeductibleList() {
		return deleteDeductibleList;
	}
	public void setDeleteDeductibleList(List<UwDeductibles> deleteDeductibleList) {
		this.deleteDeductibleList = deleteDeductibleList;
	}
	@Override
	public String toString() {
		return "SavePolEndtOcRequest [policyId=" + policyId + ", saveEndorsements=" + saveEndorsements
				+ ", deleteEndorsements=" + deleteEndorsements + "]";
	}
	
	
	
	
}

