package dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalDateTimeType;
import org.hibernate.type.LocalTimeType;
import org.hibernate.type.StringType;

import dto.MatHangEx1Dto;
import dto.MatHangEx2Dto;

public class MatHangDao extends AbstractHibernateDao {
	public List<MatHangEx1Dto> getMatHangByDate(LocalDate date) {
		List<MatHangEx1Dto> result = new ArrayList<MatHangEx1Dto>();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			String sql = "SELECT m.MaMH AS" + MatHangEx1Dto.MA_MH + ", m.TenMH AS" + MatHangEx1Dto.TEN_MH
					+ ", cast(d.NgayTao as time) ThoiGianDatHang \n AS" + MatHangEx1Dto.THOI_GIAN_DAT_HANG + " FROM mathang m \n"
					+ "JOIN chitietdonhang c ON m.MaMH = c.MaMH\n" + "JOIN donhang d ON c.MaDH = d.MaDH\n"
					+ "WHERE d.NgayTao = :date";
			NativeQuery<?> query = session.createNativeQuery(sql);
			query.setParameter("date", date, LocalTimeType.INSTANCE);
			query.addScalar(MatHangEx1Dto.MA_MH, IntegerType.INSTANCE)
					.addScalar(MatHangEx1Dto.TEN_MH, StringType.INSTANCE)
					.addScalar(MatHangEx1Dto.THOI_GIAN_DAT_HANG, LocalTimeType.INSTANCE)
					.setResultTransformer(Transformers.aliasToBean(MatHangEx1Dto.class));
			result = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
	
	public List<MatHangEx2Dto> getMatHangTonKho() {
		List<MatHangEx2Dto> result = new ArrayList<MatHangEx2Dto>();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			String sql = "SELECT maMH AS" + MatHangEx2Dto.MA_MH + ", TenMH" + MatHangEx2Dto.TEN_MH + ", SoLuong\n AS" + MatHangEx2Dto.SO_LUONG
					+ "FROM mathang;";
			NativeQuery<?> query = session.createNativeQuery(sql);
			query.addScalar(MatHangEx2Dto.MA_MH, IntegerType.INSTANCE)
					.addScalar(MatHangEx2Dto.TEN_MH, StringType.INSTANCE)
					.addScalar(MatHangEx2Dto.SO_LUONG, IntegerType.INSTANCE)
					.setResultTransformer(Transformers.aliasToBean(MatHangEx1Dto.class));
			result = safeList(query);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
