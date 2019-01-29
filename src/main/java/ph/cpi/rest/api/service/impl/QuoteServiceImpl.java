package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.controller.ApiController;
import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopItemRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAttachmentRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAttachmentResponse;
import ph.cpi.rest.api.service.QuoteService;

@Component
public class QuoteServiceImpl implements QuoteService{
	
	@Autowired
	QuoteDao quoteDao;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);

	@Override
	public RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException {
		
		RetrieveQuoteAlopResponse rqaResponse = new RetrieveQuoteAlopResponse();
		
		HashMap<String, Object> retrieveQuoteAlopParams = new HashMap<String, Object>();
		retrieveQuoteAlopParams.put("quoteId", rqap.getQuoteId());
		retrieveQuoteAlopParams.put("quotationNo", rqap.getQuotationNo());
		
		rqaResponse.setQuotation(quoteDao.retrieveQuoteAlopList(retrieveQuoteAlopParams));
		
		logger.info("retrieveQuoteAlopResponse : " + rqaResponse.toString());
		
		return rqaResponse;
	}

	@Override
	public RetrieveQuoteAttachmentResponse retrieveQuoteAttachment(RetrieveQuoteAttachmentRequest rqat)
			throws SQLException {
		// TODO Auto-generated method stub
		
		RetrieveQuoteAttachmentResponse rqatResponse = new RetrieveQuoteAttachmentResponse();
		
		HashMap<String, Object> retrieveQuoteAttachmentParams = new HashMap<String, Object>();
		retrieveQuoteAttachmentParams.put("quoteId", rqat.getQuoteId());
		retrieveQuoteAttachmentParams.put("quotationNo", rqat.getQuotationNo());
		
		rqatResponse.setQuotation(quoteDao.retrieveQuoteAttachmentList(retrieveQuoteAttachmentParams));
		
		logger.info("retrieveQuoteAttachmentResponse : " + rqatResponse.toString());
		
		return rqatResponse;
	}

	@Override
	public RetrieveQuoteAlopItemResponse retrieveQuoteAlopItem(RetrieveQuoteAlopItemRequest retQuoteAlopItem)
			throws SQLException {
		// TODO Auto-generated method stub
		
		RetrieveQuoteAlopItemResponse retQuoteAlopItemResponse = new RetrieveQuoteAlopItemResponse();
		
		HashMap<String, Object> retrieveQuoteAlopItemParams = new HashMap<String, Object>();
		retrieveQuoteAlopItemParams.put("quoteId", retQuoteAlopItem.getQuoteId());
		retrieveQuoteAlopItemParams.put("quotationNo", retQuoteAlopItem.getQuotationNo());
		
		retQuoteAlopItemResponse.setQuotation(quoteDao.retrieveAlopItemList(retrieveQuoteAlopItemParams));
		
		logger.info("retrieveQuoteAlopItemResponse : " + retQuoteAlopItemResponse.toString());
		return retQuoteAlopItemResponse;
	}


	
	
}
