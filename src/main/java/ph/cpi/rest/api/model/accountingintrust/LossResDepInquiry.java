package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class LossResDepInquiry {

	private String cedingId;
	private String cedingAbbr;
	private String cedingName;
	private String membershipTag;
	private DateTime membershipDate;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal lossresdep;
	private BigDecimal lossresdepLocal;
	private BigDecimal lossresdepDue;
	private BigDecimal lossresdepDueLocal;
	
	private Integer tranId;
	private String tranNo;
	private DateTime tranDate;
	private String tranType;
	private String particulars;
	private BigDecimal lossresdepPayt;
	private BigDecimal lossresdepPaytLocal;
	
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
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getMembershipTag() {
		return membershipTag;
	}
	public void setMembershipTag(String membershipTag) {
		this.membershipTag = membershipTag;
	}
	public DateTime getMembershipDate() {
		return membershipDate;
	}
	public void setMembershipDate(DateTime membershipDate) {
		this.membershipDate = membershipDate;
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
	public BigDecimal getLossresdep() {
		return lossresdep;
	}
	public void setLossresdep(BigDecimal lossresdep) {
		this.lossresdep = lossresdep;
	}
	public BigDecimal getLossresdepLocal() {
		return lossresdepLocal;
	}
	public void setLossresdepLocal(BigDecimal lossresdepLocal) {
		this.lossresdepLocal = lossresdepLocal;
	}
	public BigDecimal getLossresdepDue() {
		return lossresdepDue;
	}
	public void setLossresdepDue(BigDecimal lossresdepDue) {
		this.lossresdepDue = lossresdepDue;
	}
	public BigDecimal getLossresdepDueLocal() {
		return lossresdepDueLocal;
	}
	public void setLossresdepDueLocal(BigDecimal lossresdepDueLocal) {
		this.lossresdepDueLocal = lossresdepDueLocal;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getTranNo() {
		return tranNo;
	}
	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;
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
	public BigDecimal getLossresdepPayt() {
		return lossresdepPayt;
	}
	public void setLossresdepPayt(BigDecimal lossresdepPayt) {
		this.lossresdepPayt = lossresdepPayt;
	}
	public BigDecimal getLossresdepPaytLocal() {
		return lossresdepPaytLocal;
	}
	public void setLossresdepPaytLocal(BigDecimal lossresdepPaytLocal) {
		this.lossresdepPaytLocal = lossresdepPaytLocal;
	}
	@Override
	public String toString() {
		return "LossResDepInquiry [cedingId=" + cedingId + ", cedingAbbr=" + cedingAbbr + ", cedingName=" + cedingName
				+ ", membershipTag=" + membershipTag + ", membershipDate=" + membershipDate + ", currCd=" + currCd
				+ ", currRate=" + currRate + ", lossresdep=" + lossresdep + ", lossresdepLocal=" + lossresdepLocal
				+ ", lossresdepDue=" + lossresdepDue + ", lossresdepDueLocal=" + lossresdepDueLocal + ", tranId="
				+ tranId + ", tranNo=" + tranNo + ", tranDate=" + tranDate + ", tranType=" + tranType + ", particulars="
				+ particulars + ", lossresdepPayt=" + lossresdepPayt + ", lossresdepPaytLocal=" + lossresdepPaytLocal
				+ "]";
	}
}
