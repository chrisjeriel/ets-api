package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.quote.Alop;
import ph.cpi.rest.api.model.quote.Quotation;
import ph.cpi.rest.api.model.quote.QuotationOc;

@Component
public class QuoteDaoImpl implements QuoteDao{

	@Autowired
	private SqlSession sqlSession;

	@Override
	public Alop retrieveQuoteAlop(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Alop alopSample = sqlSession.selectOne("retrieveQuoteAlopSample", params);
		return alopSample;
	}

	@Override
	public List<Alop> retrieveQuoteAlopList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Alop> alopList = sqlSession.selectList("retrieveQuoteAlopSample", params);
		return alopList;
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

	public List<Quotation> retrieveQuoteHoldCoverListing(HashMap<String, Object> params) throws SQLException {
		List<Quotation> quotationListing = sqlSession.selectList("retrieveQuoteHoldCoverListing", params);
		return quotationListing;
	}

}
