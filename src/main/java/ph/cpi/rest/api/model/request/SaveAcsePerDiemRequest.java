package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcsePerDiemRequest {
	private List<PerDiemAcse> deletePerDiem;
	private List<PerDiemAcse> savePerDiem;
	public List<PerDiemAcse> getDeletePerDiem() {
		return deletePerDiem;
	}
	public void setDeletePerDiem(List<PerDiemAcse> deletePerDiem) {
		this.deletePerDiem = deletePerDiem;
	}
	public List<PerDiemAcse> getSavePerDiem() {
		return savePerDiem;
	}
	public void setSavePerDiem(List<PerDiemAcse> savePerDiem) {
		this.savePerDiem = savePerDiem;
	}
	@Override
	public String toString() {
		return "SaveAcsePerDiemRequest [deletePerDiem=" + deletePerDiem + ", savePerDiem=" + savePerDiem + "]";
	}
}

class PerDiemAcse {
	private String reqId;
	private String itemNo;
	private String directorId;
	private String directorName;
	private String feeType;
	private String currCd;
	private String currRate;
	private String feeAmt;
	private String localAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getReqId() {
		return reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getDirectorId() {
		return directorId;
	}
	public void setDirectorId(String directorId) {
		this.directorId = directorId;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public String getCurrRate() {
		return currRate;
	}
	public void setCurrRate(String currRate) {
		this.currRate = currRate;
	}
	public String getFeeAmt() {
		return feeAmt;
	}
	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
	}
	public String getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(String localAmt) {
		this.localAmt = localAmt;
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
		return "PerDiemAcse [reqId=" + reqId + ", itemNo=" + itemNo + ", directorId=" + directorId + ", directorName="
				+ directorName + ", feeType=" + feeType + ", currCd=" + currCd + ", currRate=" + currRate + ", feeAmt="
				+ feeAmt + ", localAmt=" + localAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
