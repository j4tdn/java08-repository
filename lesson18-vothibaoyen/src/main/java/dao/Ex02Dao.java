package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Ex02;

public class Ex02Dao extends AbstractHibernateDao {

	public List<persistence.Ex02> GetSoLuong() {
		List<Ex02> result = new ArrayList<Ex02>();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			String quer = "select lh.MaLoai AS " + Ex02.MA_LOAI + ",TenLoai AS " + Ex02.TEN_LOAI + " , SoLuong AS "
					+ Ex02.SO_LUONG + " \n" + "from  mathang mh join loaihang lh on mh.MaLoai=lh.MaLoai";

			NativeQuery<?> query = session.createNativeQuery(quer);
			query.addScalar(Ex02.MA_LOAI, StandardBasicTypes.STRING)
					.addScalar(Ex02.TEN_LOAI, StandardBasicTypes.STRING)
					.addScalar(Ex02.SO_LUONG, StandardBasicTypes.STRING)
					.setResultTransformer(Transformers.aliasToBean(Ex02.class));
			result = safeList(query);
		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		return result;
	}

	@Override
	public String toString() {
		return "Ex02Dao [getCurrentSession()=" + getCurrentSession() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
