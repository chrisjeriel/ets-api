package ph.cpi.rest.api.model.utils;

public class ACITR066D {
	private String grpNo;
	private String itemNo;
	private String itemName;
	private String cedingId;
	private String cedingName;
	private String currGrandTotal;
	private String prevGrandTotal;
	private String planAmt;
	private String incDecPct;
	private String paramDate;
	private String paramCurrency;
	
	public String getGrpNo() {
		return grpNo;
	}
	public void setGrpNo(String grpNo) {
		this.grpNo = grpNo;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
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
	public String getCurrGrandTotal() {
		return currGrandTotal;
	}
	public void setCurrGrandTotal(String currGrandTotal) {
		this.currGrandTotal = currGrandTotal;
	}
	public String getPrevGrandTotal() {
		return prevGrandTotal;
	}
	public void setPrevGrandTotal(String prevGrandTotal) {
		this.prevGrandTotal = prevGrandTotal;
	}
	public String getPlanAmt() {
		return planAmt;
	}
	public void setPlanAmt(String planAmt) {
		this.planAmt = planAmt;
	}
	public String getIncDecPct() {
		return incDecPct;
	}
	public void setIncDecPct(String incDecPct) {
		this.incDecPct = incDecPct;
	}
	public String getParamDate() {
		return paramDate;
	}
	public void setParamDate(String paramDate) {
		this.paramDate = paramDate;
	}
	public String getParamCurrency() {
		return paramCurrency;
	}
	public void setParamCurrency(String paramCurrency) {
		this.paramCurrency = paramCurrency;
	}
	@Override
	public String toString() {
		return "ACITR066D [grpNo=" + grpNo + ", itemNo=" + itemNo + ", itemName=" + itemName + ", cedingId=" + cedingId
				+ ", cedingName=" + cedingName + ", currGrandTotal=" + currGrandTotal + ", prevGrandTotal="
				+ prevGrandTotal + ", planAmt=" + planAmt + ", incDecPct=" + incDecPct + ", paramDate=" + paramDate
				+ ", paramCurrency=" + paramCurrency + "]";
	}
}
