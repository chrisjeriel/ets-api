package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

public class AcitUPRPerLine {
	private String lineCd;
	private BigDecimal premGross;
	private BigDecimal defPremGross;
	private BigDecimal prevDefPremGross;
	private BigDecimal defDiff;
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public BigDecimal getPremGross() {
		return premGross;
	}
	public void setPremGross(BigDecimal premGross) {
		this.premGross = premGross;
	}
	public BigDecimal getDefPremGross() {
		return defPremGross;
	}
	public void setDefPremGross(BigDecimal defPremGross) {
		this.defPremGross = defPremGross;
	}
	public BigDecimal getPrevDefPremGross() {
		return prevDefPremGross;
	}
	public void setPrevDefPremGross(BigDecimal prevDefPremGross) {
		this.prevDefPremGross = prevDefPremGross;
	}
	public BigDecimal getDefDiff() {
		return defDiff;
	}
	public void setDefDiff(BigDecimal defDiff) {
		this.defDiff = defDiff;
	}
	@Override
	public String toString() {
		return "AcitUPRPerLine [lineCd=" + lineCd + ", premGross=" + premGross + ", defPremGross=" + defPremGross
				+ ", prevDefPremGross=" + prevDefPremGross + ", defDiff=" + defDiff + "]";
	}
}
