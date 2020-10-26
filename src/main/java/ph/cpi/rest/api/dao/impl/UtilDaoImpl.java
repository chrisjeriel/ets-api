package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UtilDao;
import ph.cpi.rest.api.model.utils.*;

@Component
public class UtilDaoImpl implements UtilDao{
	
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(UtilDaoImpl.class);

	@Override
	public Integer extractReport(HashMap<String, Object> params) throws SQLException {
		logger.info("extractReport DAO : " + params);
		Integer resultCode = 99;
		String extractionMethod = "";
		String reportId = (String) params.get("reportId");
		
		if ("POLR044A".equalsIgnoreCase((String) params.get("reportId"))) {
            	extractionMethod = "extractPOLR044A";
        } else if ("POLR044B".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044B";
        } else if ("POLR044C".equalsIgnoreCase((String) params.get("reportId"))) {
            	extractionMethod = "extractPOLR044C";
        } else if ("POLR044D".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044D";
        } else if ("POLR044E".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044E";
        } else if ("POLR044F".equalsIgnoreCase((String) params.get("reportId"))) {
            	extractionMethod = "extractPOLR044F";
        } else if ("POLR044G".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044G";
        } else if ("POLR044H".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044H";
        } else if ("POLR044I".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044I";
        } else if ("POLR044J".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044J";
        } else if ("POLR044K".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044K";
        } else if ("POLR044L".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044L";
        } else if ("POLR044M".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044M";
        } else if ("POLR044N".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044N";
        } else if ("POLR044O".equalsIgnoreCase((String) params.get("reportId"))) {
        	extractionMethod = "extractPOLR044O";
        } else if ("POLR044P".equalsIgnoreCase((String) params.get("reportId"))) {
        	extractionMethod = "extractPOLR044P";
        } else if ("POLR044Q".equalsIgnoreCase((String) params.get("reportId"))) {
        	extractionMethod = "extractPOLR044Q";
        } else if ("ACITR061F".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractACITR061F";
        } else if ("ACITR061G".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractACITR061G";
        } else if ("POLR044V".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR044V";
        } else if ("POLR044W".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR044W";
        } else if ("POLR044X".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR044X";
        } else if ("ACITR048A".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractACITR048A";
        } else if ("CLMR010A".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractCLMR010A";
        } else if ("POLR044OA".equalsIgnoreCase((String) params.get("reportId"))) {
        	extractionMethod = "extractPOLR044OA";
        } else if ("POLR044OB".equalsIgnoreCase((String) params.get("reportId"))) {
        	extractionMethod = "extractPOLR044OB";
        }else if (reportId.toUpperCase().contains("ACITR052")) {
			extractionMethod = "extractBRDRX";
		}else if ("POLR052A".equalsIgnoreCase((String) params.get("reportId"))) {
			extractionMethod = "extractPOLR052A";
		} else if ("POLR052B".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR052B";
        } else if ("POLR052C".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR052C";
        } else if ("POLR052D".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR052D";
        } else if ("POLR052E".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR052E";
        } else if ("POLR052F".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR052F";
        } else if ("POLR052AB".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR052AB";
        } else if ("POLR052BB".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR052BB";
        } else if ("POLR052CB".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR052CB";
        } else if ("CLMR052A".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractCLMR052A";
        } else if ("CLMR052B".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractCLMR052B";
        } else  {
            extractionMethod = "extract" + ((String) params.get("reportId"));
        } 
		
		resultCode = sqlSession.update(extractionMethod, params);
		
		return resultCode;
	}

	@Override
	public String getReportFileName(HashMap<String, Object> params) throws SQLException {
		System.out.println(params);
		
		String fileName = sqlSession.selectOne("getReportFileName", params);
		return fileName;
	}

	@Override
	public String getReportPath() throws SQLException {
		String path = sqlSession.selectOne("getReportPath");
		return path;
	}

	@Override
	public List<POLR044E> retrievePolR044e(HashMap<String, Object> params) throws SQLException {
		List<POLR044E> retrievePolR044e = sqlSession.selectList("retrievePolR044e",params);
		return retrievePolR044e;
	}
	
	@Override
	public List<POLR044A> retrievePolR044a(HashMap<String, Object> params) throws SQLException {
		List<POLR044A> retrievePolR044a = sqlSession.selectList("retrievePolR044a",params);
		return retrievePolR044a;
	}

	@Override
	public List<POLR044B> retrievePolR044b(HashMap<String, Object> params) throws SQLException {
		List<POLR044B> retrievePolR044b = sqlSession.selectList("retrievePolR044b",params);
		return retrievePolR044b;
	}

	@Override
	public List<POLR044C> retrievePolR044c(HashMap<String, Object> params) throws SQLException {
		List<POLR044C> retrievePolR044c = sqlSession.selectList("retrievePolR044c",params);
		return retrievePolR044c;
	}

