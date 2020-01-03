package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class AcsePerDiem {
	private Integer reqId;
	private Integer itemNo;
	private String directorId;
	private String directorName;
	private Integer feeType;
	private String feeTypeDesc;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal feeAmt;
	private BigDecimal localAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	private List<CvItemTaxes> taxAllocation;
	
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public String getDirectorId() {
		return directorId;
	}
	public void setDirectorId(String directorId) {
		this.directorId = directorId;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public Integer getFeeType() {
		return feeType;
	}
	public void setFeeType(Integer feeType) {
		this.feeType = feeType;
	}
	public String getFeeTypeDesc() {
		return feeTypeDesc;
	}
	public void setFeeTypeDesc(String feeTypeDesc) {
		this.feeTypeDesc = feeTypeDesc;
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
	public BigDecimal getFeeAmt() {
		return feeAmt;
	}
	public void setFeeAmt(BigDecimal feeAmt) {
		this.feeAmt = feeAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
	public List<CvItemTaxes> getTaxAllocation() {
		return taxAllocation;
	}
	public void setTaxAllocation(List<CvItemTaxes> taxAllocation) {
		this.taxAllocation = taxAllocation;
	}
	@Override
	public String toString() {
		return "AcsePerDiem [reqId=" + reqId + ", itemNo=" + itemNo + ", directorId=" + directorId + ", directorName="
				+ directorName + ", feeType=" + feeType + ", feeTypeDesc=" + feeTypeDesc + ", currCd=" + currCd
				+ ", currRate=" + currRate + ", feeAmt=" + feeAmt + ", localAmt=" + localAmt + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", taxAllocation=" + taxAllocation + "]";
	}
}
