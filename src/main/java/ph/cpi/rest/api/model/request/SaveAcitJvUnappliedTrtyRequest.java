package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

public class SaveAcitJvUnappliedTrtyRequest {
	
	private Integer tranId;
	private Integer tranType;
	private List<UnappliedTrty> saveTrtyUnapplied;
	private List<UnappliedTrty> delTrtyUnapplied;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getTranType() {
		return tranType;
	}
	public void setTranType(Integer tranType) {
		this.tranType = tranType;
	}
	public List<UnappliedTrty> getSaveTrtyUnapplied() {
		return saveTrtyUnapplied;
	}
	public void setSaveTrtyUnapplied(List<UnappliedTrty> saveTrtyUnapplied) {
		this.saveTrtyUnapplied = saveTrtyUnapplied;
	}
	public List<UnappliedTrty> getDelTrtyUnapplied() {
		return delTrtyUnapplied;
	}
	public void setDelTrtyUnapplied(List<UnappliedTrty> delTrtyUnapplied) {
		this.delTrtyUnapplied = delTrtyUnapplied;
	}
	@Override
	public String toString() {
		return "SaveAcitJvUnappliedTrtyRequest [tranId=" + tranId + ", tranType=" + tranType + ", saveTrtyUnapplied="
				+ saveTrtyUnapplied + ", delTrtyUnapplied=" + delTrtyUnapplied + "]";
	}
	
	
}

class UnappliedTrty{
	private Integer tranId;
	private Integer qsoaId;
	private String quarterEnding;
	private String cedingId;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal prevPaytAmt;
	private BigDecimal prevBalance;
	private BigDecimal balanceAmt;
	private BigDecimal actualBalPaid;
	private BigDecimal localAmt;
	private BigDecimal newPaytAmt;
	private BigDecimal newBalance;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}
	public String getQuarterEnding() {
		return quarterEnding;
	}
	public void setQuarterEnding(String quarterEnding) {
		this.quarterEnding = quarterEnding;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getCurrRate() {
		return currRate;
	}
	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
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
	public BigDecimal getBalanceAmt() {
		return balanceAmt;
	}
	public void setBalanceAmt(BigDecimal balanceAmt) {
		this.balanceAmt = balanceAmt;
	}
	public BigDecimal getActualBalPaid() {
		return actualBalPaid;
	}
	public void setActualBalPaid(BigDecimal actualBalPaid) {
		this.actualBalPaid = actualBalPaid;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
		return "UnappliedTrty [tranId=" + tranId + ", qsoaId=" + qsoaId + ", quarterEnding=" + quarterEnding
				+ ", cedingId=" + cedingId + ", currCd=" + currCd + ", currRate=" + currRate + ", prevPaytAmt="
				+ prevPaytAmt + ", prevBalance=" + prevBalance + ", balanceAmt=" + balanceAmt + ", actualBalPaid="
				+ actualBalPaid + ", localAmt=" + localAmt + ", newPaytAmt=" + newPaytAmt + ", newBalance=" + newBalance
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}