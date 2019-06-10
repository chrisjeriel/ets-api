package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnClaimStatusRequest {
	private List<ClaimStats> saveClaimStatus;
	private List<ClaimStats> delClaimStatus;

	public List<ClaimStats> getSaveClaimStatus() {
		return saveClaimStatus;
	}

	public void setSaveClaimStatus(List<ClaimStats> saveClaimStatus) {
		this.saveClaimStatus = saveClaimStatus;
	}
	
	

	public List<ClaimStats> getDelClaimStatus() {
		return delClaimStatus;
	}

	public void setDelClaimStatus(List<ClaimStats> delClaimStatus) {
		this.delClaimStatus = delClaimStatus;
	}

	@Override
	public String toString() {
		return "SaveMtnClaimStatusRequest [saveClaimStatus=" + saveClaimStatus + ", delClaimStatus=" + delClaimStatus
				+ "]";
	}

	
	

}
@Alias ("saveMtnClaimStatus")
class ClaimStats {
	private String statusCode;
	private String description;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
		return "ClaimStatus [statusCode=" + statusCode + ", description=" + description + ", activeTag=" + activeTag
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
}
