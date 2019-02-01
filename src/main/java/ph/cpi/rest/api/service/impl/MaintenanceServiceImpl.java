package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.maintenance.QuoteWordings;
import ph.cpi.rest.api.model.request.RetrieveMtnObjectRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnProvinceRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnQuoteWordingsRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRegionRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnObjectResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnProvinceResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnQuoteWordingsResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRegionResponse;
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
	public RetrieveMtnRegionResponse retrieveMtnRegion(RetrieveMtnRegionRequest rmrp) throws SQLException {
		RetrieveMtnRegionResponse rmrResponse = new RetrieveMtnRegionResponse();
		
		HashMap<String, Object> retrieveMtnRegionParams = new HashMap<String, Object>();
		retrieveMtnRegionParams.put("regionCd", rmrp.getRegionCd());
		retrieveMtnRegionParams.put("from", "retrieveMtnRegion");
		rmrResponse.setRegion(maintenanceDao.retrieveMtnRegion(retrieveMtnRegionParams));
		logger.info("retrieveMtnRegionResponse :" + rmrResponse.toString());
		
		return rmrResponse;
	}

	@Override
	public RetrieveMtnProvinceResponse retrieveMtnProvince(RetrieveMtnProvinceRequest rmpp) throws SQLException {
		RetrieveMtnProvinceResponse rmpResponse = new RetrieveMtnProvinceResponse();
		
		HashMap<String, Object> retrieveMtnProvinceParams = new HashMap<String, Object>();
		retrieveMtnProvinceParams.put("regionCd", rmpp.getRegionCd());
		retrieveMtnProvinceParams.put("provinceCd", rmpp.getProvinceCd());
		retrieveMtnProvinceParams.put("from", "retrieveMtnProvince");
		rmpResponse.setRegion(maintenanceDao.retrieveMtnRegion(retrieveMtnProvinceParams));
		rmpResponse.getRegion().setProvince(maintenanceDao.retrieveMtnProvince(retrieveMtnProvinceParams));
		logger.info("retrieveMtnProvinceResponse :" + rmpResponse.toString());
		
		return rmpResponse;
	}

	@Override
	public RetrieveMtnObjectResponse retrieveMtnObject(RetrieveMtnObjectRequest rmop) throws SQLException {
		RetrieveMtnObjectResponse rmoResponse = new RetrieveMtnObjectResponse();
		
		HashMap<String, Object> retrieveMtnObjectParams = new HashMap<String, Object>();
		retrieveMtnObjectParams.put("objectId", rmop.getObjectId());
		retrieveMtnObjectParams.put("lineCd", rmop.getLineCd());
		rmoResponse.setObject(maintenanceDao.retrieveMtnObject(retrieveMtnObjectParams));
		logger.info("retrieveMtnObjectResponse :" + rmoResponse.toString());
		
		return rmoResponse;
	}

	@Override
	public RetrieveMtnQuoteWordingsResponse retrieveMtnQuoteWordings(RetrieveMtnQuoteWordingsRequest rmqwp)
			throws SQLException {
		RetrieveMtnQuoteWordingsResponse rmqwResponse = new RetrieveMtnQuoteWordingsResponse();
		HashMap<String, Object> retrieveMtnQuoteWordingsParams = new HashMap<String, Object>();
		retrieveMtnQuoteWordingsParams.put("lineCd", rmqwp.getLineCd());
		retrieveMtnQuoteWordingsParams.put("type",rmqwp.getType());
		rmqwResponse.setQuoteWordings(maintenanceDao.retrieveMtnQuoteWordings(retrieveMtnQuoteWordingsParams));
		logger.info("retrieveMtnQuoteWordingsResponse :" + rmqwResponse.toString());

		return rmqwResponse;
	}

	
	

}