	@Override
	public List<POLR044D> retrievePolR044d(HashMap<String, Object> params) throws SQLException {
		List<POLR044D> retrievePolR044d = sqlSession.selectList("retrievePolR044d",params);
		return retrievePolR044d;
	}

	@Override
	public List<POLR044F> retrievePolR044f(HashMap<String, Object> params) throws SQLException {
		List<POLR044F> retrievePolR044f = sqlSession.selectList("retrievePolR044f",params);
		return retrievePolR044f;
	}

	@Override
	public List<POLR044G> retrievePolR044g(HashMap<String, Object> params) throws SQLException {
		List<POLR044G> retrievePolR044g = sqlSession.selectList("retrievePolR044g",params);
		return retrievePolR044g;
	}

	@Override
	public List<POLR044H> retrievePolR044h(HashMap<String, Object> params) throws SQLException {
		List<POLR044H> retrievePolR044h = sqlSession.selectList("retrievePolR044h",params);
		return retrievePolR044h;
	}

	@Override
	public List<POLR044I> retrievePolR044i(HashMap<String, Object> params) throws SQLException {
		List<POLR044I> retrievePolR044i = sqlSession.selectList("retrievePolR044i",params);
		return retrievePolR044i;
	}

	@Override
	public List<POLR044J> retrievePolR044j(HashMap<String, Object> params) throws SQLException {
		List<POLR044J> retrievePolR044j = sqlSession.selectList("retrievePolR044j",params);
		return retrievePolR044j;
	}

	@Override
	public List<POLR044K> retrievePolR044k(HashMap<String, Object> params) throws SQLException {
		List<POLR044K> retrievePolR044k = sqlSession.selectList("retrievePolR044k",params);
		return retrievePolR044k;
	}

	@Override
	public List<POLR044L> retrievePolR044l(HashMap<String, Object> params) throws SQLException {
		List<POLR044L> retrievePolR044l = sqlSession.selectList("retrievePolR044l",params);
		return retrievePolR044l;
	}

	@Override
	public List<POLR044M> retrievePolR044m(HashMap<String, Object> params) throws SQLException {
		List<POLR044M> retrievePolR044m = sqlSession.selectList("retrievePolR044m",params);
		return retrievePolR044m;
	}

	@Override
	public List<POLR044N> retrievePolR044n(HashMap<String, Object> params) throws SQLException {
		List<POLR044N> retrievePolR044n = sqlSession.selectList("retrievePolR044n",params);
		return retrievePolR044n;
	}

	@Override
	public List<POLR044O> retrievePolR044o(HashMap<String, Object> params) throws SQLException {
		List<POLR044O> retrievePolR044o = sqlSession.selectList("retrievePolR044o",params);
		return retrievePolR044o;
	}

	@Override
	public List<POLR044P> retrievePolR044p(HashMap<String, Object> params) throws SQLException {
		List<POLR044P> retrievePolR044p = sqlSession.selectList("retrievePolR044p",params);
		return retrievePolR044p;
	}

	@Override
	public List<POLR044Q> retrievePolR044q(HashMap<String, Object> params) throws SQLException {
		List<POLR044Q> retrievePolR044q = sqlSession.selectList("retrievePolR044q",params);
		return retrievePolR044q;
	}
	
	@Override
	public List<POLR044Q> retrievePolR044qa(HashMap<String, Object> params) throws SQLException {
		List<POLR044Q> retrievePolR044qa = sqlSession.selectList("retrievePolR044qa",params);
		return retrievePolR044qa;
	}

	@Override
	public List<POLR044R> retrievePolR044r(HashMap<String, Object> params) throws SQLException {
		List<POLR044R> retrievePolR044r = sqlSession.selectList("retrievePolR044r",params);
		return retrievePolR044r;
	}

	@Override
	public List<POLR044S> retrievePolR044s(HashMap<String, Object> params) throws SQLException {
		List<POLR044S> retrievePolR044s = sqlSession.selectList("retrievePolR044s",params);
		return retrievePolR044s;
	}

	@Override
	public List<POLR044T> retrievePolR044t(HashMap<String, Object> params) throws SQLException {
		//List<POLR044T> retrievePolR044t = sqlSession.selectList("retrievePolR044t",params);
		return null;
	}

	@Override
	public List<POLR052A> retrievePolR052a(HashMap<String, Object> params) throws SQLException {
		List<POLR052A> retrievePolR052a = sqlSession.selectList("retrievePolR052a",params);
		return retrievePolR052a;
	}

	@Override
	public List<POLR052B> retrievePolR052b(HashMap<String, Object> params) throws SQLException {
		List<POLR052B> retrievePolR052b = sqlSession.selectList("retrievePolR052b",params);
		return retrievePolR052b;
	}

