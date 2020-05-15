package ph.cpi.rest.api.model.request;

public class RetrieveAcitQsoaPrintRequest {

	private String treatyTag;
	private String cedingId;
	private String currCd;
	private Integer fromQtr;
	private Integer fromYear;
	private Integer toQtr;
	private Integer toYear;
	
	
	public String getTreatyTag() {
		return treatyTag;
	}
	public void setTreatyTag(String treatyTag) {
		this.treatyTag = treatyTag;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public Integer getFromQtr() {
		return fromQtr;
	}
	public void setFromQtr(Integer fromQtr) {
		this.fromQtr = fromQtr;
	}
	public Integer getFromYear() {
		return fromYear;
	}
	public void setFromYear(Integer fromYear) {
		this.fromYear = fromYear;
	}
	public Integer getToQtr() {
		return toQtr;
	}
	public void setToQtr(Integer toQtr) {
		this.toQtr = toQtr;
	}
	public Integer getToYear() {
		return toYear;
	}
	public void setToYear(Integer toYear) {
		this.toYear = toYear;
	}
	@Override
	public String toString() {
		return "RetrieveAcitQsoaPrintRequest [treatyTag=" + treatyTag + ", cedingId=" + cedingId + ", currCd=" + currCd
				+ ", fromQtr=" + fromQtr + ", fromYear=" + fromYear + ", toQtr=" + toQtr + ", toYear=" + toYear + "]";
	}
}
