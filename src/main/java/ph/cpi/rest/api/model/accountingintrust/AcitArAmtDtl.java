package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitArAmtDtl {
	private Integer tranId;
	private Integer itemSeqno;
	private String genType;
	private String itemText;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal currAmt;
	private BigDecimal localAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String updateLevel;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getItemSeqno() {
		return itemSeqno;
	}
	public void setItemSeqno(Integer itemSeqno) {
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
	public BigDecimal getCurrRate() {
		return currRate;
	}
	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
	}
	public BigDecimal getCurrAmt() {
		return currAmt;
	}
	public void setCurrAmt(BigDecimal currAmt) {
		this.currAmt = currAmt;
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
	public String getUpdateLevel() {
		return updateLevel;
	}
	public void setUpdateLevel(String updateLevel) {
		this.updateLevel = updateLevel;
	}
	@Override
	public String toString() {
		return "AcitArAmtDtl [tranId=" + tranId + ", itemSeqno=" + itemSeqno + ", genType=" + genType + ", itemText="
				+ itemText + ", currCd=" + currCd + ", currRate=" + currRate + ", currAmt=" + currAmt + ", localAmt="
				+ localAmt + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", updateLevel=" + updateLevel + "]";
	}
}
