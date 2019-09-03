package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class AcitJVClaimsLosses {
	private Integer tranId;
	private Integer itemNo;
	private String cedingId;
	private String cedingName;
	private Integer claimId;
	private Integer projId;
	private Integer histNo;
	private String claimNo;
	private String histCategory;
	private String histCategoryDesc;
	private Integer histType;
	private String histTypeDesc;
	private String exGratia;
	private BigDecimal reserveAmt;
	private String insuredDesc;
	private String paymentFor;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal paytAmt;
	private BigDecimal clmPaytAmt;
	private BigDecimal localAmt;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private List<AcitJVInwPolBal> inwPolBal;
	
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
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
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public String getHistCategory() {
		return histCategory;
	}
	public void setHistCategory(String histCategory) {
		this.histCategory = histCategory;
	}
	public String getHistCategoryDesc() {
		return histCategoryDesc;
	}
	public void setHistCategoryDesc(String histCategoryDesc) {
		this.histCategoryDesc = histCategoryDesc;
	}
	public Integer getHistType() {
		return histType;
	}
	public void setHistType(Integer histType) {
		this.histType = histType;
	}
	public String getHistTypeDesc() {
		return histTypeDesc;
	}
	public void setHistTypeDesc(String histTypeDesc) {
		this.histTypeDesc = histTypeDesc;
	}
	public String getExGratia() {
		return exGratia;
	}
	public void setExGratia(String exGratia) {
		this.exGratia = exGratia;
	}
	public BigDecimal getReserveAmt() {
		return reserveAmt;
	}
	public void setReserveAmt(BigDecimal reserveAmt) {
		this.reserveAmt = reserveAmt;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getPaymentFor() {
		return paymentFor;
	}
	public void setPaymentFor(String paymentFor) {
		this.paymentFor = paymentFor;
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
	
	public BigDecimal getPaytAmt() {
		return paytAmt;
	}
	public void setPaytAmt(BigDecimal paytAmt) {
		this.paytAmt = paytAmt;
	}
	public BigDecimal getClmPaytAmt() {
		return clmPaytAmt;
	}
	public void setClmPaytAmt(BigDecimal clmPaytAmt) {
		this.clmPaytAmt = clmPaytAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
	public List<AcitJVInwPolBal> getInwPolBal() {
		return inwPolBal;
	}
	public void setInwPolBal(List<AcitJVInwPolBal> inwPolBal) {
		this.inwPolBal = inwPolBal;
	}
	@Override
	public String toString() {
		return "AcitJVClaimsLosses [tranId=" + tranId + ", itemNo=" + itemNo + ", cedingId=" + cedingId
				+ ", cedingName=" + cedingName + ", claimId=" + claimId + ", projId=" + projId + ", histNo=" + histNo
				+ ", claimNo=" + claimNo + ", histCategory=" + histCategory + ", histCategoryDesc=" + histCategoryDesc
				+ ", histType=" + histType + ", histTypeDesc=" + histTypeDesc + ", exGratia=" + exGratia
				+ ", reserveAmt=" + reserveAmt + ", insuredDesc=" + insuredDesc + ", paymentFor=" + paymentFor
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", paytAmt=" + paytAmt + ", clmPaytAmt="
				+ clmPaytAmt + ", localAmt=" + localAmt + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", inwPolBal=" + inwPolBal + "]";
	}
	
}
