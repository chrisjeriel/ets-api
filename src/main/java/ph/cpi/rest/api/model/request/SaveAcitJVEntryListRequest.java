package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveAcitJVEntryListRequest {
	
	private List<saveAcitJVEntryList> saveAcitJVEntryList;
	private List<acitAllocInvtInc> saveAcitAllocInvtIncome;
	
	public List<saveAcitJVEntryList> getSaveAcitJVEntryList() {
		return saveAcitJVEntryList;
	}
	public void setSaveAcitJVEntryList(List<saveAcitJVEntryList> saveAcitJVEntryList) {
		this.saveAcitJVEntryList = saveAcitJVEntryList;
	}
	public List<acitAllocInvtInc> getSaveAcitAllocInvtIncome() {
		return saveAcitAllocInvtIncome;
	}
	public void setSaveAcitAllocInvtIncome(List<acitAllocInvtInc> saveAcitAllocInvtIncome) {
		this.saveAcitAllocInvtIncome = saveAcitAllocInvtIncome;
	}
	
	@Override
	public String toString() {
		return "SaveAcitJVEntryListRequest [saveAcitJVEntryList=" + saveAcitJVEntryList + ", saveAcitAllocInvtIncome="
				+ saveAcitAllocInvtIncome + "]";
	}
}

class saveAcitJVEntryList{
	private Integer tranId;
	private String 	tranDate;
	private String 	tranClass;
	private Integer tranTypeCd;
	private Integer tranType;
	private Integer tranYear;
	private Integer tranClassNo;
	private String 	tranStat;
	private String 	closeDate;
	private String 	deleteDate;
	private String 	postDate;
	private String 	createUser;
	private String 	createDate;
	private String 	updateUser;
	private String 	updateDate;
	
	private Integer tranIdJv;
	private Integer jvYear;
	private Integer jvNo;
	private String 	jvDate;
	private String 	jvStatus;
	private Integer jvTranTypeCd;
	private String 	tranTypeName;
	private String 	autoTag;
	private Integer refnoTranId;
	private String 	refnoDate;
	private String particulars;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal jvAmt;
	private BigDecimal localAmt;
	private String allocTag;
	private Integer allocTranId;
	private String preparedBy;
	private String preparedDate;
	private String approvedBy;
	private String approvedDate;
	private String createUserJv;
	private String createDateJv;
	private String updateUserJv;
	private String updateDateJv;
	
