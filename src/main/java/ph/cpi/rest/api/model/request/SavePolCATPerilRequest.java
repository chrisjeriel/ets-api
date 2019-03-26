package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;

public class SavePolCATPerilRequest {
	
	private Integer policyId;
	private Integer catPerilId;
	private BigDecimal pctSharePrem;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public Integer getCatPerilId() {
		return catPerilId;
	}
	public void setCatPerilId(Integer catPerilId) {
		this.catPerilId = catPerilId;
	}
	public BigDecimal getPctSharePrem() {
		return pctSharePrem;
	}
	public void setPctSharePrem(BigDecimal pctSharePrem) {
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
		return "SavePolCATPerilRequest [policyId=" + policyId + ", catPerilId=" + catPerilId + ", pctSharePrem="
				+ pctSharePrem + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}

}
