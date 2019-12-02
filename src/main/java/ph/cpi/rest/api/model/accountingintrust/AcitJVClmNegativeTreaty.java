package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class AcitJVClmNegativeTreaty {
	private Integer tranId;
	private Integer quarterNo;
	private Integer qsoaId;
	private String cedingId;
	private String cedingName;
	private DateTime quarterEnding;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal balanceAmt;
	private BigDecimal localAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private List <AcitJVClaimOffset> clmOffset;
	private BigDecimal netQsoaAmt;
	private BigDecimal prevPaytAmt;
	private BigDecimal prevBalance;
	private BigDecimal newPaytAmt;
	private BigDecimal newBalance;
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
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public Integer getQuarterNo() {
		return quarterNo;
	}
	public void setQuarterNo(Integer quarterNo) {
		this.quarterNo = quarterNo;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public DateTime getQuarterEnding() {
		return quarterEnding;
	}
	public void setQuarterEnding(DateTime quarterEnding) {
		this.quarterEnding = quarterEnding;
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
	public BigDecimal getBalanceAmt() {
		return balanceAmt;
	}
	public void setBalanceAmt(BigDecimal balanceAmt) {
		this.balanceAmt = balanceAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	public List<AcitJVClaimOffset> getClmOffset() {
		return clmOffset;
	}
	public void setClmOffset(List<AcitJVClaimOffset> clmOffset) {
		this.clmOffset = clmOffset;
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
	@Override
	public String toString() {
		return "AcitJVClmNegativeTreaty [tranId=" + tranId + ", quarterNo=" + quarterNo + ", qsoaId=" + qsoaId
				+ ", cedingId=" + cedingId + ", cedingName=" + cedingName + ", quarterEnding=" + quarterEnding
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", balanceAmt=" + balanceAmt + ", localAmt="
				+ localAmt + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", clmOffset=" + clmOffset + ", netQsoaAmt=" + netQsoaAmt
				+ ", prevPaytAmt=" + prevPaytAmt + ", prevBalance=" + prevBalance + ", newPaytAmt=" + newPaytAmt
				+ ", newBalance=" + newBalance + "]";
	}
}
