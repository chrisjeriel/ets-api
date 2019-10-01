package ph.cpi.rest.api.model.request;

public class RetrieveMtnWhTaxRequest {
	private String taxCd;
	private String taxName;
	private String taxType;
	private String creditableTag;
	private String fixedTag;
	private String activeTag;
	public String getTaxCd() {
		return taxCd;
	}
	public void setTaxCd(String taxCd) {
		this.taxCd = taxCd;
	}
	public String getTaxName() {
		return taxName;
	}
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getCreditableTag() {
		return creditableTag;
	}
	public void setCreditableTag(String creditableTag) {
		this.creditableTag = creditableTag;
	}
	public String getFixedTag() {
		return fixedTag;
	}
	public void setFixedTag(String fixedTag) {
		this.fixedTag = fixedTag;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	@Override
	public String toString() {
		return "RetrieveMtnWhTaxRequest [taxCd=" + taxCd + ", taxName=" + taxName + ", taxType=" + taxType
				+ ", creditableTag=" + creditableTag + ", fixedTag=" + fixedTag + ", activeTag=" + activeTag + "]";
	}
}
