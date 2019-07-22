package ph.cpi.rest.api.model.accountingintrust;

import java.util.List;

import org.joda.time.DateTime;

public class AcitTransactions {
	private Integer tranId;
	private DateTime tranDate;
	private String tranClass;
	private Integer tranYear;
	private Integer tranClassNo;
	private String tranStat;
	private DateTime closeDate;
	private DateTime deleteDate;
	private DateTime postDate;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
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
	
	public AcitJVListing getJvListings() {
		return jvListings;
	}
	public void setJvListings(AcitJVListing jvListings) {
		this.jvListings = jvListings;
	}
	@Override
	public String toString() {
		return "AcitTransactions [tranId=" + tranId + ", tranDate=" + tranDate + ", tranClass=" + tranClass
				+ ", tranYear=" + tranYear + ", tranClassNo=" + tranClassNo + ", tranStat=" + tranStat + ", closeDate="
				+ closeDate + ", deleteDate=" + deleteDate + ", postDate=" + postDate + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", jvListings=" + jvListings + "]";
	}
	
	
}
