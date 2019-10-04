package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcseJournalVoucherEntry {
	private Integer tranIdTran;
	private DateTime tranDate;
	private String tranClass;
	private Integer tranYear;
	private Integer tranClassNo;
	private String tranStat;
	private DateTime closeDate;
	private DateTime deleteDate;
	private DateTime postDate;
	private String createUserTran;
	private DateTime createDateTran;
	private String updateUserTran;
	private DateTime updateDateTran;
	private String tranTypeCdTran;
	
	private Integer tranId;
	private Integer jvYear;
	private String jvNo;
	private DateTime jvDate;
	private String jvStatus;
	private String statusName;
	private Integer tranTypeCd;
	private String tranTypeName;
	private String autoTag;
	private Integer refnoTranId;
	private DateTime refnoDate;
	private String particulars;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal jvAmt;
	private BigDecimal localAmt;
	private String allocTag;
	private String allocTranId;
	private String preparedBy;
	private String preparedName;
	private String preparedPosition;
	private DateTime preparedDate;
	private String approvedBy;
	private String approvedName;
	private String approvedPosition;
	private DateTime approvedDate;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	
	public Integer getTranIdTran() {
		return tranIdTran;
	}
	public void setTranIdTran(Integer tranIdTran) {
		this.tranIdTran = tranIdTran;
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
	public String getCreateUserTran() {
		return createUserTran;
	}
	public void setCreateUserTran(String createUserTran) {
		this.createUserTran = createUserTran;
	}
	public DateTime getCreateDateTran() {
		return createDateTran;
	}
	public void setCreateDateTran(DateTime createDateTran) {
		this.createDateTran = createDateTran;
	}
	public String getUpdateUserTran() {
		return updateUserTran;
	}
	public void setUpdateUserTran(String updateUserTran) {
		this.updateUserTran = updateUserTran;
	}
	public DateTime getUpdateDateTran() {
		return updateDateTran;
	}
	public void setUpdateDateTran(DateTime updateDateTran) {
		this.updateDateTran = updateDateTran;
	}
	public String getTranTypeCdTran() {
		return tranTypeCdTran;
	}
	public void setTranTypeCdTran(String tranTypeCdTran) {
		this.tranTypeCdTran = tranTypeCdTran;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getJvYear() {
		return jvYear;
	}
	public void setJvYear(Integer jvYear) {
		this.jvYear = jvYear;
	}
	public String getJvNo() {
		return jvNo;
	}
	public void setJvNo(String jvNo) {
		this.jvNo = jvNo;
	}
	public DateTime getJvDate() {
		return jvDate;
	}
	public void setJvDate(DateTime jvDate) {
		this.jvDate = jvDate;
	}
	public String getJvStatus() {
		return jvStatus;
	}
	public void setJvStatus(String jvStatus) {
		this.jvStatus = jvStatus;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public Integer getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
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
	public DateTime getRefnoDate() {
		return refnoDate;
	}
	public void setRefnoDate(DateTime refnoDate) {
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
	public String getAllocTranId() {
		return allocTranId;
	}
	public void setAllocTranId(String allocTranId) {
		this.allocTranId = allocTranId;
	}
	public String getPreparedBy() {
		return preparedBy;
	}
	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}
	public String getPreparedName() {
		return preparedName;
	}
	public void setPreparedName(String preparedName) {
		this.preparedName = preparedName;
	}
	public String getPreparedPosition() {
		return preparedPosition;
	}
	public void setPreparedPosition(String preparedPosition) {
		this.preparedPosition = preparedPosition;
	}
	public DateTime getPreparedDate() {
		return preparedDate;
	}
	public void setPreparedDate(DateTime preparedDate) {
		this.preparedDate = preparedDate;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public String getApprovedName() {
		return approvedName;
	}
	public void setApprovedName(String approvedName) {
		this.approvedName = approvedName;
	}
	public String getApprovedPosition() {
		return approvedPosition;
	}
	public void setApprovedPosition(String approvedPosition) {
		this.approvedPosition = approvedPosition;
	}
	public DateTime getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(DateTime approvedDate) {
		this.approvedDate = approvedDate;
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
		return "AcseJournalVoucherEntry [tranIdTran=" + tranIdTran + ", tranDate=" + tranDate + ", tranClass="
				+ tranClass + ", tranYear=" + tranYear + ", tranClassNo=" + tranClassNo + ", tranStat=" + tranStat
				+ ", closeDate=" + closeDate + ", deleteDate=" + deleteDate + ", postDate=" + postDate
				+ ", createUserTran=" + createUserTran + ", createDateTran=" + createDateTran + ", updateUserTran="
				+ updateUserTran + ", updateDateTran=" + updateDateTran + ", tranTypeCdTran=" + tranTypeCdTran
				+ ", tranId=" + tranId + ", jvYear=" + jvYear + ", jvNo=" + jvNo + ", jvDate=" + jvDate + ", jvStatus="
				+ jvStatus + ", statusName=" + statusName + ", tranTypeCd=" + tranTypeCd + ", tranTypeName="
				+ tranTypeName + ", autoTag=" + autoTag + ", refnoTranId=" + refnoTranId + ", refnoDate=" + refnoDate
				+ ", particulars=" + particulars + ", currCd=" + currCd + ", currRate=" + currRate + ", jvAmt=" + jvAmt
				+ ", localAmt=" + localAmt + ", allocTag=" + allocTag + ", allocTranId=" + allocTranId + ", preparedBy="
				+ preparedBy + ", preparedName=" + preparedName + ", preparedPosition=" + preparedPosition
				+ ", preparedDate=" + preparedDate + ", approvedBy=" + approvedBy + ", approvedName=" + approvedName
				+ ", approvedPosition=" + approvedPosition + ", approvedDate=" + approvedDate + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
	
}
