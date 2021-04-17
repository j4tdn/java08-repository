package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Ex02;
import persistence.Ex04;

public class Ex04Dao extends AbstractHibernateDao {

	public List<Ex04> getMhLh(){
		List<Ex04> result = new ArrayList<Ex04>();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			String quer = "select lh.MaLoai AS " + Ex04.MA_LOAI + ",TenLoai AS " + Ex04.TEN_LOAI + " , SoLuong AS "
					+ Ex02.SO_LUONG + " , MaMH AS "+Ex04.MA_MH+" ,TenMH AS "+Ex04.TEN_MH+" , GiaBan AS "+ Ex04.GIA_BAN+",GiaMua AS "+Ex04.GIA_MUA+"\n" + "from  mathang mh join loaihang lh on mh.MaLoai=lh.MaLoai";

			NativeQuery<?> query = session.createNativeQuery(quer);
			query.addScalar(Ex04.MA_LOAI, StandardBasicTypes.STRING)
					.addScalar(Ex04.TEN_LOAI, StandardBasicTypes.STRING)
					.addScalar(Ex04.SO_LUONG, StandardBasicTypes.STRING)
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
		return "Ex04Dao [getCurrentSession()=" + getCurrentSession() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
		
	
}
