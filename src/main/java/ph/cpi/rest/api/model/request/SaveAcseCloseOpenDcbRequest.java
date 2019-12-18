package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcseCloseOpenDcbRequest {
	private List<closeOpenDcbColl> saveDcb;

	public List<closeOpenDcbColl> getSaveDcb() {
		return saveDcb;
	}

	public void setSaveDcb(List<closeOpenDcbColl> saveDcb) {
		this.saveDcb = saveDcb;
	}

	@Override
	public String toString() {
		return "SaveAcseCloseOpenDcbRequest [saveDcb=" + saveDcb + "]";
	}
}


class closeOpenDcbColl{
	private String remarks;
	private Integer dcbYear;
	private Integer dcbNo;
	private String updateUser;
	
	
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
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}