package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

public class AcctServFeeTotals {

	private BigDecimal totalSfeeAmt;
	private BigDecimal mreSfeeAmt;
	private BigDecimal totalVatAmt;
	private BigDecimal totalWhTaxAmt;
	private BigDecimal totalDue;
	
	public BigDecimal getTotalSfeeAmt() {
		return totalSfeeAmt;
	}
	public void setTotalSfeeAmt(BigDecimal totalSfeeAmt) {
		this.totalSfeeAmt = totalSfeeAmt;
	}
	public BigDecimal getMreSfeeAmt() {
		return mreSfeeAmt;
	}
	public void setMreSfeeAmt(BigDecimal mreSfeeAmt) {
		this.mreSfeeAmt = mreSfeeAmt;
	}
	public BigDecimal getTotalVatAmt() {
		return totalVatAmt;
	}
	public void setTotalVatAmt(BigDecimal totalVatAmt) {
		this.totalVatAmt = totalVatAmt;
	}
	public BigDecimal getTotalWhTaxAmt() {
		return totalWhTaxAmt;
	}
	public void setTotalWhTaxAmt(BigDecimal totalWhTaxAmt) {
		this.totalWhTaxAmt = totalWhTaxAmt;
	}
	public BigDecimal getTotalDue() {
		return totalDue;
	}
	public void setTotalDue(BigDecimal totalDue) {
		this.totalDue = totalDue;
	}
	@Override
	public String toString() {
		return "AcctServFeeTotals [totalSfeeAmt=" + totalSfeeAmt + ", mreSfeeAmt=" + mreSfeeAmt + ", totalVatAmt="
				+ totalVatAmt + ", totalWhTaxAmt=" + totalWhTaxAmt + ", totalDue=" + totalDue + "]";
	}
}
