package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveManualDistRiskTreatyRequest {
	private String riskDistId;
	private String altNo;
	private String updateUser;
	private List<DistRiskTreaty> saveList;
	public String getRiskDistId() {
		return riskDistId;
	}
	public void setRiskDistId(String riskDistId) {
		this.riskDistId = riskDistId;
	}
	public String getAltNo() {
		return altNo;
	}
	public void setAltNo(String altNo) {
		this.altNo = altNo;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public List<DistRiskTreaty> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<DistRiskTreaty> saveList) {
		this.saveList = saveList;
	}
	@Override
	public String toString() {
		return "SaveManualDistRiskTreatyRequest [riskDistId=" + riskDistId + ", altNo=" + altNo + ", updateUser="
				+ updateUser + ", saveList=" + saveList + "]";
	}
	
}

class DistRiskTreaty{
	private String treatyId;
	private String trtyCedId;
	private String retLayer;
	private String siAmt;
	private String premAmt;
	public String getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(String treatyId) {
		this.treatyId = treatyId;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
	}
	public String getRetLayer() {
		return retLayer;
	}
	public void setRetLayer(String retLayer) {
		this.retLayer = retLayer;
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
	@Override
	public String toString() {
		return "DistRiskTreaty [treatyId=" + treatyId + ", trtyCedId=" + trtyCedId + ", retLayer=" + retLayer
				+ ", siAmt=" + siAmt + ", premAmt=" + premAmt + "]";
	}
	
}
