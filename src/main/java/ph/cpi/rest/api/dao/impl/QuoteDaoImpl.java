package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.quote.Endorsements;
import ph.cpi.rest.api.model.quote.EndorsementsOc;
import ph.cpi.rest.api.model.quote.Project;
import ph.cpi.rest.api.model.quote.Quotation;
import ph.cpi.rest.api.model.quote.QuotationGeneralInfo;
import ph.cpi.rest.api.model.quote.QuotationOc;
import ph.cpi.rest.api.service.impl.QuoteServiceImpl;

@Component
public class QuoteDaoImpl implements QuoteDao{

	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteDaoImpl.class);

	/*@Override
	public Alop retrieveQuoteAlop(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Alop alopSample = sqlSession.selectOne("retrieveQuoteAlopSample", params);
		return alopSample;
	}*/

	@Override
	public List<Quotation> retrieveQuoteAttachmentList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
			List<Quotation> quotationList = sqlSession.selectList("retrieveQuoteAttachment", params);
		return quotationList;
	}

	@Override
	public List<Quotation> retrieveQuoteListing(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Quotation> quoteList = sqlSession.selectList("retrieveQuoteListing", params);
		return quoteList;
	}

	@Override
	public List<QuotationOc> retrieveQuoteListingOc(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<QuotationOc> quoteListOc = sqlSession.selectList("retrieveQuoteListingOc", params);
		return quoteListOc;
	}

	@Override
	public Quotation retrieveQuoteOption(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Quotation quotation = sqlSession.selectOne("retrieveQuoteOption", params);
		return quotation;
	}
	
	public Quotation retrieveQuoteCoverage(HashMap<String, Object> params) throws SQLException {
		Quotation quotation = sqlSession.selectOne("retrieveQuoteCoverage", params);
		
		logger.info("retrieveQuoteCoverage DAOImpl : " + quotation);
		
		return quotation;
	}

	public Quotation retrieveQuoteHoldCover(HashMap<String, Object> params) throws SQLException {
		Quotation quotation = sqlSession.selectOne("retrieveQuoteHoldCover", params);
		return quotation;
	}

	@Override
	public QuotationOc retrieveQuoteDetailsOc(HashMap<String, Object> params) throws SQLException {
		QuotationOc quotationOc = sqlSession.selectOne("retrieveQuoteDetailsOc", params);
		return quotationOc;
	}
	
	public List<QuotationOc> retrieveQuoterGeneralInfoOc(HashMap<String, Object> params) throws SQLException {
		List<QuotationOc> quotationOc = sqlSession.selectList("retrieveQuoteGeneralInfoOc", params);
		return quotationOc;
	}

	@Override
	public Quotation retrieveQuoteDetails(HashMap<String, Object> params) throws SQLException {
		Quotation quotation = sqlSession.selectOne("retrieveQuoteDetails", params);
		return quotation;
	}

	@Override
	public List<Quotation> retrieveQuoteHoldCoverListing(HashMap<String, Object> params) throws SQLException {
		List<Quotation> quotationListing = sqlSession.selectList("retrieveQuoteHoldCoverListing", params);
		return quotationListing;
	}

	@Override
	public List<QuotationOc> retrieveQuoteAttachmentOcList(final HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<QuotationOc> attachmentOcList = sqlSession.selectList("retrieveQuoteAttachmentOc", params);
		return attachmentOcList;
	}

	@Override
	public QuotationGeneralInfo retrieveQuoteGeneralInfo(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		QuotationGeneralInfo quoteGeneralInfo = sqlSession.selectOne("retrieveQuoteGeneralInfo", params);
		return quoteGeneralInfo;		
	}

	@Override
	public List<Endorsements> retrieveQuoteEndorsements(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Endorsements> endorsements = sqlSession.selectList("retrieveQuoteEndorsements", params);
		return endorsements;
	}

	@Override
	public List<EndorsementsOc> retrieveQuoteEndorsementsOc(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<EndorsementsOc> endorsementsOc = sqlSession.selectList("retrieveQuoteEndorsementsOc", params);
		return endorsementsOc;
	}

	@Override
	public Project retrieveQuoteProject(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Project project = sqlSession.selectOne("retrieveQuoteProject",params);
		return project;
	}

	@Override
	public HashMap<String, Object> saveQuoteAttachment(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveQuoteAttachmentMap",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveQuoteAlop(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveQuoteAlopMap",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveQuoteAlopItem(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveQuoteAloItempMap",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public List<Quotation> retrieveQuoteCompetitionList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Quotation> competitionList = sqlSession.selectList("retrieveQuoteCompetition", params);
		return competitionList;
	}
	
	@Override
	public QuotationOc retrieveQuoteCoverageOc(final HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		QuotationOc projectOc = sqlSession.selectOne("retrieveQuoteCoverageOc", params);
		return projectOc;
	}

	@Override
	public List<Quotation> retrieveAlopItemList(HashMap<String, Object> params) throws SQLException {
			List<Quotation> quotationList = sqlSession.selectList("retrieveQuoteAlopItem",params);
		return quotationList;
	}


	@Override
	public Quotation retrieveQuoteAlop(HashMap<String, Object> params) throws SQLException {
		Quotation quotationAlop = sqlSession.selectOne("retrieveQuoteAlop",params);
		return quotationAlop;
	}

	@Override
	public HashMap<String, Object> saveQuoteCoverage(HashMap<String, Object> params) throws SQLException {
			Integer errorCode = sqlSession.update("saveQuoteCoverageMap",params);
			params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Integer saveQuoteCoverageOc(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveQuoteCoverageOcMap",params);
		return errorCode;
	}

	@Override
	public HashMap<String, Object> saveQuoteGeneralInfo(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveQuoteGeneralInfo",params);
		params.put("errorCode", errorCode);
		
		return params;
	}
	

	@Override
	public Integer saveQuoteHoldCover(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveQuoteHoldCover", params);
		return errorCode;
	}
	
//	@Override
//	public HashMap<String, Object>  saveQuoteHoldCover(HashMap<String, Object> params) throws SQLException {
//		Integer errorCode = sqlSession.update("saveQuoteHoldCover", params);
//		params.put("errorCode", errorCode);
//		return errorCode;
//	}

	@Override
	public Integer saveQuoteEndorsements(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveQuoteEndorsements", params);
		return errorCode;
	}

	public Integer saveQuoteAttachmentOc(final HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveQuoteAttachmentOcMap",params);
		return errorCode;
	}
	
	@Override
	public Integer saveQuoteCompetition(final HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveQuoteCompetitionMap",params);
		return errorCode;
	}

	@Override
	public Integer saveQuoteOption(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer errorCode = sqlSession.update("saveQuoteOptionMap",params);
		return errorCode;
	}
	
	public Integer saveQuoteEndorsementsOc(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveQuoteEndorsementsOc", params);
		return errorCode;
	}

	@Override
	public Integer saveQuoteOtherRates(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer errorCode = sqlSession.update("saveQuoteOtherRatesMap", params);
		return errorCode;
	}

	@Override
	public Integer saveQuoteDeductibles(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveQuoteDeductiblesMap", params);
		return errorCode;
	}
		
	public Integer saveQuoteOptionAll(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer errorCode = sqlSession.update("saveQuoteOptionsAll",params);
		return errorCode;
	}
}
