package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveManualDistPoltRequest {
	private String distId;
	private String policyId;
	private String updateUser;
	private List<DistPolTreaty> saveList;
	
	public String getDistId() {
		return distId;
	}
	public void setDistId(String distId) {
		this.distId = distId;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public List<DistPolTreaty> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<DistPolTreaty> saveList) {
		this.saveList = saveList;
	}
	@Override
	public String toString() {
		return "SaveManualDistPoltRequest [distId=" + distId + ", policyId=" + policyId + ", updateUser=" + updateUser
				+ ", saveList=" + saveList + "]";
	}
}

class DistPolTreaty{
	private String treatyId;
	private String treatyAbbr;
	private String section;
	private String trtyCedId;
	private String trtyCedName;
	private String pctShare;
	private String siAmt;
	private String premAmt;
	private String commRt;
	private String commAmt;
	private String vatRiComm;
	private String netDue;
	private String retLayer;
	
	public String getRetLayer() {
		return retLayer;
	}
	public void setRetLayer(String retLayer) {
		this.retLayer = retLayer;
	}
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
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
	}
	public String getTrtyCedName() {
		return trtyCedName;
	}
	public void setTrtyCedName(String trtyCedName) {
		this.trtyCedName = trtyCedName;
	}
	public String getPctShare() {
		return pctShare;
	}
	public void setPctShare(String pctShare) {
		this.pctShare = pctShare;
	}
	public String getSiAmt() {
		return siAmt;
	}
	public void setSiAmt(String siAmt) {
		this.siAmt = siAmt;
	}
	public String getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(String premAmt) {
		this.premAmt = premAmt;
	}
	public String getCommRt() {
		return commRt;
	}
	public void setCommRt(String commRt) {
		this.commRt = commRt;
	}
	public String getCommAmt() {
		return commAmt;
	}
	public void setCommAmt(String commAmt) {
		this.commAmt = commAmt;
	}
	public String getVatRiComm() {
		return vatRiComm;
	}
	public void setVatRiComm(String vatRiComm) {
		this.vatRiComm = vatRiComm;
	}
	public String getNetDue() {
		return netDue;
	}
	public void setNetDue(String netDue) {
		this.netDue = netDue;
	}
	@Override
	public String toString() {
		return "DistPolTreaty [treatyId=" + treatyId + ", treatyAbbr=" + treatyAbbr + ", section=" + section
				+ ", trtyCedId=" + trtyCedId + ", trtyCedName=" + trtyCedName + ", pctShare=" + pctShare + ", siAmt="
				+ siAmt + ", premAmt=" + premAmt + ", commRt=" + commRt + ", commAmt=" + commAmt + ", vatRiComm="
				+ vatRiComm + ", netDue=" + netDue + ", retLayer=" + retLayer + "]";
	}
	
}