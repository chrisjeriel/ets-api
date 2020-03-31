package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitUnappliedCollection {
	private Integer tranId;
	private Integer billId;
	private Integer itemNo;
	private String transdtlType;
	private String transdtlName;
	private String itemName;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal currAmt;
	private BigDecimal prevPaytAmt;
	private BigDecimal prevBalance;
	private BigDecimal unappliedAmt;
	private BigDecimal actualBalPaid;
	private BigDecimal localAmt;
	private BigDecimal newPaytAmt;
	private BigDecimal newBalance;
	private String refNo;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String processing;
	
	private Integer unappliedId;
	private String cedingId;
	private Integer refTranId;
	private Integer refBillId;
	private Integer refItemNo;
	private String transDtlType;
	private BigDecimal totalUnapldAmt;
	private BigDecimal totalApldAmt;
	private BigDecimal tempApldAmt;
	private BigDecimal balUnapldAmt;
	private String returnTag;
	
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
	
	public BigDecimal getCurrAmt() {
		return currAmt;
	}
	public void setCurrAmt(BigDecimal currAmt) {
		this.currAmt = currAmt;
	}
	public BigDecimal getPrevPaytAmt() {
		return prevPaytAmt;
	}
	public void setPrevPaytAmt(BigDecimal prevPaytAmt) {
		this.prevPaytAmt = prevPaytAmt;
	}
	public BigDecimal getPrevBalance() {
		return prevBalance;
	}
	public void setPrevBalance(BigDecimal prevBalance) {
		this.prevBalance = prevBalance;
	}
	public BigDecimal getUnappliedAmt() {
		return unappliedAmt;
	}
	
	public String getProcessing() {
		return processing;
	}
	public void setProcessing(String processing) {
		this.processing = processing;
	}
	public void setUnappliedAmt(BigDecimal unappliedAmt) {
		this.unappliedAmt = unappliedAmt;
	}
	public BigDecimal getActualBalPaid() {
		return actualBalPaid;
	}
	public void setActualBalPaid(BigDecimal actualBalPaid) {
		this.actualBalPaid = actualBalPaid;
	}
	public BigDecimal getNewPaytAmt() {
		return newPaytAmt;
	}
	public void setNewPaytAmt(BigDecimal newPaytAmt) {
		this.newPaytAmt = newPaytAmt;
	}
	public BigDecimal getNewBalance() {
		return newBalance;
	}
	public void setNewBalance(BigDecimal newBalance) {
		this.newBalance = newBalance;
	}
	public String getTransdtlType() {
		return transdtlType;
	}
	public void setTransdtlType(String transdtlType) {
		this.transdtlType = transdtlType;
	}
	public String getTransdtlName() {
		return transdtlName;
	}
	public void setTransdtlName(String transdtlName) {
		this.transdtlName = transdtlName;
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
	public Integer getUnappliedId() {
		return unappliedId;
	}
	public void setUnappliedId(Integer unappliedId) {
		this.unappliedId = unappliedId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public Integer getRefTranId() {
		return refTranId;
	}
	public void setRefTranId(Integer refTranId) {
		this.refTranId = refTranId;
	}
	public Integer getRefBillId() {
		return refBillId;
	}
	public void setRefBillId(Integer refBillId) {
		this.refBillId = refBillId;
	}
	public Integer getRefItemNo() {
		return refItemNo;
	}
	public void setRefItemNo(Integer refItemNo) {
		this.refItemNo = refItemNo;
	}
	public String getTransDtlType() {
		return transDtlType;
	}
	public void setTransDtlType(String transDtlType) {
		this.transDtlType = transDtlType;
	}
	public BigDecimal getTotalUnapldAmt() {
		return totalUnapldAmt;
	}
	public void setTotalUnapldAmt(BigDecimal totalUnapldAmt) {
		this.totalUnapldAmt = totalUnapldAmt;
	}
	public BigDecimal getTotalApldAmt() {
		return totalApldAmt;
	}
	public void setTotalApldAmt(BigDecimal totalApldAmt) {
		this.totalApldAmt = totalApldAmt;
	}
	public BigDecimal getTempApldAmt() {
		return tempApldAmt;
	}
	public void setTempApldAmt(BigDecimal tempApldAmt) {
		this.tempApldAmt = tempApldAmt;
	}
	public BigDecimal getBalUnapldAmt() {
		return balUnapldAmt;
	}
	public void setBalUnapldAmt(BigDecimal balUnapldAmt) {
		this.balUnapldAmt = balUnapldAmt;
	}
	public String getReturnTag() {
		return returnTag;
	}
	public void setReturnTag(String returnTag) {
		this.returnTag = returnTag;
	}
	@Override
	public String toString() {
		return "AcitUnappliedCollection [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo
				+ ", transdtlType=" + transdtlType + ", transdtlName=" + transdtlName + ", itemName=" + itemName
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", currAmt=" + currAmt + ", prevPaytAmt="
				+ prevPaytAmt + ", prevBalance=" + prevBalance + ", unappliedAmt=" + unappliedAmt + ", actualBalPaid="
				+ actualBalPaid + ", localAmt=" + localAmt + ", newPaytAmt=" + newPaytAmt + ", newBalance=" + newBalance
				+ ", refNo=" + refNo + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", processing="
				+ processing + ", unappliedId=" + unappliedId + ", cedingId=" + cedingId + ", refTranId=" + refTranId
				+ ", refBillId=" + refBillId + ", refItemNo=" + refItemNo + ", transDtlType=" + transDtlType
				+ ", totalUnapldAmt=" + totalUnapldAmt + ", totalApldAmt=" + totalApldAmt + ", tempApldAmt="
				+ tempApldAmt + ", balUnapldAmt=" + balUnapldAmt + ", returnTag=" + returnTag + "]";
	}
	
	
}
