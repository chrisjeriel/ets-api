package ph.cpi.rest.api.model.request;

public class SaveQuoteEndorsementsOcRequest {
	private String quoteIdOc;
	private String endtCd;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getQuoteIdOc() {
		return quoteIdOc;
	}
	public void setQuoteIdOc(String quoteIdOc) {
		this.quoteIdOc = quoteIdOc;
	}
	public String getEndtCd() {
		return endtCd;
	}
	public void setEndtCd(String endtCd) {
		this.endtCd = endtCd;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
		StringBuilder builder = new StringBuilder();
		builder.append("SaveQuoteEndorsementsOcRequest [quoteIdOc=");
		builder.append(quoteIdOc);
		builder.append(", endtCd=");
		builder.append(endtCd);
		builder.append(", remarks=");
		builder.append(remarks);
		builder.append(", createUser=");
		builder.append(createUser);
		builder.append(", createDate=");
		builder.append(createDate);
		builder.append(", updateUser=");
		builder.append(updateUser);
		builder.append(", updateDate=");
		builder.append(updateDate);
		builder.append("]");
		return builder.toString();
	}
}
