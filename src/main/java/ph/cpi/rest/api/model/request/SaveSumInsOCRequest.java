package ph.cpi.rest.api.model.request;

public class SaveSumInsOCRequest {
	private String policyId;
	private String pctShare;
	private String pctPml;
	private String totalValue;
	private String updateUser;
	private String updateDate;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getPctShare() {
		return pctShare;
	}
	public void setPctShare(String pctShare) {
		this.pctShare = pctShare;
	}
	public String getPctPml() {
		return pctPml;
	}
	public void setPctPml(String pctPml) {
		this.pctPml = pctPml;
	}
	public String getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "SaveSumInsOCRequest [policyId=" + policyId + ", pctShare=" + pctShare + ", pctPml=" + pctPml
				+ ", totalValue=" + totalValue + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
