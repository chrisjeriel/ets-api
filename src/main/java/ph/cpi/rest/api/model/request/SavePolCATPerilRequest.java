package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SavePolCATPerilRequest {
	
	private Integer policyId;
	private List<CATPeril> saveCATPerilList;
	
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public List<CATPeril> getSaveCATPerilList() {
		return saveCATPerilList;
	}
	public void setSaveCATPerilList(List<CATPeril> saveCATPerilList) {
		this.saveCATPerilList = saveCATPerilList;
	}
	@Override
	public String toString() {
		return "SavePolCATPerilRequest [policyId=" + policyId + ", saveCATPerilList=" + saveCATPerilList + "]";
	}
	
}

@Alias("SavePolCATPeril")
class CATPeril {
	private Integer	catPrlId;
	private BigDecimal pctShrPrm;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
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
		return "CATPeril [catPrlId=" + catPrlId + ", pctShrPrm=" + pctShrPrm + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}