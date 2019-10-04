package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnTreatyShareRequest {
	private String currencyCd;
	private List<TreatyComm> saveTreatyComm;
	private List<TreatyComm> deleteTreatyComm;
	private List<TreatyShare> deleteTreatyShare;
	private List<CedingRetention> deleteCedRetention;
	
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public List<TreatyComm> getSaveTreatyComm() {
		return saveTreatyComm;
	}
	public void setSaveTreatyComm(List<TreatyComm> saveTreatyComm) {
		this.saveTreatyComm = saveTreatyComm;
	}
	public List<TreatyComm> getDeleteTreatyComm() {
		return deleteTreatyComm;
	}
	public void setDeleteTreatyComm(List<TreatyComm> deleteTreatyComm) {
		this.deleteTreatyComm = deleteTreatyComm;
	}
	public List<TreatyShare> getDeleteTreatyShare() {
		return deleteTreatyShare;
	}
	public void setDeleteTreatyShare(List<TreatyShare> deleteTreatyShare) {
		this.deleteTreatyShare = deleteTreatyShare;
	}
	public List<CedingRetention> getDeleteCedRetention() {
		return deleteCedRetention;
	}
	public void setDeleteCedRetention(List<CedingRetention> deleteCedRetention) {
		this.deleteCedRetention = deleteCedRetention;
	}
	@Override
	public String toString() {
		return "SaveMtnTreatyShareRequest [currencyCd=" + currencyCd + ", saveTreatyComm=" + saveTreatyComm
				+ ", deleteTreatyComm=" + deleteTreatyComm + ", deleteTreatyShare=" + deleteTreatyShare
				+ ", deleteCedRetention=" + deleteCedRetention + "]";
	}
}

@Alias("SaveMtnTreatyComm")
class TreatyComm {
	private Integer treatyYear;
	private Integer treatyId;
	private String commRate;
	private Integer sortSeq;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	private List<TreatyShare> treatyShareList;
	
	public Integer getTreatyYear() {
		return treatyYear;
	}
	public void setTreatyYear(Integer treatyYear) {
		this.treatyYear = treatyYear;
	}
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getCommRate() {
		return commRate;
	}
	public void setCommRate(String commRate) {
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
	public List<TreatyShare> getTreatyShareList() {
		return treatyShareList;
	}
	public void setTreatyShareList(List<TreatyShare> treatyShareList) {
		this.treatyShareList = treatyShareList;
	}
	@Override
	public String toString() {
		return "TreatyComm [treatyYear=" + treatyYear + ", treatyId=" + treatyId + ", commRate=" + commRate
				+ ", sortSeq=" + sortSeq + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + ", treatyShareList=" + treatyShareList + "]";
	}
}

@Alias("SaveMtnTreatyShare")
class TreatyShare {
	private Integer treatyYear;
	private Integer treatyId;
	private String trtyCedId;
	private String pctShare;
	private Integer sortSeq;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	private List<CedingRetention> cedRetentionList;
	
	public Integer getTreatyYear() {
		return treatyYear;
	}
	public void setTreatyYear(Integer treatyYear) {
		this.treatyYear = treatyYear;
	}
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
	}
	public String getPctShare() {
		return pctShare;
	}
	public void setPctShare(String pctShare) {
		this.pctShare = pctShare;
	}
	public Integer getSortSeq() {
		return sortSeq;
	}
	public void setSortSeq(Integer sortSeq) {
		this.sortSeq = sortSeq;
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
	public List<CedingRetention> getCedRetentionList() {
		return cedRetentionList;
	}
	public void setCedRetentionList(List<CedingRetention> cedRetentionList) {
		this.cedRetentionList = cedRetentionList;
	}
	@Override
	public String toString() {
		return "TreatyShare [treatyYear=" + treatyYear + ", treatyId=" + treatyId + ", trtyCedId=" + trtyCedId
				+ ", pctShare=" + pctShare + ", sortSeq=" + sortSeq + ", remarks=" + remarks + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", cedRetentionList=" + cedRetentionList + "]";
	}
}

@Alias("SaveMtnCedingRetention")
class CedingRetention {
	private Integer treatyYear;
	private Integer treatyId;
	private String trtyCedId;
	private String cedingId;
	private Integer retLine1;
	private Integer retLine2;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getTreatyYear() {
		return treatyYear;
	}
	public void setTreatyYear(Integer treatyYear) {
		this.treatyYear = treatyYear;
	}
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
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
	@Override
	public String toString() {
		return "CedingRetention [treatyYear=" + treatyYear + ", treatyId=" + treatyId + ", trtyCedId=" + trtyCedId
				+ ", cedingId=" + cedingId + ", retLine1=" + retLine1 + ", retLine2=" + retLine2 + ", remarks="
				+ remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