	@Override
	public List<POLR052C> retrievePolR052c(HashMap<String, Object> params) throws SQLException {
		List<POLR052C> retrievePolR052c = sqlSession.selectList("retrievePolR052c",params);
		return retrievePolR052c;
	}

	@Override
	public List<POLR052E> retrievePolR052e(HashMap<String, Object> params) throws SQLException {
		List<POLR052E> retrievePolR052e = sqlSession.selectList("retrievePolR052e",params);
		return retrievePolR052e;
	}

	@Override
	public List<POLR052F> retrievePolR052f(HashMap<String, Object> params) throws SQLException {
		List<POLR052F> retrievePolR052f = sqlSession.selectList("retrievePolR052f",params);
		return retrievePolR052f;
	}

	@Override
	public List<CLMR010B> retrieveClmR010b(HashMap<String, Object> params) throws SQLException {
		List<CLMR010B> retrieveClmR010b = sqlSession.selectList("retrieveClmR010b",params);
		return retrieveClmR010b;
	}

	@Override
	public List<CLMR010H> retrieveClmR010h(HashMap<String, Object> params) throws SQLException {
		List<CLMR010H> retrieveClmR010h = sqlSession.selectList("retrieveClmR010h",params);
		return retrieveClmR010h;
	}

	@Override
	public List<CLMR010I> retrieveClmR010i(HashMap<String, Object> params) throws SQLException {
		List<CLMR010I> retrieveClmR010i = sqlSession.selectList("retrieveClmR010i",params);
		return retrieveClmR010i;
	}

	@Override
	public List<CLMR010J> retrieveClmR010j(HashMap<String, Object> params) throws SQLException {
		List<CLMR010J> retrieveClmR010j = sqlSession.selectList("retrieveClmR010j",params);
		return retrieveClmR010j;
	}

	@Override
	public List<CLMR010D> retrieveClmR010d(HashMap<String, Object> params) throws SQLException {
		List<CLMR010D> retrieveClmR010d = sqlSession.selectList("retrieveClmR010d",params);
		return retrieveClmR010d;
	}

	@Override
	public List<CLMR010K> retrieveClmR010k(HashMap<String, Object> params) throws SQLException {
		List<CLMR010K> retrieveClmR010k = sqlSession.selectList("retrieveClmR010k",params);
		return retrieveClmR010k;
	}

	@Override
	public List<CLMR010M> retrieveClmR010m(HashMap<String, Object> params) throws SQLException {
		List<CLMR010M> retrieveClmR010m = sqlSession.selectList("retrieveClmR010m",params);
		return retrieveClmR010m;
	}

	@Override
	public List<CLMR010N> retrieveClmR010n(HashMap<String, Object> params) throws SQLException {
		List<CLMR010N> retrieveClmR010n = sqlSession.selectList("retrieveClmR010n",params);
		return retrieveClmR010n;
	}

	@Override
	public List<CLMR010O> retrieveClmR010o(HashMap<String, Object> params) throws SQLException {
		List<CLMR010O> retrieveClmR010o = sqlSession.selectList("retrieveClmR010o",params);
		return retrieveClmR010o;
	}

	@Override
	public List<CLMR010P> retrieveClmR010p(HashMap<String, Object> params) throws SQLException {
		List<CLMR010P> retrieveClmR010p = sqlSession.selectList("retrieveClmR010p",params);
		return retrieveClmR010p;
	}

	@Override
	public List<CLMR010S> retrieveClmR010s(HashMap<String, Object> params) throws SQLException {
		List<CLMR010S> retrieveClmR010s = sqlSession.selectList("retrieveClmR010s",params);
		return retrieveClmR010s;
	}

	@Override
	public List<CLMR010T> retrieveClmR010t(HashMap<String, Object> params) throws SQLException {
		List<CLMR010T> retrieveClmR010t = sqlSession.selectList("retrieveClmR010t",params);
		return retrieveClmR010t;
	}

	@Override
	public List<CLMR010U> retrieveClmR010u(HashMap<String, Object> params) throws SQLException {
		List<CLMR010U> retrieveClmR010u = sqlSession.selectList("retrieveClmR010u",params);
		return retrieveClmR010u;
	}

	@Override
	public List<CLMR010V> retrieveClmR010v(HashMap<String, Object> params) throws SQLException {
		List<CLMR010V> retrieveClmR010v = sqlSession.selectList("retrieveClmR010v",params);
		return retrieveClmR010v;
	}

	@Override
	public List<CLMR010W> retrieveClmR010w(HashMap<String, Object> params) throws SQLException {
		List<CLMR010W> retrieveClmR010w = sqlSession.selectList("retrieveClmR010w",params);
		return retrieveClmR010w;
	}

