package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitArClmCashCall {
	private Integer tranId;
	private Integer billId;
	private Integer itemNo;
	private Integer claimId;
	private String claimNo;
	private String paytType;
	private String paytTypeName;
	private String coClmNo;
	private Integer policyId;
	private String policyNo;
	private DateTime lossDate;
	private String currCd;
	private BigDecimal currRate;
	private String remarks;
	private BigDecimal recOverAmt;
	private BigDecimal localAmt;
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
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public String getPaytType() {
		return paytType;
	}
	public void setPaytType(String paytType) {
		this.paytType = paytType;
	}
	public String getPaytTypeName() {
		return paytTypeName;
	}
	public void setPaytTypeName(String paytTypeName) {
		this.paytTypeName = paytTypeName;
	}
	public String getCoClmNo() {
		return coClmNo;
	}
	public void setCoClmNo(String coClmNo) {
		this.coClmNo = coClmNo;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public DateTime getLossDate() {
		return lossDate;
	}
	public void setLossDate(DateTime lossDate) {
		this.lossDate = lossDate;
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
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public BigDecimal getRecOverAmt() {
		return recOverAmt;
	}
	public void setRecOverAmt(BigDecimal recOverAmt) {
		this.recOverAmt = recOverAmt;
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
	
	@Override
	public String toString() {
		return "AcitArClmCashCall [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", claimId="
				+ claimId + ", claimNo=" + claimNo + ", paytType=" + paytType + ", paytTypeName=" + paytTypeName
				+ ", coClmNo=" + coClmNo + ", policyId=" + policyId + ", policyNo=" + policyNo + ", lossDate="
				+ lossDate + ", currCd=" + currCd + ", currRate=" + currRate + ", remarks=" + remarks + ", recOverAmt="
				+ recOverAmt + ", localAmt=" + localAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
