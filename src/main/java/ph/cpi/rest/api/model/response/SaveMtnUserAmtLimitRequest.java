package ph.cpi.rest.api.model.response;

import java.util.List;

public class SaveMtnUserAmtLimitRequest {
	private List<SaveMtnUserAmtLimit> saveUserAmtLmt;
	private List<SaveMtnUserAmtLimit> delUserAmtLmt;
	public List<SaveMtnUserAmtLimit> getSaveUserAmtLmt() {
		return saveUserAmtLmt;
	}
	public void setSaveUserAmtLmt(List<SaveMtnUserAmtLimit> saveUserAmtLmt) {
		this.saveUserAmtLmt = saveUserAmtLmt;
	}
	public List<SaveMtnUserAmtLimit> getDelUserAmtLmt() {
		return delUserAmtLmt;
	}
	public void setDelUserAmtLmt(List<SaveMtnUserAmtLimit> delUserAmtLmt) {
		this.delUserAmtLmt = delUserAmtLmt;
	}
	@Override
	public String toString() {
		return "SaveMtnUserAmtLimitRequest [saveUserAmtLmt=" + saveUserAmtLmt + ", delUserAmtLmt=" + delUserAmtLmt
				+ "]";
	}
	
}

class SaveMtnUserAmtLimit{
	private String userGrp;
	private String lineCd;
	private String allAmtSw;
	private String amtLimit;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getUserGrp() {
		return userGrp;
	}
	public void setUserGrp(String userGrp) {
		this.userGrp = userGrp;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getAllAmtSw() {
		return allAmtSw;
	}
	public void setAllAmtSw(String allAmtSw) {
		this.allAmtSw = allAmtSw;
	}
	public String getAmtLimit() {
		return amtLimit;
	}
	public void setAmtLimit(String amtLimit) {
		this.amtLimit = amtLimit;
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
		return "SaveMtnUserAmtLimit [userGrp=" + userGrp + ", lineCd=" + lineCd + ", allAmtSw=" + allAmtSw
				+ ", amtLimit=" + amtLimit + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}