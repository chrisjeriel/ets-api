package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class AcseOrServFee {
	private Integer tranId;
	private Integer billId;
	private Integer itemNo;
	private DateTime quarterEnding;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal servFeeAmt;
	private BigDecimal localAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private Integer vatTag;
	private BigDecimal netDue;
	private BigDecimal netDueLocal;
	
	List<OrItemTaxes> taxAllocation;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getBillId() {
		return billId;
	}
	public void setBillId(Integer billId) {
		this.billId = billId;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public DateTime getQuarterEnding() {
		return quarterEnding;
	}
	public void setQuarterEnding(DateTime quarterEnding) {
		this.quarterEnding = quarterEnding;
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
	public BigDecimal getServFeeAmt() {
		return servFeeAmt;
	}
	public void setServFeeAmt(BigDecimal servFeeAmt) {
		this.servFeeAmt = servFeeAmt;
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
	public Integer getVatTag() {
		return vatTag;
	}
	public void setVatTag(Integer vatTag) {
		this.vatTag = vatTag;
	}
	public BigDecimal getNetDue() {
		return netDue;
	}
	public void setNetDue(BigDecimal netDue) {
		this.netDue = netDue;
	}
	public BigDecimal getNetDueLocal() {
		return netDueLocal;
	}
	public void setNetDueLocal(BigDecimal netDueLocal) {
		this.netDueLocal = netDueLocal;
	}
	public List<OrItemTaxes> getTaxAllocation() {
		return taxAllocation;
	}
	public void setTaxAllocation(List<OrItemTaxes> taxAllocation) {
		this.taxAllocation = taxAllocation;
	}
	@Override
	public String toString() {
		return "AcseOrServFee [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", quarterEnding="
				+ quarterEnding + ", currCd=" + currCd + ", currRate=" + currRate + ", servFeeAmt=" + servFeeAmt
				+ ", localAmt=" + localAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", vatTag=" + vatTag + ", netDue="
				+ netDue + ", netDueLocal=" + netDueLocal + ", taxAllocation=" + taxAllocation + "]";
	}
}
