package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcitDcbCollectionRequest {
	
	private List<dcbNo> updateDcb;

	public List<dcbNo> getUpdateDcb() {
		return updateDcb;
	}

	public void setUpdateDcb(List<dcbNo> updateDcb) {
		this.updateDcb = updateDcb;
	}

	@Override
	public String toString() {
		return "SaveAcitDcbCollectionRequest [updateDcb=" + updateDcb + "]";
	}
}

class dcbNo{
	private String dcbStat;
	private Integer dcbYear;
	private Integer dcbNo;
	private String updateUser;
	public String getDcbStat() {
		return dcbStat;
	}
	public void setDcbStat(String dcbStat) {
		this.dcbStat = dcbStat;
	}
	public Integer getDcbYear() {
		return dcbYear;
	}
	public void setDcbYear(Integer dcbYear) {
		this.dcbYear = dcbYear;
	}
	public Integer getDcbNo() {
		return dcbNo;
	}
	public void setDcbNo(Integer dcbNo) {
		this.dcbNo = dcbNo;
	}
	
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	@Override
	public String toString() {
		return "dcbNo [dcbStat=" + dcbStat + ", dcbYear=" + dcbYear + ", dcbNo=" + dcbNo + ", updateUser=" + updateUser
				+ "]";
	}
	
}
