package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcitPrqTransRequest {
	private List<PrqTrans> deletePrqTrans;
	private List<PrqTrans> savePrqTrans;
	public List<PrqTrans> getDeletePrqTrans() {
		return deletePrqTrans;
	}
	public void setDeletePrqTrans(List<PrqTrans> deletePrqTrans) {
		this.deletePrqTrans = deletePrqTrans;
	}
	public List<PrqTrans> getSavePrqTrans() {
		return savePrqTrans;
	}
	public void setSavePrqTrans(List<PrqTrans> savePrqTrans) {
		this.savePrqTrans = savePrqTrans;
	}
	@Override
	public String toString() {
		return "SaveAcitPrqTransRequest [deletePrqTrans=" + deletePrqTrans + ", savePrqTrans=" + savePrqTrans + "]";
	}
}

class PrqTrans {
	private String reqId;
	private String itemNo;
	private String claimId;
	private String projId;
	private String histNo;
	private String policyId;
	private String instNo;
	private String quarterEnding;
	private String invtId;
	private String refNo;
	private String itemName;
	private String paymentFor;
	private String currCd;
	private String currRate;
	private String currAmt;
	private String localAmt;
	private String remarks;
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
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getInstNo() {
		return instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	public String getQuarterEnding() {
		return quarterEnding;
	}
	public void setQuarterEnding(String quarterEnding) {
		this.quarterEnding = quarterEnding;
	}
	public String getInvtId() {
		return invtId;
	}
	public void setInvtId(String investmentId) {
		this.invtId = investmentId;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getPaymentFor() {
		return paymentFor;
	}
	public void setPaymentFor(String paymentFor) {
		this.paymentFor = paymentFor;
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
		return "PrqTrans [reqId=" + reqId + ", itemNo=" + itemNo + ", claimId=" + claimId + ", projId=" + projId
				+ ", histNo=" + histNo + ", policyId=" + policyId + ", instNo=" + instNo + ", quarterEnding="
				+ quarterEnding + ", invtId=" + invtId + ", refNo=" + refNo + ", itemName=" + itemName + ", paymentFor="
				+ paymentFor + ", currCd=" + currCd + ", currRate=" + currRate + ", currAmt=" + currAmt + ", localAmt="
				+ localAmt + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
