package ph.cpi.rest.api.model.quote;

public class Quotation {
	private Integer quoteId;
	private String quotationNo;
	private String cedingName;
	private String insuredDesc;
	private Project project;
	private HoldCover holdCover;
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public HoldCover getHoldCover() {
		return holdCover;
	}
	public void setHoldCover(HoldCover holdCover) {
		this.holdCover = holdCover;
	}
	@Override
	public String toString() {
		return "Quotation [quoteId=" + quoteId + ", quotationNo=" + quotationNo + ", cedingName=" + cedingName
				+ ", insuredDesc=" + insuredDesc + ", project=" + project + ", holdCover=" + holdCover + "]";
	}
}
