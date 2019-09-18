package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class AcitJVAcctTrtyBal {
	private Integer tranId;
	private Integer quarterNo;
	private String cedingId;
	private String cedingName;
	private DateTime quarterEnding;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal balanceAmt;
	private BigDecimal localAmt;
	private BigDecimal actualBalPaid;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private List <AcitJVAcctOffset> acctOffset;
	private List <AcitJVInvestmentOffset> trtyInvmt;
	
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
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
	
	public BigDecimal getActualBalPaid() {
		return actualBalPaid;
	}
	public void setActualBalPaid(BigDecimal actualBalPaid) {
		this.actualBalPaid = actualBalPaid;
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
	
	public List<AcitJVAcctOffset> getAcctOffset() {
		return acctOffset;
	}
	public void setAcctOffset(List<AcitJVAcctOffset> acctOffset) {
		this.acctOffset = acctOffset;
	}
	public List<AcitJVInvestmentOffset> getTrtyInvmt() {
		return trtyInvmt;
	}
	public void setTrtyInvmt(List<AcitJVInvestmentOffset> trtyInvmt) {
		this.trtyInvmt = trtyInvmt;
	}
	@Override
	public String toString() {
		return "AcitJVAcctTrtyBal [tranId=" + tranId + ", quarterNo=" + quarterNo + ", cedingId=" + cedingId
				+ ", cedingName=" + cedingName + ", quarterEnding=" + quarterEnding + ", currCd=" + currCd
				+ ", currRate=" + currRate + ", balanceAmt=" + balanceAmt + ", localAmt=" + localAmt
				+ ", actualBalPaid=" + actualBalPaid + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", acctOffset=" + acctOffset
				+ ", trtyInvmt=" + trtyInvmt + "]";
	}
	
}
