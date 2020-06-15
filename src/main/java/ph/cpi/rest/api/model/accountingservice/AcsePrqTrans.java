package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class AcsePrqTrans {
	private Integer reqId;
	private Integer itemNo;
	private Integer tranTypeCd;
	private String itemName;
	private Integer glAcctId;
	private String refNo;
	private String remarks;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal currAmt;
	private BigDecimal localAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String acctCd;
	private Integer vatTag;
	
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
	public Integer getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(Integer glAcctId) {
		this.glAcctId = glAcctId;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	public BigDecimal getCurrAmt() {
		return currAmt;
	}
	public void setCurrAmt(BigDecimal currAmt) {
		this.currAmt = currAmt;
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
	public String getAcctCd() {
		return acctCd;
	}
	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
	}
	public Integer getVatTag() {
		return vatTag;
	}
	public void setVatTag(Integer vatTag) {
		this.vatTag = vatTag;
	}
	public List<CvItemTaxes> getTaxAllocation() {
		return taxAllocation;
	}
	public void setTaxAllocation(List<CvItemTaxes> taxAllocation) {
		this.taxAllocation = taxAllocation;
	}
	@Override
	public String toString() {
		return "AcsePrqTrans [reqId=" + reqId + ", itemNo=" + itemNo + ", tranTypeCd=" + tranTypeCd + ", itemName="
				+ itemName + ", glAcctId=" + glAcctId + ", refNo=" + refNo + ", remarks=" + remarks + ", currCd="
				+ currCd + ", currRate=" + currRate + ", currAmt=" + currAmt + ", localAmt=" + localAmt
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", acctCd=" + acctCd + ", vatTag=" + vatTag + ", taxAllocation="
				+ taxAllocation + "]";
	}
}
