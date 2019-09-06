package ph.cpi.rest.api.model.claims;

import java.math.BigDecimal;

public class ClaimReserveDistTreaty {
	private String treatyId;
	private String treatyAbbr;
	private String trtyCedId;
	private String cedingAbbr;
	private String retLayer;
	private BigDecimal clmPctShare;
	private BigDecimal reserveAmt;
	private BigDecimal paytAmt;
	public String getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(String treatyId) {
		this.treatyId = treatyId;
	}
	public String getTreatyAbbr() {
		return treatyAbbr;
	}
	public void setTreatyAbbr(String treatyAbbr) {
		this.treatyAbbr = treatyAbbr;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
	}
	public String getCedingAbbr() {
		return cedingAbbr;
	}
	public void setCedingAbbr(String cedingAbbr) {
		this.cedingAbbr = cedingAbbr;
	}
	public String getRetLayer() {
		return retLayer;
	}
	public void setRetLayer(String retLayer) {
		this.retLayer = retLayer;
	}
	public BigDecimal getClmPctShare() {
		return clmPctShare;
	}
	public void setClmPctShare(BigDecimal clmPctShare) {
		this.clmPctShare = clmPctShare;
	}
	public BigDecimal getReserveAmt() {
		return reserveAmt;
	}
	public void setReserveAmt(BigDecimal reserveAmt) {
		this.reserveAmt = reserveAmt;
	}
	public BigDecimal getPaytAmt() {
		return paytAmt;
	}
	public void setPaytAmt(BigDecimal paytAmt) {
		this.paytAmt = paytAmt;
	}
	@Override
	public String toString() {
		return "ClaimReserveDistTreaty [treatyId=" + treatyId + ", treatyAbbr=" + treatyAbbr + ", trtyCedId="
				+ trtyCedId + ", cedingAbbr=" + cedingAbbr + ", retLayer=" + retLayer + ", clmPctShare=" + clmPctShare
				+ ", reserveAmt=" + reserveAmt + ", paytAmt=" + paytAmt + "]";
	}
}
