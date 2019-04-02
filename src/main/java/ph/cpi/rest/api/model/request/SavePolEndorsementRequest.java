package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SavePolEndorsementRequest {
	
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
		return "SavePolEndorsementRequest [policyId=" + policyId + ", saveEndorsements=" + saveEndorsements
				+ ", deleteEndorsements=" + deleteEndorsements + ", saveDeductibleList=" + saveDeductibleList
				+ ", deleteDeductibleList=" + deleteDeductibleList + "]";
	}
	
}

@Alias("SavePolEndorsements")
class PolEndorsements {
	private String endtCd;
	private String changeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
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
	@Override
	public String toString() {
		return "Endorsements [endtCd=" + endtCd + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}