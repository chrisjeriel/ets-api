package ph.cpi.rest.api.model.maintenance;

import java.util.List;

import org.joda.time.DateTime;

public class Treaty {
	private Integer treatyId;
	private String treatyName;
	private String treatyAbbr;
	private String treatyType;
	private Integer treatyYear;
	private String activeTag;
	private String remarks;
	private String currencyCd;
	private Double commRate;
	private Integer sortSeq;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String okDelete;
	
	
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	private List<TreatyShare> treatyShareList;
	
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getTreatyName() {
		return treatyName;
	}
	public void setTreatyName(String treatyName) {
		this.treatyName = treatyName;
	}
	public String getTreatyAbbr() {
		return treatyAbbr;
	}
	public void setTreatyAbbr(String treatyAbbr) {
		this.treatyAbbr = treatyAbbr;
	}
	public String getTreatyType() {
		return treatyType;
	}
	public void setTreatyType(String treatyType) {
		this.treatyType = treatyType;
	}
	public Integer getTreatyYear() {
		return treatyYear;
	}
	public void setTreatyYear(Integer treatyYear) {
		this.treatyYear = treatyYear;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Double getCommRate() {
		return commRate;
	}
	public void setCommRate(Double commRate) {
		this.commRate = commRate;
	}
	public Integer getSortSeq() {
		return sortSeq;
	}
	public void setSortSeq(Integer sortSeq) {
		this.sortSeq = sortSeq;
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
	public String getOkDelete() {
		return okDelete;
	}
	public void setOkDelete(String okDelete) {
		this.okDelete = okDelete;
	}
	public List<TreatyShare> getTreatyShareList() {
		return treatyShareList;
	}
	public void setTreatyShareList(List<TreatyShare> treatyShareList) {
		this.treatyShareList = treatyShareList;
	}
	@Override
	public String toString() {
		return "Treaty [treatyId=" + treatyId + ", treatyName=" + treatyName + ", treatyAbbr=" + treatyAbbr
				+ ", treatyType=" + treatyType + ", treatyYear=" + treatyYear + ", activeTag=" + activeTag
				+ ", remarks=" + remarks + ", currencyCd=" + currencyCd + ", commRate=" + commRate + ", sortSeq="
				+ sortSeq + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", okDelete=" + okDelete + ", treatyShareList=" + treatyShareList
				+ "]";
	}
}
