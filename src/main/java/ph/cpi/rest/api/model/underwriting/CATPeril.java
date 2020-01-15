package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

@Alias("UnderwritingCATPeril")
public class CATPeril {
	private Integer	catPrlId;
	private String catPerilName;
	private BigDecimal pctShrPrm;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;

	public Integer getCatPrlId() {
		return catPrlId;
	}
	public void setCatPrlId(Integer catPrlId) {
		this.catPrlId = catPrlId;
	}
	
	public String getCatPerilName() {
		return catPerilName;
	}
	public void setCatPerilName(String catPerilName) {
		this.catPerilName = catPerilName;
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
		return "CATPeril [catPrlId=" + catPrlId + ", catPerilName=" + catPerilName + ", pctShrPrm=" + pctShrPrm
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}

	
	
	
}
