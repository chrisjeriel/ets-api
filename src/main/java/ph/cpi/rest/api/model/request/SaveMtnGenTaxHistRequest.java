package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnGenTaxHistRequest {
	
	private List<SaveMtnGenTaxHist> saveList;
	public List<SaveMtnGenTaxHist> getSaveList() {
		return saveList;
	}

	public void setSaveList(List<SaveMtnGenTaxHist> saveList) {
		this.saveList = saveList;
	}

	@Override
	public String toString() {
		return "SaveMtnGenTaxHistRequest [saveList=" + saveList + "]";
	}

}

class SaveMtnGenTaxHist {
	
	private String taxId;
	private String histNo;
	private String remarks;
	private String updateUser;
	private String updateDate;
	
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "SaveMtnGenTaxHist [taxId=" + taxId + ", histNo=" + histNo
				+ ", remarks=" + remarks + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
