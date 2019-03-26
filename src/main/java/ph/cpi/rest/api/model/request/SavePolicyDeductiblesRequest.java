package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SavePolicyDeductiblesRequest {
	private Integer policyId;
	List<UwDeductibles> saveDeductibleList;
	List<UwDeductibles> deleteDeductibleList;
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
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
		return "SavePolicyDeductiblesRequest [policyId=" + policyId + ", saveDeductibleList=" + saveDeductibleList
				+ ", deleteDeductibleList=" + deleteDeductibleList + "]";
	}
	
	
}

@Alias("SavePolicyDeductibles")
class UwDeductibles {
	private String deductibleCd;
	private String coverCd;
	private String endtCd;
	private String deductibleRt;
	private String deductibleAmt;
	private String deductibleTxt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getDeductibleCd() {
		return deductibleCd;
	}
	public void setDeductibleCd(String deductibleCd) {
		this.deductibleCd = deductibleCd;
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
		return "Deductibles [deductibleCd=" + deductibleCd + ", coverCd=" + coverCd + ", endtCd=" + endtCd
				+ ", deductibleRt=" + deductibleRt + ", deductibleAmt=" + deductibleAmt + ", deductibleTxt="
				+ deductibleTxt + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
	
}