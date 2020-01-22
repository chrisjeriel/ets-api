package ph.cpi.rest.api.model.accountingintrust;

import org.joda.time.DateTime;

public class AcitTransactions {
	private Integer tranId;
	private DateTime tranDate;
	private String tranClass;
	private Integer tranTypeCd;
	private Integer tranYear;
	private Integer tranClassNo;
	private String tranStat;
	private String tranStatDesc;
	private DateTime closeDate;
	private DateTime deleteDate;
	private DateTime postDate;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String adjEntryTag;
	private DateTime acctEntDate;
	
	private AcitJVListing jvListings;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public DateTime getTranDate() {
		return tranDate;
	}
	public void setTranDate(DateTime tranDate) {
		this.tranDate = tranDate;
	}
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public Integer getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public Integer getTranYear() {
		return tranYear;
	}
	public void setTranYear(Integer tranYear) {
		this.tranYear = tranYear;
	}
	public Integer getTranClassNo() {
		return tranClassNo;
	}
	public void setTranClassNo(Integer tranClassNo) {
		this.tranClassNo = tranClassNo;
	}
	public String getTranStat() {
		return tranStat;
	}
	public void setTranStat(String tranStat) {
		this.tranStat = tranStat;
	}
	public String getTranStatDesc() {
		return tranStatDesc;
	}
	public void setTranStatDesc(String tranStatDesc) {
		this.tranStatDesc = tranStatDesc;
	}
	public DateTime getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(DateTime closeDate) {
		this.closeDate = closeDate;
	}
	public DateTime getDeleteDate() {
		return deleteDate;
	}
	public void setDeleteDate(DateTime deleteDate) {
		this.deleteDate = deleteDate;
	}
	public DateTime getPostDate() {
		return postDate;
	}
	public void setPostDate(DateTime postDate) {
		this.postDate = postDate;
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
	public String getAdjEntryTag() {
		return adjEntryTag;
	}
	public void setAdjEntryTag(String adjEntryTag) {
		this.adjEntryTag = adjEntryTag;
	}
	public DateTime getAcctEntDate() {
		return acctEntDate;
	}
	public void setAcctEntDate(DateTime acctEntDate) {
		this.acctEntDate = acctEntDate;
	}
	public AcitJVListing getJvListings() {
		return jvListings;
	}
	public void setJvListings(AcitJVListing jvListings) {
		this.jvListings = jvListings;
	}
	@Override
	public String toString() {
		return "AcitTransactions [tranId=" + tranId + ", tranDate=" + tranDate + ", tranClass=" + tranClass
				+ ", tranTypeCd=" + tranTypeCd + ", tranYear=" + tranYear + ", tranClassNo=" + tranClassNo
				+ ", tranStat=" + tranStat + ", tranStatDesc=" + tranStatDesc + ", closeDate=" + closeDate
				+ ", deleteDate=" + deleteDate + ", postDate=" + postDate + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", adjEntryTag=" + adjEntryTag + ", acctEntDate=" + acctEntDate + ", jvListings=" + jvListings + "]";
	}
}
