package ph.cpi.rest.api.model.request;

import java.util.List;

import org.joda.time.DateTime;


public class SaveAcsePrqTransRequest {
	private List<PrqTransAcse> deletePrqTrans;
	private List<PrqTransAcse> savePrqTrans;
	public List<PrqTransAcse> getDeletePrqTrans() {
		return deletePrqTrans;
	}
	public void setDeletePrqTrans(List<PrqTransAcse> deletePrqTrans) {
		this.deletePrqTrans = deletePrqTrans;
	}
	public List<PrqTransAcse> getSavePrqTrans() {
		return savePrqTrans;
	}
	public void setSavePrqTrans(List<PrqTransAcse> savePrqTrans) {
		this.savePrqTrans = savePrqTrans;
	}
	@Override
	public String toString() {
		return "SaveAcsePrqTransRequest [deletePrqTrans=" + deletePrqTrans + ", savePrqTrans=" + savePrqTrans + "]";
	}
}

class PrqTransAcse {
	private String reqId;
	private String itemNo;
	private String itemName;
	private String glAcctId;
	private String refNo;
	private String remarks;
	private String currCd;
	private String currRate;
	private String currAmt;
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
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(String glAcctId) {
		this.glAcctId = glAcctId;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	public String getCurrAmt() {
		return currAmt;
	}
	public void setCurrAmt(String currAmt) {
		this.currAmt = currAmt;
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
		return "PrqTransAcse [reqId=" + reqId + ", itemNo=" + itemNo + ", itemName=" + itemName + ", glAcctId="
				+ glAcctId + ", refNo=" + refNo + ", remarks=" + remarks + ", currCd=" + currCd + ", currRate="
				+ currRate + ", currAmt=" + currAmt + ", localAmt=" + localAmt + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
