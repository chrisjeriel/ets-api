package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitJVInvestmentOffset {
	private Integer tranId;
	private Integer quarterNo;
	private String cedingId;
	private String cedingName;
	private DateTime quarterEnding;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal balanceAmt;
	private BigDecimal localAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
}
