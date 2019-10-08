package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class DCBUser {
	private Integer dcbUserCd;
	private String userId;
	private String printableName;
	private DateTime validFrom;
	private DateTime validTo;
	private Integer defaultArBank;
	private String arBankName;
	private Integer arBankCd;
	private Integer defaultArBankAcct;
	private String arBankAcctNo;
	private Integer defaultOrBank;
	private String orBankName;
	private Integer orBankCd;
	private Integer defaultOrBankAcct;
	private String orBankAcctNo;
	private String remarks;
	private String activeTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String okDelete;
	
	public String getOkDelete() {
		return okDelete;
	}
	public void setOkDelete(String okDelete) {
		this.okDelete = okDelete;
	}
	public Integer getOrBankCd() {
		return orBankCd;
	}
	public void setOrBankCd(Integer orBankCd) {
		this.orBankCd = orBankCd;
	}
	public Integer getArBankCd() {
		return arBankCd;
	}
	public void setArBankCd(Integer arBankCd) {
		this.arBankCd = arBankCd;
	}
	
	public Integer getDcbUserCd() {
		return dcbUserCd;
	}
	public void setDcbUserCd(Integer dcbUserCd) {
		this.dcbUserCd = dcbUserCd;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPrintableName() {
		return printableName;
	}
	public void setPrintableName(String printableName) {
		this.printableName = printableName;
	}
	public DateTime getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(DateTime validFrom) {
		this.validFrom = validFrom;
	}
	public DateTime getValidTo() {
		return validTo;
	}
	public void setValidTo(DateTime validTo) {
		this.validTo = validTo;
	}
	public Integer getDefaultArBank() {
		return defaultArBank;
	}
	public void setDefaultArBank(Integer defaultArBank) {
		this.defaultArBank = defaultArBank;
	}
	public String getArBankName() {
		return arBankName;
	}
	public void setArBankName(String arBankName) {
		this.arBankName = arBankName;
	}
	public Integer getDefaultArBankAcct() {
		return defaultArBankAcct;
	}
	public void setDefaultArBankAcct(Integer defaultArBankAcct) {
		this.defaultArBankAcct = defaultArBankAcct;
	}
	public String getArBankAcctNo() {
		return arBankAcctNo;
	}
	public void setArBankAcctNo(String arBankAcctNo) {
		this.arBankAcctNo = arBankAcctNo;
	}
	public Integer getDefaultOrBank() {
		return defaultOrBank;
	}
	public void setDefaultOrBank(Integer defaultOrBank) {
		this.defaultOrBank = defaultOrBank;
	}
	public String getOrBankName() {
		return orBankName;
	}
	public void setOrBankName(String orBankName) {
		this.orBankName = orBankName;
	}
	public Integer getDefaultOrBankAcct() {
		return defaultOrBankAcct;
	}
	public void setDefaultOrBankAcct(Integer defaultOrBankAcct) {
		this.defaultOrBankAcct = defaultOrBankAcct;
	}
	public String getOrBankAcctNo() {
		return orBankAcctNo;
	}
	public void setOrBankAcctNo(String orBankAcctNo) {
		this.orBankAcctNo = orBankAcctNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
		return "DCBUser [dcbUserCd=" + dcbUserCd + ", userId=" + userId
				+ ", printableName=" + printableName + ", validFrom="
				+ validFrom + ", validTo=" + validTo + ", defaultArBank="
				+ defaultArBank + ", arBankName=" + arBankName + ", arBankCd="
				+ arBankCd + ", defaultArBankAcct=" + defaultArBankAcct
				+ ", arBankAcctNo=" + arBankAcctNo + ", defaultOrBank="
				+ defaultOrBank + ", orBankName=" + orBankName + ", orBankCd="
				+ orBankCd + ", defaultOrBankAcct=" + defaultOrBankAcct
				+ ", orBankAcctNo=" + orBankAcctNo + ", remarks=" + remarks
				+ ", activeTag=" + activeTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", okDelete=" + okDelete + "]";
	}
}
