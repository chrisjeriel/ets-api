package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcitArClmRecoverRequest {
	private String tranId;
	private String billId;
	private String billType;
	private String totalLocalAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	private List<SaveArClmRecover> saveClmRecover;
	private List<SaveArClmRecover> delClmRecover;
	
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getTotalLocalAmt() {
		return totalLocalAmt;
	}
	public void setTotalLocalAmt(String totalLocalAmt) {
		this.totalLocalAmt = totalLocalAmt;
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
	public List<SaveArClmRecover> getSaveClmRecover() {
		return saveClmRecover;
	}
	public void setSaveClmRecover(List<SaveArClmRecover> saveClmRecover) {
		this.saveClmRecover = saveClmRecover;
	}
	public List<SaveArClmRecover> getDelClmRecover() {
		return delClmRecover;
	}
	public void setDelClmRecover(List<SaveArClmRecover> delClmRecover) {
		this.delClmRecover = delClmRecover;
	}
	
	@Override
	public String toString() {
		return "SaveAcitArClmRecoverRequest [tranId=" + tranId + ", billId=" + billId + ", billType=" + billType
				+ ", totalLocalAmt=" + totalLocalAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", saveClmRecover=" + saveClmRecover
				+ ", delClmRecover=" + delClmRecover + "]";
	}
	
}

class SaveArClmRecover{
	private String tranId;
	private String billId;
	private String itemNo;
	private String claimId;
	private String projId;
	private String histNo;
	private String histCategory;
	private String histType;
	private String exGratia;
	private String reserveAmt;
	private String currCd;
	private String currRate;
	private String paymentFor;
	private String cashcallAmt;
	private String localAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
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
	public String getHistCategory() {
		return histCategory;
	}
	public void setHistCategory(String histCategory) {
		this.histCategory = histCategory;
	}
	public String getHistType() {
		return histType;
	}
	public void setHistType(String histType) {
		this.histType = histType;
	}
	public String getExGratia() {
		return exGratia;
	}
	public void setExGratia(String exGratia) {
		this.exGratia = exGratia;
	}
	public String getReserveAmt() {
		return reserveAmt;
	}
	public void setReserveAmt(String reserveAmt) {
		this.reserveAmt = reserveAmt;
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
	public String getPaymentFor() {
		return paymentFor;
	}
	public void setPaymentFor(String paymentFor) {
		this.paymentFor = paymentFor;
	}
	public String getCashcallAmt() {
		return cashcallAmt;
	}
	public void setCashcallAmt(String cashcallAmt) {
		this.cashcallAmt = cashcallAmt;
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
		return "SaveArClmRecover [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", claimId="
				+ claimId + ", projId=" + projId + ", histNo=" + histNo + ", histCategory=" + histCategory
				+ ", histType=" + histType + ", exGratia=" + exGratia + ", reserveAmt=" + reserveAmt + ", currCd="
				+ currCd + ", currRate=" + currRate + ", paymentFor=" + paymentFor + ", cashcallAmt=" + cashcallAmt
				+ ", localAmt=" + localAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
