package ph.cpi.rest.api.model.accountingintrust;

import org.joda.time.DateTime;

public class QSOAPrint {

	private Integer qsoaId;
	private String currCd;
	private String cedingId;
	private String cedingAbbr;
	private String cedingName;
	private String treatyTag;
	private DateTime quarterEnding;
	
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
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
	public String getCedingAbbr() {
		return cedingAbbr;
	}
	public void setCedingAbbr(String cedingAbbr) {
		this.cedingAbbr = cedingAbbr;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getTreatyTag() {
		return treatyTag;
	}
	public void setTreatyTag(String treatyTag) {
		this.treatyTag = treatyTag;
	}
	public DateTime getQuarterEnding() {
		return quarterEnding;
	}
	public void setQuarterEnding(DateTime quarterEnding) {
		this.quarterEnding = quarterEnding;
	}
	@Override
	public String toString() {
		return "QSOAPrint [qsoaId=" + qsoaId + ", currCd=" + currCd + ", cedingId=" + cedingId + ", cedingAbbr="
				+ cedingAbbr + ", cedingName=" + cedingName + ", treatyTag=" + treatyTag + ", quarterEnding="
				+ quarterEnding + "]";
	}
}
