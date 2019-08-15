package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcitArInwPolBalRequest {
	private String tranId;
	private String billId;
	private String billType;
	private String totalLocalAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private String allotedAmt;
	private List<SaveArInwPolBal> saveInwPolBal;
	private List<SaveArInwPolBal> delInwPolBal;
	
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
	public List<SaveArInwPolBal> getSaveInwPolBal() {
		return saveInwPolBal;
	}
	public void setSaveInwPolBal(List<SaveArInwPolBal> saveInwPolBal) {
		this.saveInwPolBal = saveInwPolBal;
	}
	public List<SaveArInwPolBal> getDelInwPolBal() {
		return delInwPolBal;
	}
	public void setDelInwPolBal(List<SaveArInwPolBal> delInwPolBal) {
		this.delInwPolBal = delInwPolBal;
	}
	
	public String getAllotedAmt() {
		return allotedAmt;
	}
	public void setAllotedAmt(String allotedAmt) {
		this.allotedAmt = allotedAmt;
	}
	
	@Override
	public String toString() {
		return "SaveAcitArInwPolBalRequest [tranId=" + tranId + ", billId=" + billId + ", billType=" + billType
				+ ", totalLocalAmt=" + totalLocalAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", allotedAmt=" + allotedAmt
				+ ", saveInwPolBal=" + saveInwPolBal + ", delInwPolBal=" + delInwPolBal + "]";
	}
}

class SaveArInwPolBal{
	private String tranId;
	private String billId;
	private String itemNo;
	private String policyId;
	private String instNo;
	private String currCd;
	private String currRate;
	private String premAmt;
	private String riComm;
	private String riCommVat;
	private String charges;
	private String netDue;
	private String balPaytAmt;
	private String overdueInt;
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
	public void setItemno(String itemNo) {
		this.itemNo = itemNo;
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
	public String getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(String premAmt) {
		this.premAmt = premAmt;
	}
	public String getRiComm() {
		return riComm;
	}
	public void setRiComm(String riComm) {
		this.riComm = riComm;
	}
	public String getRiCommVat() {
		return riCommVat;
	}
	public void setRiCommVat(String riCommVat) {
		this.riCommVat = riCommVat;
	}
	public String getCharges() {
		return charges;
	}
	public void setCharges(String charges) {
		this.charges = charges;
	}
	public String getNetDue() {
		return netDue;
	}
	public void setNetDue(String netDue) {
		this.netDue = netDue;
	}
	public String getBalPaytAmt() {
		return balPaytAmt;
	}
	public void setBalPaytAmt(String balPaytAmt) {
		this.balPaytAmt = balPaytAmt;
	}
	public String getOverdueInt() {
		return overdueInt;
	}
	public void setOverdueInt(String overdueInt) {
		this.overdueInt = overdueInt;
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
		return "SaveArInwPolBal [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", policyId="
				+ policyId + ", instNo=" + instNo + ", currCd=" + currCd + ", currRate=" + currRate + ", premAmt="
				+ premAmt + ", riComm=" + riComm + ", riCommVat=" + riCommVat + ", charges=" + charges + ", netDue="
				+ netDue + ", balPaytAmt=" + balPaytAmt + ", overdueInt=" + overdueInt + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
