package ph.cpi.rest.api.model.claims;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class ClaimReserve {
	private Integer  claimId;
	private Integer  projId;
	private Integer  lossResAmt;
	private Integer  lossPdAmt;
	private String 	 lossStatCd;
	private String 	 lossStatus;
	private Integer  expResAmt;
	private Integer  expPdAmt;
	private String 	 expStatCd;
	private String 	 expStatus;
	private BigDecimal totalReserve;
	private BigDecimal totalPayment;
	private String 	 createUser;
	private DateTime createDate;
	private String 	 updateUser;
	private DateTime updateDate;
	private List<ClaimHistory> clmHistory;
	
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public Integer getLossResAmt() {
		return lossResAmt;
	}
	public void setLossResAmt(Integer lossResAmt) {
		this.lossResAmt = lossResAmt;
	}
	public Integer getLossPdAmt() {
		return lossPdAmt;
	}
	public void setLossPdAmt(Integer lossPdAmt) {
		this.lossPdAmt = lossPdAmt;
	}
	public String getLossStatCd() {
		return lossStatCd;
	}
	public void setLossStatCd(String lossStatCd) {
		this.lossStatCd = lossStatCd;
	}
	public String getLossStatus() {
		return lossStatus;
	}
	public void setLossStatus(String lossStatus) {
		this.lossStatus = lossStatus;
	}
	public Integer getExpResAmt() {
		return expResAmt;
	}
	public void setExpResAmt(Integer expResAmt) {
		this.expResAmt = expResAmt;
	}
	public Integer getExpPdAmt() {
		return expPdAmt;
	}
	public void setExpPdAmt(Integer expPdAmt) {
		this.expPdAmt = expPdAmt;
	}
	public String getExpStatCd() {
		return expStatCd;
	}
	public void setExpStatCd(String expStatCd) {
		this.expStatCd = expStatCd;
	}
	public String getExpStatus() {
		return expStatus;
	}
	public void setExpStatus(String expStatus) {
		this.expStatus = expStatus;
	}
	public BigDecimal getTotalReserve() {
		return totalReserve;
	}
	public void setTotalReserve(BigDecimal totalReserve) {
		this.totalReserve = totalReserve;
	}
	public BigDecimal getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(BigDecimal totalPayment) {
		this.totalPayment = totalPayment;
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
	public List<ClaimHistory> getClmHistory() {
		return clmHistory;
	}
	public void setClmHistory(List<ClaimHistory> clmHistory) {
		this.clmHistory = clmHistory;
	}
	@Override
	public String toString() {
		return "ClaimReserve [claimId=" + claimId + ", projId=" + projId + ", lossResAmt=" + lossResAmt + ", lossPdAmt="
				+ lossPdAmt + ", lossStatCd=" + lossStatCd + ", lossStatus=" + lossStatus + ", expResAmt=" + expResAmt
				+ ", expPdAmt=" + expPdAmt + ", expStatCd=" + expStatCd + ", expStatus=" + expStatus + ", totalReserve="
				+ totalReserve + ", totalPayment=" + totalPayment + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", clmHistory="
				+ clmHistory + "]";
	}
}