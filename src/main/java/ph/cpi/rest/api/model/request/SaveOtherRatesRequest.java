package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;

import org.joda.time.LocalDateTime;

public class SaveOtherRatesRequest {
	
	private Integer quoteId;
	private Integer coverCd;
	private String coverCdDesc;
	private BigDecimal rate;
	private BigDecimal amount;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
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
	
	@Override
	public String toString() {
		return "SaveOtherRatesRequest [quoteId=" + quoteId + ", coverCd=" + coverCd + ", coverCdDesc=" + coverCdDesc
				+ ", rate=" + rate + ", amount=" + amount + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	

}
