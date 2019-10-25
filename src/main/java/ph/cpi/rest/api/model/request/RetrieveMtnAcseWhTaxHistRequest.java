package ph.cpi.rest.api.model.request;

public class RetrieveMtnAcseWhTaxHistRequest {
	private Integer whTaxId;
	private Integer histNo;
	private String taxCd;
	public Integer getWhTaxId() {
		return whTaxId;
	}
	public void setWhTaxId(Integer whTaxId) {
		this.whTaxId = whTaxId;
	}
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public String getTaxCd() {
		return taxCd;
	}
	public void setTaxCd(String taxCd) {
		this.taxCd = taxCd;
	}
	@Override
	public String toString() {
		return "RetrieveMtnAcseWhTaxHistRequest [whTaxId=" + whTaxId + ", histNo=" + histNo + ", taxCd=" + taxCd + "]";
	}
	
}
