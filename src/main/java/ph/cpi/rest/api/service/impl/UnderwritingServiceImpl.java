package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentRequest;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentResponse;
import ph.cpi.rest.api.service.UnderwritingService;

@Component
public class UnderwritingServiceImpl implements UnderwritingService {
	
	@Autowired
	UnderwritingDao underwritingDao;
	
	private static final Logger logger = LoggerFactory.getLogger(UnderwritingServiceImpl.class);
	
	@Override
	public RetrievePolAttachmentResponse retrievePolAttachment(RetrievePolAttachmentRequest rpar) throws SQLException {
		RetrievePolAttachmentResponse rpaResponse = new RetrievePolAttachmentResponse();
		HashMap<String, Object> retrievePolAttachmentParams = new HashMap<String, Object>();
		retrievePolAttachmentParams.put("policyId", rpar.getPolicyId());
		retrievePolAttachmentParams.put("policyNo", rpar.getPolicyNo());
		
		rpaResponse.setPolAttachmentList(underwritingDao.retrievePolAttachmentList(retrievePolAttachmentParams));
		logger.info("retrievePolAttachmentResponse : " + rpaResponse.toString());
		return rpaResponse;
	}

}