	public Integer getTranType() {
		return tranType;
	}
	public void setTranType(Integer tranType) {
		this.tranType = tranType;
	}
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
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
	public String getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
	public String getDeleteDate() {
		return deleteDate;
	}
	public void setDeleteDate(String deleteDate) {
		this.deleteDate = deleteDate;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
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
	public Integer getTranIdJv() {
		return tranIdJv;
	}
	public void setTranIdJv(Integer tranIdJv) {
		this.tranIdJv = tranIdJv;
	}
	public Integer getJvYear() {
		return jvYear;
	}
	public void setJvYear(Integer jvYear) {
		this.jvYear = jvYear;
	}
	public Integer getJvNo() {
		return jvNo;
	}
	public void setJvNo(Integer jvNo) {
		this.jvNo = jvNo;
	}
	public String getJvDate() {
		return jvDate;
	}
	public void setJvDate(String jvDate) {
		this.jvDate = jvDate;
	}
	public String getJvStatus() {
		return jvStatus;
	}
	public void setJvStatus(String jvStatus) {
		this.jvStatus = jvStatus;
	}
	public Integer getJvTranTypeCd() {
		return jvTranTypeCd;
	}
	public void setJvTranTypeCd(Integer jvTranTypeCd) {
		this.jvTranTypeCd = jvTranTypeCd;
	}
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}
	public String getAutoTag() {
		return autoTag;
	}
	public void setAutoTag(String autoTag) {
		this.autoTag = autoTag;
	}
	public Integer getRefnoTranId() {
		return refnoTranId;
	}
	public void setRefnoTranId(Integer refnoTranId) {
		this.refnoTranId = refnoTranId;
	}
	public String getRefnoDate() {
		return refnoDate;
	}
	public void setRefnoDate(String refnoDate) {
		this.refnoDate = refnoDate;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
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
	public BigDecimal getJvAmt() {
		return jvAmt;
	}
	public void setJvAmt(BigDecimal jvAmt) {
		this.jvAmt = jvAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public String getAllocTag() {
		return allocTag;
	}
	public void setAllocTag(String allocTag) {
		this.allocTag = allocTag;
	}
	public Integer getAllocTranId() {
		return allocTranId;
	}
	public void setAllocTranId(Integer allocTranId) {
		this.allocTranId = allocTranId;
	}
	public String getPreparedBy() {
		return preparedBy;
	}
	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}
	public String getPreparedDate() {
		return preparedDate;
	}
	public void setPreparedDate(String preparedDate) {
		this.preparedDate = preparedDate;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public String getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
	}
	public String getCreateUserJv() {
		return createUserJv;
	}
	public void setCreateUserJv(String createUserJv) {
		this.createUserJv = createUserJv;
	}
	public String getCreateDateJv() {
		return createDateJv;
	}
	public void setCreateDateJv(String createDateJv) {
		this.createDateJv = createDateJv;
	}
	public String getUpdateUserJv() {
		return updateUserJv;
	}
	public void setUpdateUserJv(String updateUserJv) {
		this.updateUserJv = updateUserJv;
	}
	public String getUpdateDateJv() {
		return updateDateJv;
	}
	public void setUpdateDateJv(String updateDateJv) {
		this.updateDateJv = updateDateJv;
	}
	
	@Override
	public String toString() {
		return "saveAcitJVEntryList [tranId=" + tranId + ", tranDate=" + tranDate + ", tranClass=" + tranClass
				+ ", tranTypeCd=" + tranTypeCd + ", tranType=" + tranType + ", tranYear=" + tranYear + ", tranClassNo="
				+ tranClassNo + ", tranStat=" + tranStat + ", closeDate=" + closeDate + ", deleteDate=" + deleteDate
				+ ", postDate=" + postDate + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", tranIdJv=" + tranIdJv + ", jvYear="
				+ jvYear + ", jvNo=" + jvNo + ", jvDate=" + jvDate + ", jvStatus=" + jvStatus + ", jvTranTypeCd="
				+ jvTranTypeCd + ", tranTypeName=" + tranTypeName + ", autoTag=" + autoTag + ", refnoTranId="
				+ refnoTranId + ", refnoDate=" + refnoDate + ", particulars=" + particulars + ", currCd=" + currCd
				+ ", currRate=" + currRate + ", jvAmt=" + jvAmt + ", localAmt=" + localAmt + ", allocTag=" + allocTag
				+ ", allocTranId=" + allocTranId + ", preparedBy=" + preparedBy + ", preparedDate=" + preparedDate
				+ ", approvedBy=" + approvedBy + ", approvedDate=" + approvedDate + ", createUserJv=" + createUserJv
				+ ", createDateJv=" + createDateJv + ", updateUserJv=" + updateUserJv + ", updateDateJv=" + updateDateJv
				+ "]";
	}
	
}

@Alias ("acitAllocInvtInc")
class acitAllocInvtInc{

	private String refTranId;
	private String createDate;
	private String createUser;
	private String updateDate;
	private String updateUser;
	
	public String getRefTranId() {
		return refTranId;
	}
	public void setRefTranId(String refTranId) {
		this.refTranId = refTranId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	@Override
	public String toString() {
		return "acitAllocInvtInc [refTranId=" + refTranId + ", createDate=" + createDate + ", createUser=" + createUser
				+ ", updateDate=" + updateDate + ", updateUser=" + updateUser + "]";
	}
	
	
}
