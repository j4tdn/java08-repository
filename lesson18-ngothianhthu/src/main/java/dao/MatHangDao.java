package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import persistence.MatHang;
import utils.HibernateUtil;

public class MatHangDao {
	public List<MatHang> getMHang(LocalDate thoiGianDatHang) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		Transaction transaction = session.beginTransaction();

		List<MatHang> result = new ArrayList<>();
		try {
			String sql = "SELECT mh.MaMH, mh.TenMH, dh.NgayTao FROM mathang mh JOIN chitietdonhang ctdh ON ctdh.MaMH = mh.MaMH JOIN donhang dh ON dh.MaDH = ctdh.MaDH  WHERE dh.NgayTao = ?";
			NativeQuery<MatHang> query = session.createNativeQuery(sql, MatHang.class);

			query.setParameter("NgayTao", thoiGianDatHang);
			result = query.getResultList();

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return result;
	}
}

