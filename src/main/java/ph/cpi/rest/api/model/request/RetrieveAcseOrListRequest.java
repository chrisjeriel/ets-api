package ph.cpi.rest.api.model.request;

public class RetrieveAcseOrListRequest {
	private String orType;
	private String orNo;
	private String payor;
	private String orDateFrom;
	private String orDateTo;
	private String tranTypeName;
	private String orStatDesc;
	private String particulars;
	private String orAmtFrom;
	private String orAmtTo;
	private String tranStat;
	private String orStat;
	
	public String getOrType() {
		return orType;
	}
	public void setOrType(String orType) {
		this.orType = orType;
	}
	public String getOrNo() {
		return orNo;
	}
	public void setOrNo(String orNo) {
		this.orNo = orNo;
	}
	public String getPayor() {
		return payor;
	}
	public void setPayor(String payor) {
		this.payor = payor;
	}
	public String getOrDateFrom() {
		return orDateFrom;
	}
	public void setOrDateFrom(String orDateFrom) {
		this.orDateFrom = orDateFrom;
	}
	public String getOrDateTo() {
		return orDateTo;
	}
	public void setOrDateTo(String orDateTo) {
		this.orDateTo = orDateTo;
	}
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}
	public String getOrStatDesc() {
		return orStatDesc;
	}
	public void setOrStatDesc(String orStatDesc) {
		this.orStatDesc = orStatDesc;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getOrAmtFrom() {
		return orAmtFrom;
	}
	public void setOrAmtFrom(String orAmtFrom) {
		this.orAmtFrom = orAmtFrom;
	}
	public String getOrAmtTo() {
		return orAmtTo;
	}
	public void setOrAmtTo(String orAmtTo) {
		this.orAmtTo = orAmtTo;
	}
	public String getTranStat() {
		return tranStat;
	}
	public void setTranStat(String tranStat) {
		this.tranStat = tranStat;
	}
	public String getOrStat() {
		return orStat;
	}
	public void setOrStat(String orStat) {
		this.orStat = orStat;
	}
	@Override
	public String toString() {
		return "RetrieveAcseOrListRequest [orType=" + orType + ", orNo=" + orNo + ", payor=" + payor + ", orDateFrom="
				+ orDateFrom + ", orDateTo=" + orDateTo + ", tranTypeName=" + tranTypeName + ", orStatDesc="
				+ orStatDesc + ", particulars=" + particulars + ", orAmtFrom=" + orAmtFrom + ", orAmtTo=" + orAmtTo
				+ ", tranStat=" + tranStat + ", orStat=" + orStat + "]";
	}
}
