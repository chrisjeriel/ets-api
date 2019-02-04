package ph.cpi.rest.api.model.quote;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.LocalDateTime;

public class Options {
	private Integer optionId;
	private Integer optionRt; //Must be removed and remapped in XML
	private BigDecimal optioRt;
	private String condition;
	private Integer commRtQuotaI; //Must be removed and remapped in XML
	private BigDecimal commRtQuota;
	private Integer commRtSurplusI; //Must be removed and remapped in XML
	private BigDecimal commRtSurplus;
	private Integer commRtFacI; //Must be removed and remapped in XML
	private BigDecimal commRtFac;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	private Deductibles deductibles;
	
	private List<Deductibles> deductiblesList;
	private List<Endorsments> endorsments;
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}
	public Integer getOptionRt() {
		return optionRt;
	}
	public void setOptionRt(Integer optionRt) {
		this.optionRt = optionRt;
	}
	public BigDecimal getOptioRt() {
		return optioRt;
	}
	public void setOptioRt(BigDecimal optioRt) {
		this.optioRt = optioRt;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public Integer getCommRtQuotaI() {
		return commRtQuotaI;
	}
	public void setCommRtQuotaI(Integer commRtQuotaI) {
		this.commRtQuotaI = commRtQuotaI;
	}
	public BigDecimal getCommRtQuota() {
		return commRtQuota;
	}
	public void setCommRtQuota(BigDecimal commRtQuota) {
		this.commRtQuota = commRtQuota;
	}
	public Integer getCommRtSurplusI() {
		return commRtSurplusI;
	}
	public void setCommRtSurplusI(Integer commRtSurplusI) {
		this.commRtSurplusI = commRtSurplusI;
	}
	public BigDecimal getCommRtSurplus() {
		return commRtSurplus;
	}
	public void setCommRtSurplus(BigDecimal commRtSurplus) {
		this.commRtSurplus = commRtSurplus;
	}
	public Integer getCommRtFacI() {
		return commRtFacI;
	}
	public void setCommRtFacI(Integer commRtFacI) {
		this.commRtFacI = commRtFacI;
	}
	public BigDecimal getCommRtFac() {
		return commRtFac;
	}
	public void setCommRtFac(BigDecimal commRtFac) {
		this.commRtFac = commRtFac;
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
	public Deductibles getDeductibles() {
		return deductibles;
	}
	public void setDeductibles(Deductibles deductibles) {
		this.deductibles = deductibles;
	}
	public List<Deductibles> getDeductiblesList() {
		return deductiblesList;
	}
	public void setDeductiblesList(List<Deductibles> deductiblesList) {
		this.deductiblesList = deductiblesList;
	}
	public List<Endorsments> getEndorsments() {
		return endorsments;
	}
	public void setEndorsments(List<Endorsments> endorsments) {
		this.endorsments = endorsments;
	}
	
	
	
}
