package ph.cpi.rest.api.model.maintenance;

import java.util.List;

import org.joda.time.DateTime;

public class PoolRetHist {
	private String currencyCd;
	private Integer retHistId;
	private Integer retLine1;
	private Integer retLine2;
	private Integer totalRetLine;
	private DateTime effDateFrom;
	private String activeTag;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String okDelete;
	
	private List<PoolMember> poolMemberList;
	
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Integer getRetHistId() {
		return retHistId;
	}
	public void setRetHistId(Integer retHistId) {
		this.retHistId = retHistId;
	}
	public Integer getRetLine1() {
		return retLine1;
	}
	public void setRetLine1(Integer retLine1) {
		this.retLine1 = retLine1;
	}
	public Integer getRetLine2() {
		return retLine2;
	}
	public void setRetLine2(Integer retLine2) {
		this.retLine2 = retLine2;
	}
	public Integer getTotalRetLine() {
		return totalRetLine;
	}
	public void setTotalRetLine(Integer totalRetLine) {
		this.totalRetLine = totalRetLine;
	}
	public DateTime getEffDateFrom() {
		return effDateFrom;
	}
	public void setEffDateFrom(DateTime effDateFrom) {
		this.effDateFrom = effDateFrom;
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
	public List<PoolMember> getPoolMemberList() {
		return poolMemberList;
	}
	public void setPoolMemberList(List<PoolMember> poolMemberList) {
		this.poolMemberList = poolMemberList;
	}
	@Override
	public String toString() {
		return "PoolRetHist [currencyCd=" + currencyCd + ", retHistId=" + retHistId + ", retLine1=" + retLine1
				+ ", retLine2=" + retLine2 + ", totalRetLine=" + totalRetLine + ", effDateFrom=" + effDateFrom
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", okDelete=" + okDelete
				+ ", poolMemberList=" + poolMemberList + "]";
	}
}