	@Override
	public List<CLMR010X> retrieveClmR010x(HashMap<String, Object> params) throws SQLException {
		List<CLMR010X> retrieveClmR010x = sqlSession.selectList("retrieveClmR010x",params);
		return retrieveClmR010x;
	}

	@Override
	public List<POLR044OA> retrievePolR044oa(HashMap<String, Object> params) throws SQLException {
		List<POLR044OA> retrievePolR044oa = sqlSession.selectList("retrievePolR044oa",params);
		return retrievePolR044oa;
	}

	@Override
	public List<POLR044OB> retrievePolR044ob(HashMap<String, Object> params) throws SQLException {
		List<POLR044OB> retrievePolR044ob = sqlSession.selectList("retrievePolR044ob",params);
		return retrievePolR044ob;
	}

	@Override
	public List<POLR044W> retrievePolR044w(HashMap<String, Object> params) throws SQLException {
		List<POLR044W> retrievePolR044w = sqlSession.selectList("retrievePolR044w",params);
		return retrievePolR044w;
	}

	@Override
	public List<POLR044X> retrievePolR044x(HashMap<String, Object> params) throws SQLException {
		List<POLR044X> retrievePolR044x = sqlSession.selectList("retrievePolR044x",params);
		return retrievePolR044x;
	}

	@Override
	public List<POLR044Y> retrievePolR044y(HashMap<String, Object> params) throws SQLException {
		List<POLR044Y> retrievePolR044y = sqlSession.selectList("retrievePolR044y",params);
		return retrievePolR044y;
	}

	@Override
	public List<CLMR010A> retrieveClmR010a(HashMap<String, Object> params) throws SQLException {
		List<CLMR010A> retrieveClmR010a = sqlSession.selectList("retrieveClmR010a",params);
		return retrieveClmR010a;
	}

	@Override
	public List<CLMR010C> retrieveClmR010c(HashMap<String, Object> params) throws SQLException {
		List<CLMR010C> retrieveClmR010c = sqlSession.selectList("retrieveClmR010c",params);
		return retrieveClmR010c;
	}

	@Override
	public List<CLMR010E> retrieveClmR010e(HashMap<String, Object> params) throws SQLException {
		List<CLMR010E> retrieveClmR010e = sqlSession.selectList("retrieveClmR010e",params);
		return retrieveClmR010e;
	}

	@Override
	public List<CLMR010G> retrieveClmR010g(HashMap<String, Object> params) throws SQLException {
		List<CLMR010G> retrieveClmR010g = sqlSession.selectList("retrieveClmR010g",params);
		return retrieveClmR010g;
	}

	@Override
	public List<CLMR010L> retrieveClmR010l(HashMap<String, Object> params) throws SQLException {
		List<CLMR010L> retrieveClmR010l = sqlSession.selectList("retrieveClmR010l",params);
		return retrieveClmR010l;
	}

	@Override
	public List<CLMR010F> retrieveClmR010f(HashMap<String, Object> params) throws SQLException {
		List<CLMR010F> retrieveClmR010f = sqlSession.selectList("retrieveClmR010f",params);
		return retrieveClmR010f;
	}

	@Override
	public List<CLMR010Q> retrieveClmR010q(HashMap<String, Object> params) throws SQLException {
		List<CLMR010Q> retrieveClmR010q = sqlSession.selectList("retrieveClmR010q",params);
		return retrieveClmR010q;
	}

	@Override
	public List<CLMR010R> retrieveClmR010r(HashMap<String, Object> params) throws SQLException {
		List<CLMR010R> retrieveClmR010r = sqlSession.selectList("retrieveClmR010r",params);
		return retrieveClmR010r;
	}

	@Override
	public List<POLR052D> retrievePolR052d(HashMap<String, Object> params) throws SQLException {
		List<POLR052D> retrievePolR052d = sqlSession.selectList("retrievePolR052d",params);
		return retrievePolR052d;
	}

	@Override
	public List<POLR052G> retrievePolR052g(HashMap<String, Object> params) throws SQLException {
		List<POLR052G> retrievePolR052g = sqlSession.selectList("retrievePolR052g",params);
		return retrievePolR052g;
	}

	@Override
	public List<POLR052H> retrievePolR052h(HashMap<String, Object> params) throws SQLException {
		List<POLR052H> retrievePolR052h = sqlSession.selectList("retrievePolR052h",params);
		return retrievePolR052h;
	}

	@Override
	public List<POLR052I> retrievePolR052i(HashMap<String, Object> params) throws SQLException {
		List<POLR052I> retrievePolR052i = sqlSession.selectList("retrievePolR052i",params);
		return retrievePolR052i;
	}

	@Override
	public List<ACITR063A> retrieveAcitR063a(HashMap<String, Object> params) throws SQLException {
		List<ACITR063A> retrieveAcitR063a = sqlSession.selectList("retrieveAcitR063a",params);
		return retrieveAcitR063a;
	}

