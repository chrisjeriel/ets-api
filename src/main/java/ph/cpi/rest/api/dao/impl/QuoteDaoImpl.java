package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.Approver;
import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.quote.AlopItem;
import ph.cpi.rest.api.model.quote.Endorsements;
import ph.cpi.rest.api.model.quote.EndorsementsOc;
import ph.cpi.rest.api.model.quote.Item;
import ph.cpi.rest.api.model.quote.Project;
import ph.cpi.rest.api.model.quote.ProjectOc;
import ph.cpi.rest.api.model.quote.Quotation;
import ph.cpi.rest.api.model.quote.QuotationGeneralInfo;
import ph.cpi.rest.api.model.quote.QuotationGeneralInfoOc;
import ph.cpi.rest.api.model.quote.QuotationOc;

@Component
public class QuoteDaoImpl implements QuoteDao{
	
	@Value("${spring.datasource.url}")
	private String dbUrl;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@Autowired
	private PlatformTransactionManager txManager;

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
//		RowBounds rb = new RowBounds(
//						(((PaginationRequest) params.get("pagination")).getPosition() - 1 ) * ((PaginationRequest) params.get("pagination")).getCount()
//						,((PaginationRequest) params.get("pagination")).getCount());
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
	
	public QuotationGeneralInfoOc retrieveQuoteGeneralInfoOc(HashMap<String, Object> params) throws SQLException {
		QuotationGeneralInfoOc quotationOc = sqlSession.selectOne("retrieveQuoteGeneralInfoOc", params);
		return quotationOc;
	}

	@Override
	public Quotation retrieveQuoteDetails(HashMap<String, Object> params) throws SQLException {
		Quotation quotation = sqlSession.selectOne("retrieveQuoteDetails", params);
		return quotation;
	}

	@Override
	public List<Quotation> retrieveQuoteHoldCoverListing(HashMap<String, Object> params) throws SQLException {
		System.out.println(params);
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
	public ProjectOc retrieveQuoteProjectOc(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		ProjectOc project = sqlSession.selectOne("retrieveQuoteProjectOc",params);
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
		Integer errorCode = sqlSession.update("saveQuoteAlopItemMap",params);
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
	public List<AlopItem> retrieveAlopItemList(HashMap<String, Object> params) throws SQLException {
			List<AlopItem> alopItem = sqlSession.selectList("retrieveQuoteAlopItem",params);
		return alopItem;
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
	

//	@Override
//	public Integer saveQuoteHoldCover(HashMap<String, Object> params) throws SQLException {
//		Integer errorCode = sqlSession.update("saveQuoteHoldCover", params);
//		return errorCode;
//	}
	
	@Override
	public HashMap<String, Object>  saveQuoteHoldCover(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveQuoteHoldCover", params);
		params.put("errorCode", errorCode);
		System.out.println(params +  " from daoImpl" );
		return params;
	}

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
	
	@Override
	public HashMap<String, Object> saveQuoteGeneralInfoOc(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveQuoteGeneralInfoOc",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public HashMap<String, Object> saveQuoteChangeQuoteStatus(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveQuoteChangeQuoteStatusMap",params);
			params.put("errorCode", errorCode);
		return params;
	}
	
	@Autowired
	private PlatformTransactionManager transactionManager;
	
	public Integer saveQuoteOptionAll(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer errorCode = sqlSession.update("saveQuoteOptionsAll",params);
		return errorCode;
	}
	
	public Integer copyEndorsement(final HashMap<String, Object> params) throws SQLException{
		Integer errorCode = sqlSession.update("copyEndorsementMap",params);
		return errorCode;
	}
	
	@Override
	public Quotation retrieveQuoteDeductibles(HashMap<String, Object> params) throws SQLException {
		Quotation quotation = sqlSession.selectOne("retrieveQuoteDeductibles", params);
		return quotation;
	}

	@Transactional(rollbackFor=Exception.class)
	@Override
	public HashMap<String, Object> saveQuotationCopy(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("copyQuoteGenInfo", params);
		params.put("errorCode", errorCode);
		sqlSession.update("copyQuoteProject", params);
		sqlSession.update("copyQuoteCoverage", params);
		sqlSession.update("copyQuoteSectionCovers", params);
		sqlSession.update("copyQuoteOptions", params);
		sqlSession.update("copyQuoteDeductibles", params);
		sqlSession.update("copyQuoteOtherRates", params);
		sqlSession.update("copyQuoteEndorsements", params);
		sqlSession.update("copyQuoteAlop", params);

		return params;
	}

	@Transactional(rollbackFor=Exception.class)
	@Override
	public Integer copyInternalCompetition(HashMap<String, Object> params) throws SQLException {
		
		sqlSession.update("copyQuoteCoverage", params);
		sqlSession.update("copyQuoteSectionCovers", params);		
		sqlSession.update("copyQuoteOptions", params);
		sqlSession.update("copyQuoteDeductibles", params);
		sqlSession.update("copyQuoteOtherRates", params);
		sqlSession.update("copyQuoteEndorsements", params);
		sqlSession.update("copyQuoteAlop", params);
		
		return null;
	}

	@Override
	public List<Quotation> searchQuoteInfo(HashMap<String, Object> params) throws SQLException {
		List<Quotation> quoteList = sqlSession.selectList("searchQuoteInfo", params);
		return quoteList;
	}
	
	@Override
	public Integer saveQuoteAdviceWordings(final HashMap<String, Object> params) throws SQLException{
		Integer errorCode = sqlSession.update("saveQuoteAdviceWordingsMap",params);
		return errorCode;
	}

	@Override
	public Integer updateHoldCoverStatus(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("updateHoldCoverStatus",params);
		return errorCode;
	}
	public Integer renumberQuoteOptions(String quoteId) throws SQLException {
		Integer errorCode = sqlSession.update("renumberQuoteOptions",quoteId);
		return errorCode;
	}

	@Override
	public List<Approver> retrieveQuoteApprover(HashMap<String, Object> params) throws SQLException {
		return sqlSession.selectList("retrieveQuoteApprover", params);
	}

	@Override
	public Integer updateQuoteStatus(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("updateQuoteStatus", params);
		return errorCode;
	}

	@Override
	public Integer checkCompetition(HashMap<String, Object> params) throws SQLException {
		params.put("hasCompetition", "");
		sqlSession.selectOne("checkCompetition", params);
		Integer res = (Integer) params.get("hasCompetition");
		return res;
	}

	@Override       
	public Integer copyCompetition(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("copyCompetition", params);
		return errorCode;
	}

	@Override
	public Integer retrieveQuoteListingLength(HashMap<String, Object> params) throws SQLException {
		Integer length = (Integer) sqlSession.selectOne("retrieveQuoteListingLength", params);
		return length;
	}

	@Override
	public List<Item> retrieveQuItem(HashMap<String, Object> params) throws SQLException {
		List<Item> items = sqlSession.selectList("retrieveQuItem", params);
		return items;
	}

	@Override
	public Integer saveQuItem(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveQuItem",params);
		return code;
	}
		
}
