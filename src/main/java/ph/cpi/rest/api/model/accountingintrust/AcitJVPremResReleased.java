package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitJVPremResReleased {
	private Integer tranId;
	private Integer itemNo;
	private DateTime quarterEnding;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal interestAmt;
	private BigDecimal whtaxAmt;
	private BigDecimal releaseAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
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
	public BigDecimal getInterestAmt() {
		return interestAmt;
	}
	public void setInterestAmt(BigDecimal interestAmt) {
		this.interestAmt = interestAmt;
	}
	public BigDecimal getWhtaxAmt() {
		return whtaxAmt;
	}
	public void setWhtaxAmt(BigDecimal whtaxAmt) {
		this.whtaxAmt = whtaxAmt;
	}
	public BigDecimal getReleaseAmt() {
		return releaseAmt;
	}
	public void setReleaseAmt(BigDecimal releaseAmt) {
		this.releaseAmt = releaseAmt;
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
	@Override
	public String toString() {
		return "AcitJVPremResReleased [tranId=" + tranId + ", itemNo=" + itemNo + ", quarterEnding=" + quarterEnding
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", interestAmt=" + interestAmt + ", whtaxAmt="
				+ whtaxAmt + ", releaseAmt=" + releaseAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
