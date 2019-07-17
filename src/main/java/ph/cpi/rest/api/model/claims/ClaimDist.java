package ph.cpi.rest.api.model.claims;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class ClaimDist {
	private Integer clmDistNo;
	private Integer histNo;
	private String histCategory;
	private String histType;
	private BigDecimal reserveAmt;
	private BigDecimal paytAmt;
	private String clmDistStat;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	private List<ClaimDistTreaty> claimDistTreaty;
	public Integer getClmDistNo() {
		return clmDistNo;
	}
	public void setClmDistNo(Integer clmDistNo) {
		this.clmDistNo = clmDistNo;
	}
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public String getHistCategory() {
		return histCategory;
	}
	public void setHistCategory(String histCategory) {
		this.histCategory = histCategory;
	}
	public String getHistType() {
		return histType;
	}
	public void setHistType(String histType) {
		this.histType = histType;
	}
	public BigDecimal getReserveAmt() {
		return reserveAmt;
	}
	public void setReserveAmt(BigDecimal reserveAmt) {
		this.reserveAmt = reserveAmt;
	}
	public BigDecimal getPaytAmt() {
		return paytAmt;
	}
	public void setPaytAmt(BigDecimal paytAmt) {
		this.paytAmt = paytAmt;
	}
	public String getClmDistStat() {
		return clmDistStat;
	}
	public void setClmDistStat(String clmDistStat) {
		this.clmDistStat = clmDistStat;
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
	public List<ClaimDistTreaty> getClaimDistTreaty() {
		return claimDistTreaty;
	}
	public void setClaimDistTreaty(List<ClaimDistTreaty> claimDistTreaty) {
		this.claimDistTreaty = claimDistTreaty;
	}
	@Override
	public String toString() {
		return "ClaimDist [clmDistNo=" + clmDistNo + ", histNo=" + histNo + ", histCategory=" + histCategory
				+ ", histType=" + histType + ", reserveAmt=" + reserveAmt + ", paytAmt=" + paytAmt + ", clmDistStat="
				+ clmDistStat + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + ", claimDistTreaty=" + claimDistTreaty + "]";
	}
	
}
