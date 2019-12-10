package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcseDcbCollectionRequest {
	private List<serviceDcbNo> updateDcb;

	public List<serviceDcbNo> getUpdateDcb() {
		return updateDcb;
	}
	public void setUpdateDcb(List<serviceDcbNo> updateDcb) {
		this.updateDcb = updateDcb;
	}
	@Override
	public String toString() {
		return "SaveAcseDcbCollectionRequest [updateDcb=" + updateDcb + "]";
	}
}


class serviceDcbNo{
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
		return "acseDcbNo [dcbStat=" + dcbStat + ", dcbYear=" + dcbYear + ", dcbNo=" + dcbNo + ", updateUser="
				+ updateUser + "]";
	}
	
}
