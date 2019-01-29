package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.request.RetrieveMtnAdviceWordingsRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnBlockRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCedingCompanyListingRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCedingCompanyRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnAdviceWordingsResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnBlockResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCedingCompanyListingResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCedingCompanyResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.service.MaintenanceService;

@Component
public class MaintenanceServiceImpl implements MaintenanceService{

	@Autowired
	MaintenanceDao maintenanceDao;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);
	
	/*@Override
	public RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException {
		RetrieveQuoteAlopResponse rqaResponse = new RetrieveQuoteAlopResponse();
		
		HashMap<String, Object> retrieveQuoteAlopParams = new HashMap<String, Object>();
		retrieveQuoteAlopParams.put("quoteId", rqap.getQuoteId());
		retrieveQuoteAlopParams.put("quotationNo", rqap.getQuotationNo());
		
		rqaResponse.getQuotation().setAlop(maintenanceDao.retrieveQuoteAlop(retrieveQuoteAlopParams));
		
		logger.info("retrieveQuoteAlopResponse : " + rqaResponse.toString());
		
		return rqaResponse;
	}*/

	@Override
	public RetrieveMtnAdviceWordingsResponse retrieveMaintenanceAdviceWordings(
			RetrieveMtnAdviceWordingsRequest retMtnAdviceWordings)
					throws SQLException {
		
		RetrieveMtnAdviceWordingsResponse rmawResponse = new RetrieveMtnAdviceWordingsResponse();
        
        HashMap<String, Object> retrieveMtnAdviceWordingsParams = new HashMap<String, Object>();
        retrieveMtnAdviceWordingsParams.put("adviceWordId", retMtnAdviceWordings.getAdviceWordId());
        
        rmawResponse.setAdviceWordings(maintenanceDao.retrieveMaintenanceAdviceWordings(retrieveMtnAdviceWordingsParams));
        
        logger.info("retrieveMaintenanceAdviceWordingsResponse : " + rmawResponse.toString());
        
        
        return rmawResponse;

	}

	@Override
	public RetrieveMtnBlockResponse retrieveMaintenanceBlock(RetrieveMtnBlockRequest retMtnBlock)
			throws SQLException {
		
		RetrieveMtnBlockResponse rmbResponse = new RetrieveMtnBlockResponse();
        
        HashMap<String, Object> retrieveMtnBlockParams = new HashMap<String, Object>();
        retrieveMtnBlockParams.put("regionCd", retMtnBlock.getRegionCd());
        retrieveMtnBlockParams.put("provinceCd", retMtnBlock.getProvinceCd());
        retrieveMtnBlockParams.put("cityCd", retMtnBlock.getCityCd());
        retrieveMtnBlockParams.put("districtCd", retMtnBlock.getDistrictCd());
        retrieveMtnBlockParams.put("blockCd", retMtnBlock.getBlockCd());
        
        rmbResponse.setRegion(maintenanceDao.retrieveMaintenanceBlockList(retrieveMtnBlockParams));
        
        logger.info("retrieveMaintenanceBlockResponse : " + rmbResponse.toString());
        
		return rmbResponse;
	}

	@Override
	public RetrieveMtnCedingCompanyListingResponse retrieveMaintenanceCedingCompanyListing(
			RetrieveMtnCedingCompanyListingRequest retMtnCedingCompanyListing) throws SQLException {
		RetrieveMtnCedingCompanyListingResponse rmcclResponse = new RetrieveMtnCedingCompanyListingResponse();
		
		HashMap<String, Object> retrieveMtnCedingCompanyParams = new HashMap<String, Object>();
		retrieveMtnCedingCompanyParams.put("cedingId",retMtnCedingCompanyListing.getCedingId()); 
		retrieveMtnCedingCompanyParams.put("cedingName",retMtnCedingCompanyListing.getCedingName());
		retrieveMtnCedingCompanyParams.put("cedingAbbr",retMtnCedingCompanyListing.getCedingAbbr());
		retrieveMtnCedingCompanyParams.put("address",retMtnCedingCompanyListing.getAddress());
		retrieveMtnCedingCompanyParams.put("membershipDate",retMtnCedingCompanyListing.getMembershipDate());
		retrieveMtnCedingCompanyParams.put("terminationDate",retMtnCedingCompanyListing.getTerminationDate());
		retrieveMtnCedingCompanyParams.put("inactiveDate",retMtnCedingCompanyListing.getInactiveDate());
		retrieveMtnCedingCompanyParams.put("activeTag",retMtnCedingCompanyListing.getActiveTag());
		retrieveMtnCedingCompanyParams.put("govtTag",retMtnCedingCompanyListing.getGovtTag());
		retrieveMtnCedingCompanyParams.put("membershipTag",retMtnCedingCompanyListing.getMembershipTag());
		return rmcclResponse;
	}

	/*@Override
	public RetrieveMtnCedingCompanyResponse retrieveMaintenanceCedingCompany(
			RetrieveMtnCedingCompanyRequest retMtnCedingCompany) throws SQLException {
		RetrieveMtnCedingCompanyResponse rmccResponse = new RetrieveMtnCedingCompanyResponse();
        
        HashMap<String, Object> retrieveMtnCedingCompanyParams = new HashMap<String, Object>();
        retrieveMtnCedingCompanyParams.put("cedingId", retMtnCedingCompany.getCedingId());
        
        rmccResponse.setCedingCompany(maintenanceDao.retrieveMaintenanceCedingCompany(retrieveMtnCedingCompanyParams));
      
        logger.info("retrieveMaintenanceCedingCompanyResponse : " + rmccResponse.toString());
        
		return rmccResponse;
	}

	@Override
	public RetrieveMtnCedingCompanyListingResponse retrieveMaintenanceCedingCompanyListing(
			RetrieveMtnCedingCompanyListingRequest retMtnCedingCompanyListing) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}*/

	/*@Override
	public RetrieveMtnCedingCompanyListingResponse retrieveMaintenanceCedingCompanyListing(
			RetrieveMtnCedingCompanyListingRequest retMtnCedingCompanyListing) throws SQLException {
		
		RetrieveMtnCedingCompanyListingResponse rmcclResponse = new RetrieveMtnCedingCompanyListingResponse();
        
        HashMap<String, Object> retrieveMtnCedingCompanyListingResponseParams = new HashMap<String, Object>();
        retrieveMtnCedingCompanyListingResponseParams.put("cedingId", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("cedingName", retMtnCedingCompanyListing.getCedingName());
        retrieveMtnCedingCompanyListingResponseParams.put("cedingAbbr", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("cedingAddress", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("membershipDate", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("terminationDate", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("inactiveDate", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("membershipDate", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("inactiveTag", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("activeTag", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("governmentTag", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("membershipTag", retMtnCedingCompanyListing.getCedingId());
        
        rmcclResponse.setCedingcompany(maintenanceDao.retrieveMaintenanceCedingCompanyList(retrieveMtnCedingCompanyListingResponseParams));
      
        logger.info("retrieveMaintenanceCedingCompanyResponse : " + rmcclResponse.toString());
        
		return rmcclResponse;
	}*/


}
