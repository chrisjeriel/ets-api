package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class ExpDeductibles {
	private String policyId; 
	private String coverCd; 
	private String endtCd; 
	private String deductibleCd; 
	private String deductibleRt; 
	private String deductibleAmt; 
	private String deductibleTxt; 
	private String deductibleTitle; 
	private String createUser; 
	private DateTime createDate; 
	private String updateUser; 
	private DateTime updateDate;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getCoverCd() {
		return coverCd;
	}
	public void setCoverCd(String coverCd) {
		this.coverCd = coverCd;
	}
	public String getEndtCd() {
		return endtCd;
	}
	public void setEndtCd(String endtCd) {
		this.endtCd = endtCd;
	}
	public String getDeductibleCd() {
		return deductibleCd;
	}
	public void setDeductibleCd(String deductibleCd) {
		this.deductibleCd = deductibleCd;
	}
	public String getDeductibleRt() {
		return deductibleRt;
	}
	public void setDeductibleRt(String deductibleRt) {
		this.deductibleRt = deductibleRt;
	}
	public String getDeductibleAmt() {
		return deductibleAmt;
	}
	public void setDeductibleAmt(String deductibleAmt) {
		this.deductibleAmt = deductibleAmt;
	}
	public String getDeductibleTxt() {
		return deductibleTxt;
	}
	public void setDeductibleTxt(String deductibleTxt) {
		this.deductibleTxt = deductibleTxt;
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
	public String getDeductibleTitle() {
		return deductibleTitle;
	}
	public void setDeductibleTitle(String deductibleTitle) {
		this.deductibleTitle = deductibleTitle;
	}
	@Override
	public String toString() {
		return "ExpDeductibles [policyId=" + policyId + ", coverCd=" + coverCd + ", endtCd=" + endtCd
				+ ", deductibleCd=" + deductibleCd + ", deductibleRt=" + deductibleRt + ", deductibleAmt="
				+ deductibleAmt + ", deductibleTxt=" + deductibleTxt + ", deductibleTitle=" + deductibleTitle
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}
