package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.quote.AlopItem;
import ph.cpi.rest.api.model.quote.Attachment;

@Component
public class QuoteDaoImpl implements QuoteDao{

	@Autowired
	private SqlSession sqlSession;

	@Override
	public Alop retrieveQuoteAlop(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Alop alop = sqlSession.selectOne("retrieveQuoteAlopSample", params);
		return alop;
	}

	@Override
	public List<Alop> retrieveQuoteAlopList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Alop> alopList = sqlSession.selectList("retrieveQuoteAlopSample", params);
		return alopList;
	}

	@Override
	public Attachment retrieveQuoteAttachment(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Attachment attachment = sqlSession.selectOne("retrieveQuoteAttachment", params);
		return attachment;
	}

	@Override
	public List<Attachment> retrieveQuoteAttachmentList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Attachment> attachmentList = sqlSession.selectList("retrieveQuoteAttachment", params);
		return attachmentList;
	}

	@Override
	public AlopItem retrieveQuoteAlopItem(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		AlopItem alopItem = sqlSession.selectOne("retrieveQuoteAlopItem", params);
		return alopItem;
	}

	@Override
	public List<AlopItem> retrieveQuoteAlopItemList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<AlopItem> alopItemList = sqlSession.selectList("retrieveQuoteAlopItem", params);
		return alopItemList;
	}
	
	
}