	@Override
	public List<ACITR066A> retrieveAcitR066a(HashMap<String, Object> params) throws SQLException {
		List<ACITR066A> retrieveAcitR066a = sqlSession.selectList("retrieveAcitR066a",params);
		return retrieveAcitR066a;
	}

	@Override
	public List<ACITR066B> retrieveAcitR066b(HashMap<String, Object> params) throws SQLException {
		List<ACITR066B> retrieveAcitR066b = sqlSession.selectList("retrieveAcitR066b",params);
		return retrieveAcitR066b;
	}

	@Override
	public List<ACITR066EF> retrieveAcitR066ef(HashMap<String, Object> params) throws SQLException {
		List<ACITR066EF> retrieveAcitR066ef = sqlSession.selectList("retrieveAcitR066ef",params);
		return retrieveAcitR066ef;
	}

	@Override
	public List<ACITR066C> retrieveAcitR066c(HashMap<String, Object> params) throws SQLException {
		List<ACITR066C> retrieveAcitR066c = sqlSession.selectList("retrieveAcitR066c",params);
		return retrieveAcitR066c;
	}

	@Override
	public List<POLR044V> retrievePolR044v(HashMap<String, Object> params) throws SQLException {
		List<POLR044V> retrievePolR044v = sqlSession.selectList("retrievePolR044v",params);
		return retrievePolR044v;
	}

	@Override
	public List<ACITR066D> retrieveAcitR066d(HashMap<String, Object> params) throws SQLException {
		List<ACITR066D> retrieveAcitR066d = sqlSession.selectList("retrieveAcitR066d",params);
		return retrieveAcitR066d;
	}

	@Override
	public List<ACSER024B> retrieveAcseR024b(HashMap<String, Object> params) throws SQLException {
		List<ACSER024B> retrieveAcseR024b = sqlSession.selectList("retrieveAcseR024b",params);
		return retrieveAcseR024b;
	}

	@Override
	public List<ACSER024CD> retrieveAcseR024c(HashMap<String, Object> params) throws SQLException {
		List<ACSER024CD> retrieveAcseR024c = sqlSession.selectList("retrieveAcseR024c",params);
		return retrieveAcseR024c;
	}
	
	@Override
	public List<ACSER024CD> retrieveAcseR024d(HashMap<String, Object> params) throws SQLException {
		List<ACSER024CD> retrieveAcseR024d = sqlSession.selectList("retrieveAcseR024d",params);
		return retrieveAcseR024d;
	}

	@Override
	public List<ACSER004> retrieveAcseR004(HashMap<String, Object> params) throws SQLException {
		List<ACSER004> retrieveAcseR004 = sqlSession.selectList("retrieveAcseR004",params);
		return retrieveAcseR004;
	}

	@Override
	public List<ACSER024A> retrieveAcseR024a(HashMap<String, Object> params) throws SQLException {
		List<ACSER024A> retrieveAcseR024a = sqlSession.selectList("retrieveAcseR024a",params);
		return retrieveAcseR024a;
	}

	@Override
	public List<ACITR050B> retrieveAcitR050b(HashMap<String, Object> params) throws SQLException {
		List<ACITR050B> retrieveAcitR050b = sqlSession.selectList("retrieveAcitR050b",params);
		return retrieveAcitR050b;
	}

	@Override
	public List<ACITR050C> retrieveAcitR050c(HashMap<String, Object> params) throws SQLException {
		List<ACITR050C> retrieveAcitR050c = sqlSession.selectList("retrieveAcitR050c",params);
		return retrieveAcitR050c;
	}

	@Override
	public List<ACITR050D> retrieveAcitR050d(HashMap<String, Object> params) throws SQLException {
		List<ACITR050D> retrieveAcitR050d = sqlSession.selectList("retrieveAcitR050d",params);
		return retrieveAcitR050d;
	}

	@Override
	public List<ACITR061A> retrieveAcitR061a(HashMap<String, Object> params) throws SQLException {
		List<ACITR061A> retrieveAcitR061a = sqlSession.selectList("retrieveAcitR061a",params);
		return retrieveAcitR061a;
	}

	@Override
	public List<ACITR061B> retrieveAcitR061b(HashMap<String, Object> params) throws SQLException {
		List<ACITR061B> retrieveAcitR061b = sqlSession.selectList("retrieveAcitR061b",params);
		return retrieveAcitR061b;
	}

	@Override
	public List<ACITR061C> retrieveAcitR061c(HashMap<String, Object> params) throws SQLException {
		List<ACITR061C> retrieveAcitR061c = sqlSession.selectList("retrieveAcitR061c",params);
		return retrieveAcitR061c;
	}

