package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

public class SaveAcitArNegTrtyBalRequest {
	private String tranId;
	private String billId;
	private String billType;
	private String totalLocalAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	private List<SaveNegTrtyBal> saveNegTrtyBal;
	private List<SaveNegTrtyBal> delNegTrtyBal;
	
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
	public List<SaveNegTrtyBal> getSaveNegTrtyBal() {
		return saveNegTrtyBal;
	}
	public void setSaveNegTrtyBal(List<SaveNegTrtyBal> saveNegTrtyBal) {
		this.saveNegTrtyBal = saveNegTrtyBal;
	}
	public List<SaveNegTrtyBal> getDelNegTrtyBal() {
		return delNegTrtyBal;
	}
	public void setDelNegTrtyBal(List<SaveNegTrtyBal> delNegTrtyBal) {
		this.delNegTrtyBal = delNegTrtyBal;
	}
	
	@Override
	public String toString() {
		return "SaveAcitArNegTrtyBalRequest [tranId=" + tranId + ", billId=" + billId + ", billType=" + billType
				+ ", totalLocalAmt=" + totalLocalAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", saveNegTrtyBal=" + saveNegTrtyBal
				+ ", delNegTrtyBal=" + delNegTrtyBal + "]";
	}
}

class SaveNegTrtyBal{
	private String tranId;
	private String billId;
	private String itemNo;
	private String qsoaId;
	private String quarterEnding;
	private String currCd;
	private String currRate;
	private BigDecimal netQsoaAmt;
	private BigDecimal prevPaytAmt;
	private BigDecimal prevBalance;
	private BigDecimal newPaytAmt;
	private BigDecimal newBalance;
	private String balPaytAmt;
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
	public String getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(String qsoaId) {
		this.qsoaId = qsoaId;
	}
	public String getQuarterEnding() {
		return quarterEnding;
	}
	public void setQuarterEnding(String quarterEnding) {
		this.quarterEnding = quarterEnding;
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
	public BigDecimal getNetQsoaAmt() {
		return netQsoaAmt;
	}
	public void setNetQsoaAmt(BigDecimal netQsoaAmt) {
		this.netQsoaAmt = netQsoaAmt;
	}
	public BigDecimal getPrevPaytAmt() {
		return prevPaytAmt;
	}
	public void setPrevPaytAmt(BigDecimal prevPaytAmt) {
		this.prevPaytAmt = prevPaytAmt;
	}
	public BigDecimal getPrevBalance() {
		return prevBalance;
	}
	public void setPrevBalance(BigDecimal prevBalance) {
		this.prevBalance = prevBalance;
	}
	public BigDecimal getNewPaytAmt() {
		return newPaytAmt;
	}
	public void setNewPaytAmt(BigDecimal newPaytAmt) {
		this.newPaytAmt = newPaytAmt;
	}
	public BigDecimal getNewBalance() {
		return newBalance;
	}
	public void setNewBalance(BigDecimal newBalance) {
		this.newBalance = newBalance;
	}
	public String getBalPaytAmt() {
		return balPaytAmt;
	}
	public void setBalPaytAmt(String balPaytAmt) {
		this.balPaytAmt = balPaytAmt;
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
		return "SaveNegTrtyBal [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", qsoaId=" + qsoaId
				+ ", quarterEnding=" + quarterEnding + ", currCd=" + currCd + ", currRate=" + currRate + ", balPaytAmt="
				+ balPaytAmt + ", localAmt=" + localAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
