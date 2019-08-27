package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcitArTransDtlRequest {
	private String tranId;
	private String billId;
	private String billType;
	private String totalLocalAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	private List<SaveArTransDtl> saveTransDtl;
	private List<SaveArTransDtl> delTransDtl;
	
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
	public List<SaveArTransDtl> getSaveTransDtl() {
		return saveTransDtl;
	}
	public void setSaveTransDtl(List<SaveArTransDtl> saveTransDtl) {
		this.saveTransDtl = saveTransDtl;
	}
	public List<SaveArTransDtl> getDelTransDtl() {
		return delTransDtl;
	}
	public void setDelTransDtl(List<SaveArTransDtl> delTransDtl) {
		this.delTransDtl = delTransDtl;
	}
	
	@Override
	public String toString() {
		return "SaveAcitArTransDtlRequest [tranId=" + tranId + ", billId=" + billId + ", billType=" + billType
				+ ", totalLocalAmt=" + totalLocalAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", saveTransDtl=" + saveTransDtl
				+ ", delTransDtl=" + delTransDtl + "]";
	}
}

class SaveArTransDtl{
	private String tranId;
	private String billId;
	private String itemNo;
	private String transdtlType;
	private String itemName;
	private String currCd;
	private String currRate;
	private String currAmt;
	private String localAmt;
	private String refNo;
	private String remarks;
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
	public String getTransdtlType() {
		return transdtlType;
	}
	public void setTransdtlType(String transdtlType) {
		this.transdtlType = transdtlType;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
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
		return "SaveArTransDtl [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", transdtlType="
				+ transdtlType + ", itemName=" + itemName + ", currCd=" + currCd + ", currRate=" + currRate
				+ ", currAmt=" + currAmt + ", localAmt=" + localAmt + ", refNo=" + refNo + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
