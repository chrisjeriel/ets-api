package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;


public class AcitOsQsoa {

	private Integer qsoaId;
	private DateTime quarterEnding;
	private String currCd;
	private String cedingId;
	private BigDecimal netQsoaAmt;
	private BigDecimal cumPayt;
	private BigDecimal remainingBal;
	private String processing;
	
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
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
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public BigDecimal getNetQsoaAmt() {
		return netQsoaAmt;
	}
	public void setNetQsoaAmt(BigDecimal netQsoaAmt) {
		this.netQsoaAmt = netQsoaAmt;
	}
	public BigDecimal getCumPayt() {
		return cumPayt;
	}
	public void setCumPayt(BigDecimal cumPayt) {
		this.cumPayt = cumPayt;
	}
	public BigDecimal getRemainingBal() {
		return remainingBal;
	}
	public void setRemainingBal(BigDecimal remainingBal) {
		this.remainingBal = remainingBal;
	}
	public String getProcessing() {
		return processing;
	}
	public void setProcessing(String processing) {
		this.processing = processing;
	}
	@Override
	public String toString() {
		return "AcitOsQsoa [qsoaId=" + qsoaId + ", quarterEnding=" + quarterEnding + ", currCd=" + currCd
				+ ", cedingId=" + cedingId + ", netQsoaAmt=" + netQsoaAmt + ", cumPayt=" + cumPayt + ", remainingBal="
				+ remainingBal + ", processing=" + processing + "]";
	}
}
