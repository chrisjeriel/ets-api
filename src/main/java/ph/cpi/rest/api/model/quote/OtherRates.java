package ph.cpi.rest.api.model.quote;

import org.joda.time.LocalDateTime;
import java.math.BigDecimal;


public class OtherRates {
	private Integer coverCd;
	private String coverCdDesc;
	private Integer rateI; //Must be removed and remapped in XML
	private Integer amountI; //Must be removed and remapped in XML
	private BigDecimal rate;
	private BigDecimal amount;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	public Integer getCoverCd() {
		return coverCd;
	}
	public void setCoverCd(Integer coverCd) {
		this.coverCd = coverCd;
	}
	public String getCoverCdDesc() {
		return coverCdDesc;
	}
	public void setCoverCdDesc(String coverCdDesc) {
		this.coverCdDesc = coverCdDesc;
	}
	public Integer getRateI() {
		return rateI;
	}
	public void setRateI(Integer rateI) {
		this.rateI = rateI;
	}
	public Integer getAmountI() {
		return amountI;
	}
	public void setAmountI(Integer amountI) {
		this.amountI = amountI;
	}
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	
	
}