	@Override
	public List<ACITR061D> retrieveAcitR061d(HashMap<String, Object> params) throws SQLException {
		List<ACITR061D> retrieveAcitR061d = sqlSession.selectList("retrieveAcitR061d",params);
		return retrieveAcitR061d;
	}

	@Override
	public List<POLR044Z> retrievePolR044z(HashMap<String, Object> params) throws SQLException {
		List<POLR044Z> retrievePolR044z = sqlSession.selectList("retrievePolR044z",params);
		return retrievePolR044z;
	}

	@Override
	public List<POLR044HA> retrievePolR044ha(HashMap<String, Object> params) throws SQLException {
		List<POLR044HA> retrievePolR044ha = sqlSession.selectList("retrievePolR044ha",params);
		return retrievePolR044ha;
	}

	@Override
	public List<CLMR010BE> retrieveClmR010be(HashMap<String, Object> params) throws SQLException {
		List<CLMR010BE> retrieveClmR010be = sqlSession.selectList("retrieveClmR010be",params);
		return retrieveClmR010be;
	}

	@Override
	public List<CLMR010NE> retrieveClmR010ne(HashMap<String, Object> params) throws SQLException {
		List<CLMR010NE> retrieveClmR010ne = sqlSession.selectList("retrieveClmR010ne",params);
		return retrieveClmR010ne;
	}

	@Override
	public List<CLMR010ME> retrieveClmR010me(HashMap<String, Object> params) throws SQLException {
		List<CLMR010ME> retrieveClmR010me = sqlSession.selectList("retrieveClmR010me",params);
		return retrieveClmR010me;
	}

	@Override
	public List<CLMR010Y> retrieveClmR010y(HashMap<String, Object> params) throws SQLException {
		List<CLMR010Y> retrieveClmR010y = sqlSession.selectList("retrieveClmR010y",params);
		return retrieveClmR010y;
	}

	@Override
	public List<POLR044JA> retrievePolR044ja(HashMap<String, Object> params) throws SQLException {
		List<POLR044JA> retrievePolR044ja = sqlSession.selectList("retrievePolR044ja",params);
		return retrievePolR044ja;
	}

	@Override
	public List<POLR052AA> retrievePolR052aa(HashMap<String, Object> params) throws SQLException {
		List<POLR052AA> retrievePolR052aa = sqlSession.selectList("retrievePolR052aa",params);
		return retrievePolR052aa;
	}

	@Override
	public List<POLR052BA> retrievePolR052ba(HashMap<String, Object> params) throws SQLException {
		List<POLR052BA> retrievePolR052ba = sqlSession.selectList("retrievePolR052ba",params);
		return retrievePolR052ba;
	}

	@Override
	public List<POLR052CA> retrievePolR052ca(HashMap<String, Object> params) throws SQLException {
		List<POLR052CA> retrievePolR052ca = sqlSession.selectList("retrievePolR052ca",params);
		return retrievePolR052ca;
	}

	@Override
	public List<POLR044Q2> retrievePolR044q2(HashMap<String, Object> params) throws SQLException {
		List<POLR044Q2> retrievePolR044q2 = sqlSession.selectList("retrievePolR044q2",params);
		return retrievePolR044q2;
	}
	
	@Override
	public List<POLR044Q2> retrievePolR044qa2(HashMap<String, Object> params) throws SQLException {
		List<POLR044Q2> retrievePolR044qa2 = sqlSession.selectList("retrievePolR044qa2",params);
		return retrievePolR044qa2;
	}

	@Override
	public List<POLR044KA> retrievePolR044ka(HashMap<String, Object> params) throws SQLException {
		List<POLR044KA> retrievePolR044ka = sqlSession.selectList("retrievePolR044ka",params);
		return retrievePolR044ka;
	}

	@Override
	public List<CLMR010HA> retrieveClmR010ha(HashMap<String, Object> params) throws SQLException {
		List<CLMR010HA> retrieveClmR010ha = sqlSession.selectList("retrieveClmR010ha",params);
		return retrieveClmR010ha;
	}

	@Override
	public List<CLMR010IA> retrieveClmR010ia(HashMap<String, Object> params) throws SQLException {
		List<CLMR010IA> retrieveClmR010ia = sqlSession.selectList("retrieveClmR010ia",params);
		return retrieveClmR010ia;
	}

	@Override
	public List<CLMR010AP> retrieveClmR010ap(HashMap<String, Object> params) throws SQLException {
		List<CLMR010AP> retrieveClmR010ap = sqlSession.selectList("retrieveClmR010ap",params);
		return retrieveClmR010ap;
	}

	@Override
	public List<CLMR010ZO> retrieveClmR010zo(HashMap<String, Object> params) throws SQLException {
		List<CLMR010ZO> retrieveClmR010zo = sqlSession.selectList("retrieveClmR010zo",params);
		return retrieveClmR010zo;
	}

