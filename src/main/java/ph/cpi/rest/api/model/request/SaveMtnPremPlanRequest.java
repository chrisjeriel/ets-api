package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnPremPlanRequest {
	
	private List<PremiumPlan> saveList;

	@Override
	public String toString() {
		return "SaveMtnPremPlanRequest [saveList=" + saveList + "]";
	}

	public List<PremiumPlan> getSaveList() {
		return saveList;
	}

	public void setSaveList(List<PremiumPlan> saveList) {
		this.saveList = saveList;
	}
	
	
	
}

class PremiumPlan{
	private String currencyCd;
	private String lineCd;
	private String planYear;
	private String planMm;
	private String premPlan;
	private String remarks;
	private String createUser;
	private String updateUser;
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getPlanYear() {
		return planYear;
	}
	public void setPlanYear(String planYear) {
		this.planYear = planYear;
	}
	public String getPlanMm() {
		return planMm;
	}
	public void setPlanMm(String planMm) {
		this.planMm = planMm;
	}
	public String getPremPlan() {
		return premPlan;
	}
	public void setPremPlan(String premPlan) {
		this.premPlan = premPlan;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	@Override
	public String toString() {
		return "PremiumPlan [currencyCd=" + currencyCd + ", lineCd=" + lineCd + ", planYear=" + planYear + ", planMm="
				+ planMm + ", premPlan=" + premPlan + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", updateUser=" + updateUser + "]";
	}
	
}