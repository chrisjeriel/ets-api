package ph.cpi.rest.api.model.request;

import java.util.List;

public class SavePolEndtOcRequest {
	private Integer policyIdOc;
	private String endtCd;
	private String changeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	private List<DeductiblesOc> savedeductiblesOc;
	public Integer getPolicyIdOc() {
		return policyIdOc;
	}
	public void setPolicyIdOc(Integer policyIdOc) {
		this.policyIdOc = policyIdOc;
	}
	public String getEndtCd() {
		return endtCd;
	}
	public void setEndtCd(String endtCd) {
		this.endtCd = endtCd;
	}
	public String getChangeTag() {
		return changeTag;
	}
	public void setChangeTag(String changeTag) {
		this.changeTag = changeTag;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
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
	
	public List<DeductiblesOc> getSavedeductiblesOc() {
		return savedeductiblesOc;
	}
	public void setSavedeductiblesOc(List<DeductiblesOc> savedeductiblesOc) {
		this.savedeductiblesOc = savedeductiblesOc;
	}
	@Override
	public String toString() {
		return "SavePolEndtOcRequest [policyIdOc=" + policyIdOc + ", endtCd=" + endtCd + ", changeTag=" + changeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", savedeductiblesOc="
				+ savedeductiblesOc + "]";
	}
	
	
}

class DeductiblesOc {
	private Integer CoverCd;
	private String endtCdDedt; 
	private String deductibleCd; 
	private Integer deductibleRt;
	private Integer deductibleAmt;
	private String deductibleTxt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getCoverCd() {
		return CoverCd;
	}
	public void setCoverCd(Integer coverCd) {
		CoverCd = coverCd;
	}
	public String getEndtCdDedt() {
		return endtCdDedt;
	}
	public void setEndtCdDedt(String endtCdDedt) {
		this.endtCdDedt = endtCdDedt;
	}
	public String getDeductibleCd() {
		return deductibleCd;
	}
	public void setDeductibleCd(String deductibleCd) {
		this.deductibleCd = deductibleCd;
	}
	public Integer getDeductibleRt() {
		return deductibleRt;
	}
	public void setDeductibleRt(Integer deductibleRt) {
		this.deductibleRt = deductibleRt;
	}
	public Integer getDeductibleAmt() {
		return deductibleAmt;
	}
	public void setDeductibleAmt(Integer deductibleAmt) {
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
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
		return "DeductiblesOc [CoverCd=" + CoverCd + ", endtCdDedt=" + endtCdDedt + ", deductibleCd=" + deductibleCd
				+ ", deductibleRt=" + deductibleRt + ", deductibleAmt=" + deductibleAmt + ", deductibleTxt="
				+ deductibleTxt + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
	
}
