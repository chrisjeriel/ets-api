package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;
import org.joda.time.LocalDateTime;

public class SaveQuoteOtherRatesRequest {
	
	private Integer quoteId;
	private List<OtherRates> otherRates;
	private List<OtherRates> deleteOtherRates;
	
	public Integer getQuoteId() {
		return quoteId;
	}
	
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public List<OtherRates> getOtherRates() {
		return otherRates;
	}
	public void setOtherRates(List<OtherRates> otherRates) {
		this.otherRates = otherRates;
	}
	
	public List<OtherRates> getDeleteOtherRates() {
		return deleteOtherRates;
	}

	public void setDeleteOtherRates(List<OtherRates> deleteOtherRates) {
		this.deleteOtherRates = deleteOtherRates;
	}
	
	@Override
	public String toString() {
		return "SaveQuoteOtherRatesRequest [quoteId=" + quoteId + ", otherRates=" + otherRates + ", deleteOtherRates="
				+ deleteOtherRates + "]";
	}
}

@Alias("SaveQuoteOtherRates")

class OtherRates {
	
	private Integer coverCd;
	private BigDecimal rate;
	private BigDecimal amount;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getCoverCd() {
		return coverCd;
	}
	public void setCoverCd(Integer coverCd) {
		this.coverCd = coverCd;
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
		return "OtherRates [coverCd=" + coverCd + ", rate=" + rate + ", amount=" + amount + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}

}

