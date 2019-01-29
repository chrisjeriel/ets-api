package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.AlopSample;
import ph.cpi.rest.api.model.quote.Attachment;
import ph.cpi.rest.api.model.quote.Quotation;

@Component
public class QuoteDaoImpl implements QuoteDao{

	@Autowired
	private SqlSession sqlSession;

	@Override
	public AlopSample retrieveQuoteAlop(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		AlopSample alop = sqlSession.selectOne("retrieveQuoteAlopSample", params);
		return alop;
	}

	@Override
	public List<Quotation> retrieveQuoteAttachmentList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Quotation> quotationList = sqlSession.selectList("retrieveQuoteAttachment", params);
		return quotationList;
	}

	@Override
	public List<Quotation> retrieveAlopItemList(HashMap<String, Object> params) throws SQLException {
			List<Quotation> quotationList = sqlSession.selectList("retrieveQuoteAlopItem",params);
		return quotationList;
	}


	@Override
	public List<Quotation> retrieveQuoteAlopList(HashMap<String, Object> params) throws SQLException {
		List<Quotation> quotationList = sqlSession.selectList("retrieveQuoteAlop",params);
		return quotationList;
	}

}
