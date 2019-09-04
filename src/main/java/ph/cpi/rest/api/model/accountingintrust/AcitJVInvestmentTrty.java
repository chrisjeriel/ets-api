package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitJVInvestmentTrty {
	private Integer tranId;
	private Integer quarterNo;
	private Integer itemNo;
	private Integer invtId;
	private String invtCode;
	private String certNo;
	private String invtType;
	private String invtTypeDesc;
	private Integer invtSecCd;
	private String securityDesc;
	private Integer maturityPeriod;
	private String durationUnit;
	private BigDecimal interestRate;
	private DateTime purchasedDate;
	private DateTime maturityDate;
	private String pulloutType;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal invtAmt;
	private BigDecimal incomeAmt;
	private BigDecimal bankCharge;
	private BigDecimal whtaxAmt;
	private BigDecimal maturityValue;
	private BigDecimal localAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
}
