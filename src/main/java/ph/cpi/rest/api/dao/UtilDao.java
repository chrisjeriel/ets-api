package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.utils.*;

public interface UtilDao {
	
	public Integer extractReport(final HashMap<String, Object> params) throws SQLException;
	public String getReportFileName(final HashMap<String, Object> params) throws SQLException;
	public String getReportPath() throws SQLException;
	
	public List<POLR044E> retrievePolR044e(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044A> retrievePolR044a(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044B> retrievePolR044b(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044C> retrievePolR044c(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044D> retrievePolR044d(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044F> retrievePolR044f(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044G> retrievePolR044g(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044H> retrievePolR044h(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044HA> retrievePolR044ha(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044I> retrievePolR044i(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044J> retrievePolR044j(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044JA> retrievePolR044ja(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044K> retrievePolR044k(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044KA> retrievePolR044ka(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044L> retrievePolR044l(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044M> retrievePolR044m(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044N> retrievePolR044n(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044O> retrievePolR044o(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044OA> retrievePolR044oa(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044OB> retrievePolR044ob(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044P> retrievePolR044p(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044Q> retrievePolR044q(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044Q2> retrievePolR044q2(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044Q> retrievePolR044qa(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044Q2> retrievePolR044qa2(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044R> retrievePolR044r(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044S> retrievePolR044s(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044T> retrievePolR044t(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044U> retrievePolR044u(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044V> retrievePolR044v(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044W> retrievePolR044w(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044X> retrievePolR044x(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044Y> retrievePolR044y(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044YA> retrievePolR044ya(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044Z> retrievePolR044z(final HashMap<String, Object> params ) throws SQLException;
	
	public List<POLR052A> retrievePolR052a(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052AA> retrievePolR052aa(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052AB> retrievePolR052ab(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052BB> retrievePolR052bb(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052B> retrievePolR052b(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052BA> retrievePolR052ba(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052C> retrievePolR052c(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052CA> retrievePolR052ca(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052CB> retrievePolR052cb(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052D> retrievePolR052d(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052E> retrievePolR052e(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052F> retrievePolR052f(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052G> retrievePolR052g(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052H> retrievePolR052h(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052I> retrievePolR052i(final HashMap<String, Object> params ) throws SQLException;
	
	public List<CLMR010A> retrieveClmR010a(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010A2> retrieveClmR010a2(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010AP> retrieveClmR010ap(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010AP2> retrieveClmR010ap2(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010B> retrieveClmR010b(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010BE> retrieveClmR010be(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010C> retrieveClmR010c(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010D> retrieveClmR010d(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010H> retrieveClmR010h(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010HA> retrieveClmR010ha(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010E> retrieveClmR010e(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010F> retrieveClmR010f(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010G> retrieveClmR010g(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010I> retrieveClmR010i(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010IA> retrieveClmR010ia(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010J> retrieveClmR010j(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010K> retrieveClmR010k(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010L> retrieveClmR010l(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010M> retrieveClmR010m(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010ME> retrieveClmR010me(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010N> retrieveClmR010n(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010NE> retrieveClmR010ne(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010O> retrieveClmR010o(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010P> retrieveClmR010p(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010Q> retrieveClmR010q(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010R> retrieveClmR010r(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010S> retrieveClmR010s(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010T> retrieveClmR010t(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010U> retrieveClmR010u(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010V> retrieveClmR010v(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010W> retrieveClmR010w(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010X> retrieveClmR010x(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010Y> retrieveClmR010y(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010ZO> retrieveClmR010zo(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010ZP> retrieveClmR010zp(final HashMap<String, Object> params ) throws SQLException;
	
	public List<ACITR063A> retrieveAcitR063a(final HashMap<String, Object> params ) throws SQLException;
	
	public List<ACITR066A> retrieveAcitR066a(final HashMap<String, Object> params ) throws SQLException;
	public List<ACITR066B> retrieveAcitR066b(final HashMap<String, Object> params ) throws SQLException;
	public List<ACITR066C> retrieveAcitR066c(final HashMap<String, Object> params ) throws SQLException;
	public List<ACITR066D> retrieveAcitR066d(final HashMap<String, Object> params ) throws SQLException;
	public List<ACITR066EF> retrieveAcitR066ef(final HashMap<String, Object> params ) throws SQLException;
	public List<ACITR066H> retrieveAcitR066h(final HashMap<String, Object> params ) throws SQLException;
	
	public List<ACSER024A> retrieveAcseR024a(final HashMap<String, Object> params ) throws SQLException;
	public List<ACSER024B> retrieveAcseR024b(final HashMap<String, Object> params ) throws SQLException;
	public List<ACSER024CD> retrieveAcseR024c(final HashMap<String, Object> params ) throws SQLException;
	public List<ACSER024CD> retrieveAcseR024d(final HashMap<String, Object> params ) throws SQLException;
	public List<ACSER024F> retrieveAcseR024f(final HashMap<String, Object> params ) throws SQLException;
	
	public List<ACSER004> retrieveAcseR004(final HashMap<String, Object> params ) throws SQLException;
	
	public List<ACITR050B> retrieveAcitR050b(final HashMap<String, Object> params ) throws SQLException;
	public List<ACITR050C> retrieveAcitR050c(final HashMap<String, Object> params ) throws SQLException;
	public List<ACITR050D> retrieveAcitR050d(final HashMap<String, Object> params ) throws SQLException;
	
	public List<ACITR061A> retrieveAcitR061a(final HashMap<String, Object> params ) throws SQLException;
	public List<ACITR061B> retrieveAcitR061b(final HashMap<String, Object> params ) throws SQLException;
	public List<ACITR061C> retrieveAcitR061c(final HashMap<String, Object> params ) throws SQLException;
	public List<ACITR061D> retrieveAcitR061d(final HashMap<String, Object> params ) throws SQLException;
	
	public List<ACITR058_CSV> retrieveAcitR058(final HashMap<String, Object> params ) throws SQLException;
	public List<ACITR059_CSV> retrieveAcitR059(final HashMap<String, Object> params ) throws SQLException;
	public List<ACSER007_CSV> retrieveAcseR007(final HashMap<String, Object> params ) throws SQLException;
	public List<ACSER008_CSV> retrieveAcseR008(final HashMap<String, Object> params ) throws SQLException;
	public List<ACSER024CD> retrieveAcseR024cd(HashMap<String, Object> retcParams) throws SQLException;

	public List<CLMR052A> retrieveClmR052a(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR052B> retrieveClmR052b(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010ZAO> retrieveClmR010zao(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010ZAP> retrieveClmR010zap(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044RA> retrievePolR044ra(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044SA> retrievePolR044sa(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052J> retrievePolR052j(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052K> retrievePolR052k(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR052AA> retrieveClmR052aa(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR052BA> retrieveClmR052ba(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044WQ> retrievePolR044wq(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044E> retrievePolR044ea(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044I> retrievePolR044ia(final HashMap<String, Object> params ) throws SQLException;
}
