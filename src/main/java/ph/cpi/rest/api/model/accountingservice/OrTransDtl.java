package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class OrTransDtl {
	private Integer tranId;
	private Integer billId;
	private Integer itemNo;
	private String itemName;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal currAmt;
	private BigDecimal localAmt;
	private String refNo;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	private List<OrItemTaxes> taxAllocation;

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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	public List<OrItemTaxes> getTaxAllocation() {
		return taxAllocation;
	}

	public void setTaxAllocation(List<OrItemTaxes> taxAllocation) {
		this.taxAllocation = taxAllocation;
	}

	@Override
	public String toString() {
		return "OrTransDtl [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", itemName=" + itemName
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", currAmt=" + currAmt + ", localAmt=" + localAmt
				+ ", refNo=" + refNo + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", taxAllocation="
				+ taxAllocation + "]";
	}

	
}