package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;

import org.joda.time.LocalDateTime;

public class CATPeril {
	
	private Integer	policyId;
	private String  policyNo;
	private Integer	catPrlId;
	private BigDecimal pctShrPrm;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;

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
	public BigDecimal getPctShrPrm() {
		return pctShrPrm;
	}
	public void setPctShrPrm(BigDecimal pctShrPrm) {
		this.pctShrPrm = pctShrPrm;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "CATPeril [policyId=" + policyId + ", policyNo=" + policyNo + ", catPrlId=" + catPrlId + ", pctShrPrm="
				+ pctShrPrm + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}
