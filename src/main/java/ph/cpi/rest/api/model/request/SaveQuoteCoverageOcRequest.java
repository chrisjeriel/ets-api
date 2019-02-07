package ph.cpi.rest.api.model.request;

import org.joda.time.LocalDateTime;

public class SaveQuoteCoverageOcRequest {
	private Integer quote_id_oc;
	private Integer proj_id;
	private Integer risk_id;
	private Integer max_si;
	private String currency_cd;
	private Integer currency_rt;
	private Integer pct_share;
	private Integer pct_pml;
	private Integer total_value;
	private String create_user;
	private LocalDateTime create_date;
	private String update_user;
	private LocalDateTime update_date;
	public Integer getQuote_id_oc() {
		return quote_id_oc;
	}
	public void setQuote_id_oc(Integer quote_id_oc) {
		this.quote_id_oc = quote_id_oc;
	}
	public Integer getProj_id() {
		return proj_id;
	}
	public void setProj_id(Integer proj_id) {
		this.proj_id = proj_id;
	}
	public Integer getRisk_id() {
		return risk_id;
	}
	public void setRisk_id(Integer risk_id) {
		this.risk_id = risk_id;
	}
	public Integer getMax_si() {
		return max_si;
	}
	public void setMax_si(Integer max_si) {
		this.max_si = max_si;
	}
	public String getCurrency_cd() {
		return currency_cd;
	}
	public void setCurrency_cd(String currency_cd) {
		this.currency_cd = currency_cd;
	}
	public Integer getCurrency_rt() {
		return currency_rt;
	}
	public void setCurrency_rt(Integer currency_rt) {
		this.currency_rt = currency_rt;
	}
	public Integer getPct_share() {
		return pct_share;
	}
	public void setPct_share(Integer pct_share) {
		this.pct_share = pct_share;
	}
	public Integer getPct_pml() {
		return pct_pml;
	}
	public void setPct_pml(Integer pct_pml) {
		this.pct_pml = pct_pml;
	}
	public Integer getTotal_value() {
		return total_value;
	}
	public void setTotal_value(Integer total_value) {
		this.total_value = total_value;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public LocalDateTime getCreate_date() {
		return create_date;
	}
	public void setCreate_date(LocalDateTime create_date) {
		this.create_date = create_date;
	}
	public String getUpdate_user() {
		return update_user;
	}
	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}
	public LocalDateTime getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(LocalDateTime update_date) {
		this.update_date = update_date;
	}
	@Override
	public String toString() {
		return "SaveQuoteCoverageOcRequest [quote_id_oc=" + quote_id_oc + ", proj_id=" + proj_id + ", risk_id="
				+ risk_id + ", max_si=" + max_si + ", currency_cd=" + currency_cd + ", currency_rt=" + currency_rt
				+ ", pct_share=" + pct_share + ", pct_pml=" + pct_pml + ", total_value=" + total_value
				+ ", create_user=" + create_user + ", create_date=" + create_date + ", update_user=" + update_user
				+ ", update_date=" + update_date + "]";
	}
	
	

}
