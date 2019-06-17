package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveExpCatPerilRequest {
	private List<ExpCatPerils> expcatPeril;

	public List<ExpCatPerils> getExpcatPeril() {
		return expcatPeril;
	}

	public void setExpcatPeril(List<ExpCatPerils> expcatPeril) {
		this.expcatPeril = expcatPeril;
	}

	@Override
	public String toString() {
		return "SaveExpCatPerilRequest [expcatPeril=" + expcatPeril + "]";
	}
	
}

class ExpCatPerils {
	private String policyId;
	private String catPerilId;
	private String pctSharePrem;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getCatPerilId() {
		return catPerilId;
	}
	public void setCatPerilId(String catPerilId) {
		this.catPerilId = catPerilId;
	}
	public String getPctSharePrem() {
		return pctSharePrem;
	}
	public void setPctSharePrem(String pctSharePrem) {
		this.pctSharePrem = pctSharePrem;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
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
		return "ExpCatPerils [policyId=" + policyId + ", catPerilId=" + catPerilId + ", pctSharePrem=" + pctSharePrem
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}
