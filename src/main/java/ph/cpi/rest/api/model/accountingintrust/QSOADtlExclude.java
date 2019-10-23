package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

public class QSOADtlExclude {

	private Integer qsoaId;
	private String particulars;
	private BigDecimal dtlAmt;
	
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public BigDecimal getDtlAmt() {
		return dtlAmt;
	}
	public void setDtlAmt(BigDecimal dtlAmt) {
		this.dtlAmt = dtlAmt;
	}
	@Override
	public String toString() {
		return "QSOADtlExclude [qsoaId=" + qsoaId + ", particulars=" + particulars + ", dtlAmt=" + dtlAmt + "]";
	}
}
