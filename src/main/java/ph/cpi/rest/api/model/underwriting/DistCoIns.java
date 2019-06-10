package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class DistCoIns {
	private Integer riskDistId;
	private Integer distId;
	private String policyNo;
	private String cedingId;
	private String cedingName;
	private Double pctShare;
	private Double siAmt;
	private Double premAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public Integer getRiskDistId() {
		return riskDistId;
	}
	public void setRiskDistId(Integer riskDistId) {
		this.riskDistId = riskDistId;
	}
	public Integer getDistId() {
		return distId;
	}
	public void setDistId(Integer distId) {
		this.distId = distId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public Double getPctShare() {
		return pctShare;
	}
	public void setPctShare(Double pctShare) {
		this.pctShare = pctShare;
	}
	public Double getSiAmt() {
		return siAmt;
	}
	public void setSiAmt(Double siAmt) {
		this.siAmt = siAmt;
	}
	public Double getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(Double premAmt) {
		this.premAmt = premAmt;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "DistCoIns [riskDistId=" + riskDistId + ", distId=" + distId + ", policyNo=" + policyNo + ", cedingId="
				+ cedingId + ", cedingName=" + cedingName + ", pctShare=" + pctShare + ", siAmt=" + siAmt + ", premAmt="
				+ premAmt + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
