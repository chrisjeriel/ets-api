package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class CoInsurance {
	private Integer policyId;
	private String policyNo;
	private String coRefNo;
	private String cedingId ;
	private String cedingName;
	private Integer pctShare;
	private Double shareSiAmt;
	private Integer sharePremAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getCoRefNo() {
		return coRefNo;
	}
	public void setCoRefNo(String coRefNo) {
		this.coRefNo = coRefNo;
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
	public Integer getPctShare() {
		return pctShare;
	}
	public void setPctShare(Integer pctShare) {
		this.pctShare = pctShare;
	}
	
	public Double getShareSiAmt() {
		return shareSiAmt;
	}
	public void setShareSiAmt(Double shareSiAmt) {
		this.shareSiAmt = shareSiAmt;
	}
	public Integer getSharePremAmt() {
		return sharePremAmt;
	}
	public void setSharePremAmt(Integer sharePremAmt) {
		this.sharePremAmt = sharePremAmt;
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
		return "CoInsurance [coRefNo=" + coRefNo + ", cedingId=" + cedingId + ", cedingName=" + cedingName
				+ ", pctShare=" + pctShare + ", shareSiAmt=" + shareSiAmt + ", sharePremAmt=" + sharePremAmt
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}
