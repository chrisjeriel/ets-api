package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class UnappColInquiry {

	private Integer unappliedId;
	private String cedingId;
	private String cedingAbbr;
	private Integer refTranId;
	private String tranNo;
	private String transdtlType;
	private String transdtlName;
	private String itemName;
	private String refNo;
	private String remarks;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal totalUnapldAmt;
	private BigDecimal totalApldAmt;
	private BigDecimal balUnapldAmt;
	private Integer tranId;
	private DateTime tranDate;
	private String tranType;
	private String particulars;
	private BigDecimal paytAmt;
	private BigDecimal localAmt;
	private String returnTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
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
	public String getCedingAbbr() {
		return cedingAbbr;
	}
	public void setCedingAbbr(String cedingAbbr) {
		this.cedingAbbr = cedingAbbr;
	}
	public Integer getRefTranId() {
		return refTranId;
	}
	public void setRefTranId(Integer refTranId) {
		this.refTranId = refTranId;
	}
	public String getTranNo() {
		return tranNo;
	}
	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;
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
	public BigDecimal getBalUnapldAmt() {
		return balUnapldAmt;
	}
	public void setBalUnapldAmt(BigDecimal balUnapldAmt) {
		this.balUnapldAmt = balUnapldAmt;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public DateTime getTranDate() {
		return tranDate;
	}
	public void setTranDate(DateTime tranDate) {
		this.tranDate = tranDate;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public BigDecimal getPaytAmt() {
		return paytAmt;
	}
	public void setPaytAmt(BigDecimal paytAmt) {
		this.paytAmt = paytAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public String getReturnTag() {
		return returnTag;
	}
	public void setReturnTag(String returnTag) {
		this.returnTag = returnTag;
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
		return "UnappColInquiry [unappliedId=" + unappliedId + ", cedingId=" + cedingId + ", cedingAbbr=" + cedingAbbr
				+ ", refTranId=" + refTranId + ", tranNo=" + tranNo + ", transdtlType=" + transdtlType
				+ ", transdtlName=" + transdtlName + ", itemName=" + itemName + ", refNo=" + refNo + ", remarks="
				+ remarks + ", currCd=" + currCd + ", currRate=" + currRate + ", totalUnapldAmt=" + totalUnapldAmt
				+ ", totalApldAmt=" + totalApldAmt + ", balUnapldAmt=" + balUnapldAmt + ", tranId=" + tranId
				+ ", tranDate=" + tranDate + ", tranType=" + tranType + ", particulars=" + particulars + ", paytAmt="
				+ paytAmt + ", localAmt=" + localAmt + ", returnTag=" + returnTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
