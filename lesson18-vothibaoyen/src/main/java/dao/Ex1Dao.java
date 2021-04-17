package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Ex01;

public class Ex1Dao extends AbstractHibernateDao{
	

	public  List<Ex01>getDate(LocalDate localdate) {
		List<Ex01> result = new ArrayList<Ex01>();
		Session session= getCurrentSession();
		Transaction transaction= session.beginTransaction();
		try {
			String quer="select MaMH AS "+Ex01.MA_MH+", tenMH AS "+Ex01.TEN_MH+", NgayTao AS "+Ex01.NGAY_TAO+" \n" + 
					"from  mathang mh join donhang dh\n where NgayTao ='2020-12-18'";
			NativeQuery<?> query =session.createNativeQuery(quer);
			query.addScalar(Ex01.MA_MH, StandardBasicTypes.STRING)
				.addScalar(Ex01.TEN_MH, StandardBasicTypes.STRING)
				.addScalar(Ex01.NGAY_TAO, StandardBasicTypes.STRING)
				.setResultTransformer(Transformers.aliasToBean(Ex01.class));
			result=safeList(query);
		} catch (Exception e) {
			transaction.rollback();
		}

		transaction.commit();
		
		return result;
		
	}

	@Override
	public String toString() {
		return "Ex1Dao [getCurrentSession()=" + getCurrentSession() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
