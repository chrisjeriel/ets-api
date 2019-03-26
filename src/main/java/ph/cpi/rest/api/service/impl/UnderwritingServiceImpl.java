package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.request.RetrievePolCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.SavePolCoverageRequest;
import ph.cpi.rest.api.model.response.RetrievePolCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.SavePolCoverageResponse;
import ph.cpi.rest.api.model.response.SaveQuoteCoverageResponse;
import ph.cpi.rest.api.service.UnderwritingService;

@Component
public class UnderwritingServiceImpl implements UnderwritingService {
	@Autowired
	UnderwritingDao underwritingDao;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);
	
	@Override
	public RetrievePolicyDeductiblesResponse retrievePolicyDeductibles(RetrievePolicyDeductiblesRequest rpdr)
			throws SQLException {
		RetrievePolicyDeductiblesResponse rpdResponse = new RetrievePolicyDeductiblesResponse();
		HashMap<String, Object> retrievePolDeductiblesParams = new HashMap<String, Object>();
		retrievePolDeductiblesParams.put("policyId", rpdr.getPolicyId());
		retrievePolDeductiblesParams.put("policyNo", rpdr.getPolicyNo());
		retrievePolDeductiblesParams.put("coverCd", rpdr.getCoverCd());
		retrievePolDeductiblesParams.put("endtCd", rpdr.getEndtCd());
		rpdResponse.setPolicy(underwritingDao.retrievePolicyDeductibles(retrievePolDeductiblesParams));
		
		logger.info("retrievePolicyDeductiblesResponse : " + rpdResponse.toString());
		
		return rpdResponse;
	}
	
	public RetrievePolCoverageResponse retrievePolCoverage(RetrievePolCoverageRequest rpcr) throws SQLException {
		RetrievePolCoverageResponse rpcResponse = new RetrievePolCoverageResponse();
		
		HashMap<String, Object> retrievePolCoverageParams = new HashMap<String, Object>();
		retrievePolCoverageParams.put("policyId", rpcr.getPolicyId());
		retrievePolCoverageParams.put("policyNo", rpcr.getPolicyNo());
		
		rpcResponse.setPolicy(underwritingDao.retrievePolicyCoverage(retrievePolCoverageParams));
		
		logger.info("retrievePolCoverageResponse : " + rpcResponse.toString());
		
		return rpcResponse;
	}

	@Override
	public SavePolCoverageResponse savePolCoverage(SavePolCoverageRequest spcr) throws SQLException {
		SavePolCoverageResponse spcResponse = new SavePolCoverageResponse();
		try{
			HashMap<String, Object> savePolCoverageParams = new HashMap<String, Object>();
			savePolCoverageParams.put("policyId",spcr.getPolicyId());
			savePolCoverageParams.put("riskId",spcr.getRiskId());
			savePolCoverageParams.put("projId",spcr.getProjId());
			savePolCoverageParams.put("sectionISi",spcr.getSectionISi());
			savePolCoverageParams.put("sectionIISi",spcr.getSectionIISi());
			savePolCoverageParams.put("sectionIIISi",spcr.getSectionIIISi());
			savePolCoverageParams.put("totalSi",spcr.getTotalSi());
			savePolCoverageParams.put("sectionIPrem",spcr.getSectionIPrem());
			savePolCoverageParams.put("sectionIIPrem",spcr.getSectionIIPrem());
			savePolCoverageParams.put("sectionIIIPrem",spcr.getSectionIIIPrem());
			savePolCoverageParams.put("totalPrem",spcr.getTotalPrem());
			savePolCoverageParams.put("currencyCd",spcr.getCurrencyCd());
			savePolCoverageParams.put("currencyRt",spcr.getCurrencyRt());
			savePolCoverageParams.put("pctShare",spcr.getPctShare());
			savePolCoverageParams.put("pctPml",spcr.getPctPml());
			savePolCoverageParams.put("totalValue",spcr.getTotalValue());
			savePolCoverageParams.put("remarks",spcr.getRemarks());
			savePolCoverageParams.put("createUser",spcr.getCreateUser());
			savePolCoverageParams.put("createDate",spcr.getCreateDate());
			savePolCoverageParams.put("updateUser",spcr.getUpdateUser());
			savePolCoverageParams.put("updateDate",spcr.getUpdateDate());
			savePolCoverageParams.put("saveSectionCovers",spcr.getSaveSectionCovers());
			savePolCoverageParams.put("deleteSectionCovers",spcr.getDeleteSectionCovers());
			
			
			HashMap<String, Object> res = underwritingDao.savePolCoverage(savePolCoverageParams);
			spcResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			spcResponse.setReturnCode(0);
			spcResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return spcResponse;
	}
}
