package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveClmAdjusterRequest {

	private List<ClmAdjuster> saveAdjuster;
	private List<ClmAdjuster> deleteAdjuster;
	
	public List<ClmAdjuster> getSaveAdjuster() {
		return saveAdjuster;
	}
	public void setSaveAdjuster(List<ClmAdjuster> saveAdjuster) {
		this.saveAdjuster = saveAdjuster;
	}
	public List<ClmAdjuster> getDeleteAdjuster() {
		return deleteAdjuster;
	}
	public void setDeleteAdjuster(List<ClmAdjuster> deleteAdjuster) {
		this.deleteAdjuster = deleteAdjuster;
	}
	@Override
	public String toString() {
		return "SaveClmAdjusterRequest [saveAdjuster=" + saveAdjuster + ", deleteAdjuster=" + deleteAdjuster + "]";
	}
}
@Alias("SaveClmAdjuster")
class ClmAdjuster {
	private Integer claimId;
	private String adjId;
	private String adjRefNo;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public String getAdjId() {
		return adjId;
	}
	public void setAdjId(String adjId) {
		this.adjId = adjId;
	}
	public String getAdjRefNo() {
		return adjRefNo;
	}
	public void setAdjRefNo(String adjRefNo) {
		this.adjRefNo = adjRefNo;
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
		return "ClmAdjuster [claimId=" + claimId + ", adjId=" + adjId + ", adjRefNo=" + adjRefNo + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
}