package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitCvPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitInvestments;
import ph.cpi.rest.api.model.accountingintrust.AcitPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommSumm;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommDtl;

public interface AccountingInTrustDao {
	public List<AcitCvPaytReq> retrieveAcitCvPaytReqList(final HashMap<String, Object> params ) throws SQLException;
	public List<AcitPaytReq> retrieveAcitPaytReq(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitPaytReq(final HashMap<String, Object> params) throws SQLException;
	public List<AcitProfCommSumm> retrieveProfCommSumm(final HashMap<String, Object> params ) throws SQLException;
	public List<AcitProfCommDtl> retrieveProfCommDtl(final HashMap<String, Object> params ) throws SQLException;
	public List<AcitInvestments> retrieveInvestmentList(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveAcitInvestments(final HashMap<String, Object> params) throws SQLException;
}