	@Override
	public List<CLMR010ZP> retrieveClmR010zp(HashMap<String, Object> params) throws SQLException {
		List<CLMR010ZP> retrieveClmR010zp = sqlSession.selectList("retrieveClmR010zp",params);
		return retrieveClmR010zp;
	}

	@Override
	public List<POLR044YA> retrievePolR044ya(HashMap<String, Object> params) throws SQLException {
		List<POLR044YA> retrievePolR044ya = sqlSession.selectList("retrievePolR044ya",params);
		return retrievePolR044ya;
	}

	@Override
	public List<ACITR058_CSV> retrieveAcitR058(HashMap<String, Object> params) throws SQLException {
		List<ACITR058_CSV> retrieveAcitR058 = sqlSession.selectList("retrieveAcitR058",params);
		return retrieveAcitR058;
	}

	@Override
	public List<ACSER007_CSV> retrieveAcseR007(HashMap<String, Object> params) throws SQLException {
		List<ACSER007_CSV> retrieveAcseR007 = sqlSession.selectList("retrieveAcseR007",params);
		return retrieveAcseR007;
	}

	@Override
	public List<ACITR059_CSV> retrieveAcitR059(HashMap<String, Object> params) throws SQLException {
		List<ACITR059_CSV> retrieveAcitR059 = sqlSession.selectList("retrieveAcitR059",params);
		return retrieveAcitR059;
	}

	@Override
	public List<ACSER008_CSV> retrieveAcseR008(HashMap<String, Object> params) throws SQLException {
		List<ACSER008_CSV> retrieveAcseR008 = sqlSession.selectList("retrieveAcseR008",params);
		return retrieveAcseR008;
	}

	@Override
	public List<POLR044U> retrievePolR044u(HashMap<String, Object> params) throws SQLException {
		List<POLR044U> retrievePolR044u = sqlSession.selectList("retrievePolR044u",params);
		return retrievePolR044u;
	}

	@Override
	public List<CLMR010A2> retrieveClmR010a2(HashMap<String, Object> params) throws SQLException {
		List<CLMR010A2> retrieveClmR010a2 = sqlSession.selectList("retrieveClmR010a2",params);
		return retrieveClmR010a2;
	}

	@Override
	public List<CLMR010AP2> retrieveClmR010ap2(HashMap<String, Object> params) throws SQLException {
		List<CLMR010AP2> retrieveClmR010ap2 = sqlSession.selectList("retrieveClmR010ap2",params);
		return retrieveClmR010ap2;
	}
	
	@Override
	public List<ACSER024CD> retrieveAcseR024cd(HashMap<String, Object> retcParams) throws SQLException {
		List<ACSER024CD> retrieveAcseR024cd = sqlSession.selectList("retrieveAcseR024cd",retcParams);
		return retrieveAcseR024cd;
	}

	@Override
	public List<CLMR052A> retrieveClmR052a(HashMap<String, Object> params) throws SQLException {
		List<CLMR052A> retrieveClmR052a = sqlSession.selectList("retrieveClmR052a",params);
		return retrieveClmR052a;
	}

	@Override
	public List<CLMR052B> retrieveClmR052b(HashMap<String, Object> params) throws SQLException {
		List<CLMR052B> retrieveClmR052b = sqlSession.selectList("retrieveClmR052b",params);
		return retrieveClmR052b;
	}

	@Override
	public List<ACITR066H> retrieveAcitR066h(HashMap<String, Object> params) throws SQLException {
		List<ACITR066H> retrieveAcitR066h = sqlSession.selectList("retrieveAcitR066h",params);
		return retrieveAcitR066h;
	}

	@Override
	public List<ACSER024F> retrieveAcseR024f(HashMap<String, Object> params) throws SQLException {
		List<ACSER024F> retrieveAcseR024f = sqlSession.selectList("retrieveAcseR024f",params);
		return retrieveAcseR024f;
	}

	@Override
	public List<POLR052AB> retrievePolR052ab(HashMap<String, Object> params) throws SQLException {
		List<POLR052AB> retrievePolR052ab = sqlSession.selectList("retrievePolR052ab",params);
		return retrievePolR052ab;
	}

	@Override
	public List<POLR052BB> retrievePolR052bb(HashMap<String, Object> params) throws SQLException {
		List<POLR052BB> retrievePolR052bb = sqlSession.selectList("retrievePolR052bb",params);
		return retrievePolR052bb;
	}

	@Override
	public List<POLR052CB> retrievePolR052cb(HashMap<String, Object> params) throws SQLException {
		List<POLR052CB> retrievePolR052cb = sqlSession.selectList("retrievePolR052cb",params);
		return retrievePolR052cb;
	}

