package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcseJournalVoucherList {
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
	public DateTime getPreparedDate() {
		return preparedDate;
	}
	public void setPreparedDate(DateTime preparedDate) {
		this.preparedDate = preparedDate;
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
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
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
		return "AcseJournalVoucherList [tranId=" + tranId + ", jvYear=" + jvYear + ", jvNo=" + jvNo + ", jvDate="
				+ jvDate + ", jvStatus=" + jvStatus + ", statusName=" + statusName + ", tranTypeCd=" + tranTypeCd
				+ ", tranTypeName=" + tranTypeName + ", autoTag=" + autoTag + ", refnoTranId=" + refnoTranId
				+ ", refnoDate=" + refnoDate + ", particulars=" + particulars + ", currCd=" + currCd + ", currRate="
				+ currRate + ", jvAmt=" + jvAmt + ", localAmt=" + localAmt + ", allocTag=" + allocTag + ", allocTranId="
				+ allocTranId + ", preparedBy=" + preparedBy + ", preparedName=" + preparedName + ", preparedPosition="
				+ preparedPosition + ", preparedDate=" + preparedDate + ", approvedBy=" + approvedBy + ", approvedName="
				+ approvedName + ", approvedPosition=" + approvedPosition + ", approvedDate=" + approvedDate
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}
