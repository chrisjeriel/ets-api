package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcseInsuranceExpRequest {
	private List<InsExpAcse> deleteInsuranceExp;
	private List<InsExpAcse> saveInsuranceExp;
	public List<InsExpAcse> getDeleteInsuranceExp() {
		return deleteInsuranceExp;
	}
	public void setDeleteInsuranceExp(List<InsExpAcse> deleteInsuranceExp) {
		this.deleteInsuranceExp = deleteInsuranceExp;
	}
	public List<InsExpAcse> getSaveInsuranceExp() {
		return saveInsuranceExp;
	}
	public void setSaveInsuranceExp(List<InsExpAcse> saveInsuranceExp) {
		this.saveInsuranceExp = saveInsuranceExp;
	}
	@Override
	public String toString() {
		return "SaveAcseInsuranceExpRequest [deleteInsuranceExp=" + deleteInsuranceExp + ", saveInsuranceExp="
				+ saveInsuranceExp + "]";
	}
}

class InsExpAcse {
	private String reqId;
	private String itemNo;
	private String insuredTypeCd;
	private String insuredCd;
	private String insuredName;
	private String insuranceType;
	private String currCd;
	private String currRate;
	private String insuredAmt;
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
	public String getInsuredTypeCd() {
		return insuredTypeCd;
	}
	public void setInsuredTypeCd(String insuredTypeCd) {
		this.insuredTypeCd = insuredTypeCd;
	}
	public String getInsuredCd() {
		return insuredCd;
	}
	public void setInsuredCd(String insuredCd) {
		this.insuredCd = insuredCd;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
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
	public String getInsuredAmt() {
		return insuredAmt;
	}
	public void setInsuredAmt(String insuredAmt) {
		this.insuredAmt = insuredAmt;
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
		return "InsExpAcse [reqId=" + reqId + ", itemNo=" + itemNo + ", insuredTypeCd=" + insuredTypeCd + ", insuredCd="
				+ insuredCd + ", insuredName=" + insuredName + ", insuranceType=" + insuranceType + ", currCd=" + currCd
				+ ", currRate=" + currRate + ", insuredAmt=" + insuredAmt + ", localAmt=" + localAmt + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
}