	@Override
	public List<CLMR010ZAO> retrieveClmR010zao(HashMap<String, Object> params) throws SQLException {
		List<CLMR010ZAO> retrieveClmR010zao = sqlSession.selectList("retrieveClmR010zao",params);
		return retrieveClmR010zao;
	}

	@Override
	public List<CLMR010ZAP> retrieveClmR010zap(HashMap<String, Object> params) throws SQLException {
		List<CLMR010ZAP> retrieveClmR010zap = sqlSession.selectList("retrieveClmR010zap",params);
		return retrieveClmR010zap;
	}

	@Override
	public List<POLR044RA> retrievePolR044ra(HashMap<String, Object> params) throws SQLException {
		List<POLR044RA> retrievePolR044ra = sqlSession.selectList("retrievePolR044ra",params);
		return retrievePolR044ra;
	}

	@Override
	public List<POLR044SA> retrievePolR044sa(HashMap<String, Object> params) throws SQLException {
		List<POLR044SA> retrievePolR044sa = sqlSession.selectList("retrievePolR044sa",params);
		return retrievePolR044sa;
	}

	@Override
	public List<POLR052J> retrievePolR052j(HashMap<String, Object> params) throws SQLException {
		List<POLR052J> retrievePolR052j = sqlSession.selectList("retrievePolR052j",params);
		return retrievePolR052j;
	}

	@Override
	public List<POLR052K> retrievePolR052k(HashMap<String, Object> params) throws SQLException {
		List<POLR052K> retrievePolR052k = sqlSession.selectList("retrievePolR052k",params);
		return retrievePolR052k;
	}

	@Override
	public List<CLMR052AA> retrieveClmR052aa(HashMap<String, Object> params) throws SQLException {
		List<CLMR052AA> retrieveClmR052aa = sqlSession.selectList("retrieveClmR052aa",params);
		return retrieveClmR052aa;
	}

	@Override
	public List<CLMR052BA> retrieveClmR052ba(HashMap<String, Object> params) throws SQLException {
		List<CLMR052BA> retrieveClmR052ba = sqlSession.selectList("retrieveClmR052ba",params);
		return retrieveClmR052ba;
	}

	@Override
	public List<POLR044WQ> retrievePolR044wq(HashMap<String, Object> params) throws SQLException {
		List<POLR044WQ> retrievePolR044wq = sqlSession.selectList("retrievePolR044wq",params);
		return retrievePolR044wq;
	}

	@Override
	public List<POLR044E> retrievePolR044ea(HashMap<String, Object> params) throws SQLException {
		List<POLR044E> retrievePolR044ea = sqlSession.selectList("retrievePolR044ea",params);
		return retrievePolR044ea;
	}

	@Override
	public List<POLR044I> retrievePolR044ia(HashMap<String, Object> params) throws SQLException {
		List<POLR044I> retrievePolR044ia = sqlSession.selectList("retrievePolR044ia",params);
		return retrievePolR044ia;
	}

	@Override
	public List<ACSER060A> retrieveAcseR060a(HashMap<String, Object> params) throws SQLException {
		List<ACSER060A> retrieveAcseR060a = sqlSession.selectList("retrieveAcseR060a",params);
		return retrieveAcseR060a;
	}

	@Override
	public List<ACSER060B> retrieveAcseR060b(HashMap<String, Object> params) throws SQLException {
		List<ACSER060B> retrieveAcseR060b = sqlSession.selectList("retrieveAcseR060b",params);
		return retrieveAcseR060b;
	}

	@Override
	public List<ACSER060C> retrieveAcseR060c(HashMap<String, Object> params) throws SQLException {
		List<ACSER060C> retrieveAcseR060c = sqlSession.selectList("retrieveAcseR060c",params);
		return retrieveAcseR060c;
	}

	@Override
	public List<ACSER060D> retrieveAcseR060d(HashMap<String, Object> params) throws SQLException {
		List<ACSER060D> retrieveAcseR060d = sqlSession.selectList("retrieveAcseR060d",params);
		return retrieveAcseR060d;
	}

	@Override
	public List<ACITR066J> retrieveAcitR066j(HashMap<String, Object> params) throws SQLException {
		List<ACITR066J> retrieveAcitR066j = sqlSession.selectList("retrieveAcitR066j",params);
		return retrieveAcitR066j;
	}
	
	@Override
	public List<POLR044SB> retrievePolR044sb(HashMap<String, Object> params) throws SQLException {
		List<POLR044SB> retrievePolR044sb = sqlSession.selectList("retrievePolR044sb",params);
		return retrievePolR044sb;
	}
	
	@Override
	public List<POLR044SC> retrievePolR044sc(HashMap<String, Object> params) throws SQLException {
		List<POLR044SC> retrievePolR044sc = sqlSession.selectList("retrievePolR044sc",params);
		return retrievePolR044sc;
	}
}
