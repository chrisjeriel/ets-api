package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class CATPeril {
	
	private Integer	policyId;
	private String  policyNo;
	private Integer	catPrlId;
	private Integer pctShrPrm;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;

	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public Integer getCatPrlId() {
		return catPrlId;
	}
	public void setCatPrlId(Integer catPrlId) {
		this.catPrlId = catPrlId;
	}
	public Integer getPctShrPrm() {
		return pctShrPrm;
	}
	public void setPctShrPrm(Integer pctShrPrm) {
		this.pctShrPrm = pctShrPrm;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "CATPeril [policyId=" + policyId + ", policyNo=" + policyNo + ", catPrlId=" + catPrlId + ", pctShrPrm="
				+ pctShrPrm + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}
