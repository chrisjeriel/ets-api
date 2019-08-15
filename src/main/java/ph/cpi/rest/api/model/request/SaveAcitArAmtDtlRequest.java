package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcitArAmtDtlRequest {
	private String tranId;
	private String totalLocalAmt;
	private List<SaveAmtDtl> saveAmtDtl;
	private List<SaveAmtDtl> delAmtDtl;
	
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getTotalLocalAmt() {
		return totalLocalAmt;
	}
	public void setTotalLocalAmt(String totalLocalAmt) {
		this.totalLocalAmt = totalLocalAmt;
	}
	public List<SaveAmtDtl> getSaveAmtDtl() {
		return saveAmtDtl;
	}
	public void setSaveAmtDtl(List<SaveAmtDtl> saveAmtDtl) {
		this.saveAmtDtl = saveAmtDtl;
	}
	public List<SaveAmtDtl> getDelAmtDtl() {
		return delAmtDtl;
	}
	public void setDelAmtDtl(List<SaveAmtDtl> delAmtDtl) {
		this.delAmtDtl = delAmtDtl;
	}
	
	@Override
	public String toString() {
		return "SaveAcitArAmtDtlRequest [tranId=" + tranId + ", totalLocalAmt=" + totalLocalAmt + ", saveAmtDtl="
				+ saveAmtDtl + ", delAmtDtl=" + delAmtDtl + "]";
	}
}

class SaveAmtDtl{
	private String tranId;
	private String itemSeqno;
	private String genType;
	private String itemText;
	private String currCd;
	private String currRate;
	private String currAmt;
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
	public String getItemSeqno() {
		return itemSeqno;
	}
	public void setItemSeqno(String itemSeqno) {
		this.itemSeqno = itemSeqno;
	}
	public String getGenType() {
		return genType;
	}
	public void setGenType(String genType) {
		this.genType = genType;
	}
	public String getItemText() {
		return itemText;
	}
	public void setItemText(String itemText) {
		this.itemText = itemText;
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
		return "SaveAmtDtl [tranId=" + tranId + ", itemSeqno=" + itemSeqno + ", genType=" + genType + ", itemText="
				+ itemText + ", currCd=" + currCd + ", currRate=" + currRate + ", currAmt=" + currAmt + ", localAmt="
				+ localAmt + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
