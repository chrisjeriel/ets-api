package ph.cpi.rest.api.model.claims;

import java.math.BigDecimal;

public class ClaimDistTreaty {
	private String treatyId;
	private String treatyAbbr;
	private String trtyCedId;
	private String cedingAbbr;
	private String retLayer;
	private BigDecimal clmPctShare;
	private BigDecimal clmAmt;
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
	public BigDecimal getClmAmt() {
		return clmAmt;
	}
	public void setClmAmt(BigDecimal clmAmt) {
		this.clmAmt = clmAmt;
	}
	@Override
	public String toString() {
		return "ClaimDistTreaty [treatyId=" + treatyId + ", treatyAbbr=" + treatyAbbr + ", trtyCedId=" + trtyCedId
				+ ", cedingAbbr=" + cedingAbbr + ", retLayer=" + retLayer + ", clmPctShare=" + clmPctShare + ", clmAmt="
				+ clmAmt + "]";
	}
	
}