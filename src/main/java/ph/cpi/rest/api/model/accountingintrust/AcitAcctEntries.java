package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitAcctEntries {
	private String tranId;
	private String entryId;
	private String glAcctId;
	private String glShortCd;
	private String glShortDesc;
	private String slTypeCd;
	private String slTypeName;
	private String slCd;
	private String slName;
	private BigDecimal creditAmt;
	private BigDecimal debitAmt;
	private String autoTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String updateLevel;
	
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getEntryId() {
		return entryId;
	}
	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}
	public String getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(String glAcctId) {
		this.glAcctId = glAcctId;
	}
	public String getGlShortCd() {
		return glShortCd;
	}
	public void setGlShortCd(String glShortCd) {
		this.glShortCd = glShortCd;
	}
	public String getGlShortDesc() {
		return glShortDesc;
	}
	public void setGlShortDesc(String glShortDesc) {
		this.glShortDesc = glShortDesc;
	}
	public String getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(String slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	public String getSlTypeName() {
		return slTypeName;
	}
	public void setSlTypeName(String slTypeName) {
		this.slTypeName = slTypeName;
	}
	public String getSlCd() {
		return slCd;
	}
	public void setSlCd(String slCd) {
		this.slCd = slCd;
	}
	public String getSlName() {
		return slName;
	}
	public void setSlName(String slName) {
		this.slName = slName;
	}
	public BigDecimal getCreditAmt() {
		return creditAmt;
	}
	public void setCreditAmt(BigDecimal creditAmt) {
		this.creditAmt = creditAmt;
	}
	public BigDecimal getDebitAmt() {
		return debitAmt;
	}
	public void setDebitAmt(BigDecimal debitAmt) {
		this.debitAmt = debitAmt;
	}
	public String getAutoTag() {
		return autoTag;
	}
	public void setAutoTag(String autoTag) {
		this.autoTag = autoTag;
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
		return "AcitAcctEntries [tranId=" + tranId + ", entryId=" + entryId + ", glAcctId=" + glAcctId + ", glShortCd="
				+ glShortCd + ", glShortDesc=" + glShortDesc + ", slTypeCd=" + slTypeCd + ", slTypeName=" + slTypeName
				+ ", slCd=" + slCd + ", slName=" + slName + ", creditAmt=" + creditAmt + ", debitAmt=" + debitAmt
				+ ", autoTag=" + autoTag + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + ", updateLevel=" + updateLevel + "]";
	}
	
	
}
