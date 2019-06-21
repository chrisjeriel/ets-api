package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnPoolRetHistRequest {

	List<PoolRetHist> savePoolRetHist;
	List<PoolRetHist> deletePoolRetHist;
	List<PoolMember> deletePoolMember;
	
	public List<PoolRetHist> getSavePoolRetHist() {
		return savePoolRetHist;
	}
	public void setSavePoolRetHist(List<PoolRetHist> savePoolRetHist) {
		this.savePoolRetHist = savePoolRetHist;
	}
	public List<PoolRetHist> getDeletePoolRetHist() {
		return deletePoolRetHist;
	}
	public void setDeletePoolRetHist(List<PoolRetHist> deletePoolRetHist) {
		this.deletePoolRetHist = deletePoolRetHist;
	}
	public List<PoolMember> getDeletePoolMember() {
		return deletePoolMember;
	}
	public void setDeletePoolMember(List<PoolMember> deletePoolMember) {
		this.deletePoolMember = deletePoolMember;
	}
	@Override
	public String toString() {
		return "SaveMtnPoolRetHistRequest [savePoolRetHist=" + savePoolRetHist + ", deletePoolRetHist="
				+ deletePoolRetHist + ", deletePoolMember=" + deletePoolMember + "]";
	}
}

@Alias("SaveMtnPoolRetHist")
class PoolRetHist {
	private Integer retHistId;
	private Integer retLine1;
	private Integer retLine2;
	private Integer totalRetLine;
	private String effDateFrom;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	List<PoolMember> poolMemberList;
	
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
	public String getEffDateFrom() {
		return effDateFrom;
	}
	public void setEffDateFrom(String effDateFrom) {
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public List<PoolMember> getPoolMemberList() {
		return poolMemberList;
	}
	public void setPoolMemberList(List<PoolMember> poolMemberList) {
		this.poolMemberList = poolMemberList;
	}
	@Override
	public String toString() {
		return "PoolRetHist [retHistId=" + retHistId + ", retLine1=" + retLine1 + ", retLine2=" + retLine2
				+ ", totalRetLine=" + totalRetLine + ", effDateFrom=" + effDateFrom + ", activeTag=" + activeTag
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + ", poolMemberList=" + poolMemberList + "]";
	}
}

@Alias("SaveMtnPoolMember")
class PoolMember {
	private Integer retHistId;
	private String cedingId;
	private String cedingName;
	private Integer retLine1;
	private Integer retLine2;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getRetHistId() {
		return retHistId;
	}
	public void setRetHistId(Integer retHistId) {
		this.retHistId = retHistId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
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
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "PoolMember [retHistId=" + retHistId + ", cedingId=" + cedingId + ", cedingName=" + cedingName
				+ ", retLine1=" + retLine1 + ", retLine2=" + retLine2 + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}