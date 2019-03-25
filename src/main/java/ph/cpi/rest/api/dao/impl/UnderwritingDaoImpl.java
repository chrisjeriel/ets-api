package ph.cpi.rest.api.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.underwriting.Attachment;

@Component
public class UnderwritingDaoImpl implements UnderwritingDao{

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
	
	private static final Logger logger = LoggerFactory.getLogger(UnderwritingDaoImpl.class);
	
	public List<Attachment> retrievePolAttachmentList(final HashMap<String, Object> params) throws SQLException{
		List<Attachment> polAttachmentList = sqlSession.selectList("retrievePolAttachment", params);
		return polAttachmentList;
	}
}
