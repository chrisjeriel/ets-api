package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class AcseInsuranceExp {
	private Integer reqId;
	private Integer itemNo;
	private Integer insuredTypeCd;
	private String insuredCd;
	private String insuredName;
	private Integer insuranceType;
	private String	insuranceTypeDesc;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal insuredAmt;
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
	public Integer getInsuredTypeCd() {
		return insuredTypeCd;
	}
	public void setInsuredTypeCd(Integer insuredTypeCd) {
		this.insuredTypeCd = insuredTypeCd;
	}
	public String getInsuredCd() {
		return insuredCd;
	}
	public void setInsuredCd(String insuredCd) {
		this.insuredCd = insuredCd;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public Integer getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(Integer insuranceType) {
		this.insuranceType = insuranceType;
	}
	public String getInsuranceTypeDesc() {
		return insuranceTypeDesc;
	}
	public void setInsuranceTypeDesc(String insuranceTypeDesc) {
		this.insuranceTypeDesc = insuranceTypeDesc;
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
	public BigDecimal getInsuredAmt() {
		return insuredAmt;
	}
	public void setInsuredAmt(BigDecimal insuredAmt) {
		this.insuredAmt = insuredAmt;
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
		return "AcseInsuranceExp [reqId=" + reqId + ", itemNo=" + itemNo + ", insuredTypeCd=" + insuredTypeCd
				+ ", insuredCd=" + insuredCd + ", insuredName=" + insuredName + ", insuranceType=" + insuranceType
				+ ", insuranceTypeDesc=" + insuranceTypeDesc + ", currCd=" + currCd + ", currRate=" + currRate
				+ ", insuredAmt=" + insuredAmt + ", localAmt=" + localAmt + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", taxAllocation=" + taxAllocation + "]";
	}
}
