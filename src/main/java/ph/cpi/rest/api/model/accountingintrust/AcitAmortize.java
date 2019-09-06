package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitAmortize {

	private Integer 	invtId;
	private Integer     amortNo;
	private DateTime 	startDate;
	private DateTime 	endDate;
	private String		amortDays;
	private String 		couponDays;
	private BigDecimal  coupon;
	private BigDecimal	effAmt;
	private BigDecimal  amortAmt;
	private BigDecimal  amortInvtAmt;
	private BigDecimal  amortDailyAmt;
	
	public Integer getInvtId() {
		return invtId;
	}
	public void setInvtId(Integer invtId) {
		this.invtId = invtId;
	}
	public Integer getAmortNo() {
		return amortNo;
	}
	public void setAmortNo(Integer amortNo) {
		this.amortNo = amortNo;
	}
	public DateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	public DateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	public String getAmortDays() {
		return amortDays;
	}
	public void setAmortDays(String amortDays) {
		this.amortDays = amortDays;
	}
	public String getCouponDays() {
		return couponDays;
	}
	public void setCouponDays(String couponDays) {
		this.couponDays = couponDays;
	}
	public BigDecimal getCoupon() {
		return coupon;
	}
	public void setCoupon(BigDecimal coupon) {
		this.coupon = coupon;
	}
	public BigDecimal getEffAmt() {
		return effAmt;
	}
	public void setEffAmt(BigDecimal effAmt) {
		this.effAmt = effAmt;
	}
	public BigDecimal getAmortAmt() {
		return amortAmt;
	}
	public void setAmortAmt(BigDecimal amortAmt) {
		this.amortAmt = amortAmt;
	}
	public BigDecimal getAmortInvtAmt() {
		return amortInvtAmt;
	}
	public void setAmortInvtAmt(BigDecimal amortInvtAmt) {
		this.amortInvtAmt = amortInvtAmt;
	}
	public BigDecimal getAmortDailyAmt() {
		return amortDailyAmt;
	}
	public void setAmortDailyAmt(BigDecimal amortDailyAmt) {
		this.amortDailyAmt = amortDailyAmt;
	}
	
	@Override
	public String toString() {
		return "AcitAmortize [invtId=" + invtId + ", amortNo=" + amortNo + ", startDate=" + startDate + ", endDate="
				+ endDate + ", amortDays=" + amortDays + ", couponDays=" + couponDays + ", coupon=" + coupon
				+ ", effAmt=" + effAmt + ", amortAmt=" + amortAmt + ", amortInvtAmt=" + amortInvtAmt
				+ ", amortDailyAmt=" + amortDailyAmt + "]";
	}
	
}
