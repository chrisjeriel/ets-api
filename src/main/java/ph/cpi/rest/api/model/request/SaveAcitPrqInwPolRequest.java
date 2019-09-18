package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcitPrqInwPolRequest {
	private List<PrqInwPol> saveAcitPrqInwPol;
	private List<PrqInwPol> deleteAcitPrqInwPol;
	public List<PrqInwPol> getSaveAcitPrqInwPol() {
		return saveAcitPrqInwPol;
	}
	public void setSaveAcitPrqInwPol(List<PrqInwPol> saveAcitPrqInwPol) {
		this.saveAcitPrqInwPol = saveAcitPrqInwPol;
	}
	public List<PrqInwPol> getDeleteAcitPrqInwPol() {
		return deleteAcitPrqInwPol;
	}
	public void setDeleteAcitPrqInwPol(List<PrqInwPol> deleteAcitPrqInwPol) {
		this.deleteAcitPrqInwPol = deleteAcitPrqInwPol;
	}
	@Override
	public String toString() {
		return "SaveAcitPrqInwPolRequest [saveAcitPrqInwPol=" + saveAcitPrqInwPol + ", deleteAcitPrqInwPol="
				+ deleteAcitPrqInwPol + "]";
	}
}

class PrqInwPol {
	private String reqId;
	private String itemNo;
	private String premAmt;
	private String riComm;
	private String riCommVat;
	private String prevPaytAmt;
	private String prevBalance;
	private String newPaytAmt;
	private String newBalance;
	private String netDue;
	private String charges;
	private String returnAmt;
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
	public String getPrevPaytAmt() {
		return prevPaytAmt;
	}
	public void setPrevPaytAmt(String prevPaytAmt) {
		this.prevPaytAmt = prevPaytAmt;
	}
	public String getPrevBalance() {
		return prevBalance;
	}
	public void setPrevBalance(String prevBalance) {
		this.prevBalance = prevBalance;
	}
	public String getNewPaytAmt() {
		return newPaytAmt;
	}
	public void setNewPaytAmt(String newPaytAmt) {
		this.newPaytAmt = newPaytAmt;
	}
	public String getNewBalance() {
		return newBalance;
	}
	public void setNewBalance(String newBalance) {
		this.newBalance = newBalance;
	}
	public String getNetDue() {
		return netDue;
	}
	public void setNetDue(String netDue) {
		this.netDue = netDue;
	}
	public String getCharges() {
		return charges;
	}
	public void setCharges(String charges) {
		this.charges = charges;
	}
	public String getReturnAmt() {
		return returnAmt;
	}
	public void setReturnAmt(String returnAmt) {
		this.returnAmt = returnAmt;
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
		return "PrqInwPol [reqId=" + reqId + ", itemNo=" + itemNo + ", premAmt=" + premAmt + ", riComm=" + riComm
				+ ", riCommVat=" + riCommVat + ", prevPaytAmt=" + prevPaytAmt + ", prevBalance=" + prevBalance
				+ ", newPaytAmt=" + newPaytAmt + ", newBalance=" + newBalance + ", netDue=" + netDue + ", charges="
				+ charges + ", returnAmt=" + returnAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
