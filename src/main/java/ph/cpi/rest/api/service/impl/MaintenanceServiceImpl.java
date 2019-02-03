package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.request.RetrieveMtnRiskListingRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRiskRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnSectionCoversRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTypeOfCessionRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnRiskListingResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRiskResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnSectionCoversResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTypeOfCessionResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.service.MaintenanceService;

@Component
public class MaintenanceServiceImpl implements MaintenanceService{

	@Autowired
	MaintenanceDao maintenanceDao;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);
	
	@Override
	public RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException {
		RetrieveQuoteAlopResponse rqaResponse = new RetrieveQuoteAlopResponse();
		
		HashMap<String, Object> retrieveQuoteAlopParams = new HashMap<String, Object>();
		retrieveQuoteAlopParams.put("quoteId", rqap.getQuoteId());
		retrieveQuoteAlopParams.put("quotationNo", rqap.getQuotationNo());
		
		rqaResponse.getQuotation().setAlop(maintenanceDao.retrieveQuoteAlop(retrieveQuoteAlopParams));
		
		logger.info("retrieveQuoteAlopResponse : " + rqaResponse.toString());
		
		return rqaResponse;
	}

	@Override
	public RetrieveMtnRiskResponse retrieveMtnRisk(RetrieveMtnRiskRequest rmrp) throws SQLException {
		RetrieveMtnRiskResponse rmrResponse = new RetrieveMtnRiskResponse();
		
		HashMap<String, Object> retrieveMtnRiskParams = new HashMap<String, Object>();
		retrieveMtnRiskParams.put("riskId", rmrp.getRiskId());
		/*retrieveMtnRiskParams.put("position", rmrp.getPaginationRequest().getPosition());
		retrieveMtnRiskParams.put("count", rmrp.getPaginationRequest().getCount());
		retrieveMtnRiskParams.put("sortKey", rmrp.getSortRequest().getSortKey());
		retrieveMtnRiskParams.put("order", rmrp.getSortRequest().getOrder());*/
		retrieveMtnRiskParams.put("listing", false);
		
		rmrResponse.setRisk(maintenanceDao.retrieveMtnRisk(retrieveMtnRiskParams));
		
		logger.info("retrieveMtnRiskResponse : " + rmrResponse.toString());
		
		return rmrResponse;
	}
	
	@Override
	public RetrieveMtnRiskListingResponse retrieveMtnRiskListing(RetrieveMtnRiskListingRequest rmrlp)
			throws SQLException {
		RetrieveMtnRiskListingResponse rmrlResponse = new RetrieveMtnRiskListingResponse();
		
		HashMap<String, Object> retrieveMtnRiskListingParams = new HashMap<String, Object>();
		retrieveMtnRiskListingParams.put("riskId", rmrlp.getRiskId());
		retrieveMtnRiskListingParams.put("riskAbbr", rmrlp.getRiskAbbr());
		retrieveMtnRiskListingParams.put("riskName", rmrlp.getRiskName());
		retrieveMtnRiskListingParams.put("regionDesc", rmrlp.getRegionDesc());
		retrieveMtnRiskListingParams.put("provinceDesc", rmrlp.getProvinceDesc());
		retrieveMtnRiskListingParams.put("cityDesc", rmrlp.getCityDesc());
		retrieveMtnRiskListingParams.put("districtDesc", rmrlp.getDistrictDesc());
		retrieveMtnRiskListingParams.put("blockDesc", rmrlp.getBlockDesc());
		retrieveMtnRiskListingParams.put("latitude", rmrlp.getLatitude());
		retrieveMtnRiskListingParams.put("longitude", rmrlp.getLongitude());
		retrieveMtnRiskListingParams.put("activeTag", rmrlp.getActiveTag());
		retrieveMtnRiskListingParams.put("listing", true);
		
		rmrlResponse.setRisk(maintenanceDao.retrieveMtnRiskListing(retrieveMtnRiskListingParams));
		
		logger.info("retrieveMtnRiskListingResponse : " + rmrlResponse.toString());
		
		return rmrlResponse;
	}

	@Override
	public RetrieveMtnSectionCoversResponse retrieveMtnSectionCovers(RetrieveMtnSectionCoversRequest rmscp)
			throws SQLException {
		RetrieveMtnSectionCoversResponse rmscResponse = new RetrieveMtnSectionCoversResponse();
		
		HashMap<String, Object> retrieveMtnSectionCoversParams = new HashMap<String, Object>();
		retrieveMtnSectionCoversParams.put("lineCd", rmscp.getLineCd());
		retrieveMtnSectionCoversParams.put("coverCd", rmscp.getCoverCd());
		
		rmscResponse.setSectionCovers(maintenanceDao.retrieveSectionCovers(retrieveMtnSectionCoversParams));
		
		logger.info("retrieveMtnSectionCoversResponse : " + rmscResponse.toString());

		return rmscResponse;
	}

	@Override
	public RetrieveMtnTypeOfCessionResponse retrieveMtnTypeOfCession(RetrieveMtnTypeOfCessionRequest rmtcp)
			throws SQLException {
		RetrieveMtnTypeOfCessionResponse rmtcResponse = new RetrieveMtnTypeOfCessionResponse();
		
		HashMap<String, Object> retrieveMtnTypeOfCessionParams = new HashMap<String, Object>();
		retrieveMtnTypeOfCessionParams.put("cessionId", rmtcp.getCessionId());
		
		rmtcResponse.setCession(maintenanceDao.retrieveTypeOfCession(retrieveMtnTypeOfCessionParams));
		
		logger.info("retrieveMtnTypeOfCessionResponse : " + rmtcResponse.toString());
		
		return rmtcResponse;
	}

}
