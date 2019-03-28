package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;
import org.joda.time.LocalDateTime;

@Alias("UnderwritingCATPeril")
public class CATPeril {
	private Integer	catPrlId;
	private BigDecimal pctShrPrm;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;

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
		return "CATPeril [catPrlId=" + catPrlId + ", pctShrPrm=" + pctShrPrm + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}
