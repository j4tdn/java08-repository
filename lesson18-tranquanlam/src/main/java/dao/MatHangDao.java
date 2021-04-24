package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalDateTimeType;
import org.hibernate.type.LocalDateType;
import org.hibernate.type.StringType;

import persistence.MatHangDTORawData;

public class MatHangDao extends AbstracHibernateDao {
	
	public List<MatHangDTORawData> getMatHangInDate(LocalDate dateTao) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<MatHangDTORawData> matHangRaw = new ArrayList<MatHangDTORawData>();
		try {
			String query = "select m.MaMH AS " +  MatHangDTORawData.MA_MH
					+ ", m.TenMH AS " +  MatHangDTORawData.TEN_MH
					+ ", d.NgayTao AS " +  MatHangDTORawData.NGAY_TA0 + "\n"
					+ "from donhang d join chitietdonhang c on d.MaDH = c.MaDH join mathang m on m.MaMH = c.MaMH \n"
					+ "where cast(NgayTao AS DATE) = :dateTao";

			NativeQuery<?> nativeQuery = session.createNativeQuery(query);
			nativeQuery.setParameter("dateTao", dateTao, LocalDateType.INSTANCE);
			nativeQuery.addScalar(MatHangDTORawData.MA_MH, IntegerType.INSTANCE)
						.addScalar(MatHangDTORawData.TEN_MH, StringType.INSTANCE)
						.addScalar(MatHangDTORawData.NGAY_TA0, LocalDateTimeType.INSTANCE)
						.setResultTransformer(Transformers.aliasToBean(MatHangDTORawData.class));
			
			matHangRaw = safeList(nativeQuery);
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

		return matHangRaw;
	}
	
	public List<MatHangDTORawData> getTop3Sale() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<MatHangDTORawData> matHangRaw = new ArrayList<MatHangDTORawData>();
		try {
			String query = "SELECT  chitietdonhang.MaMH AS " +  MatHangDTORawData.MA_MH
					+ ", mathang.TenMH AS " +  MatHangDTORawData.TEN_MH
					+ ", sum(chitietdonhang.SoLuong) AS " +  MatHangDTORawData.SO_LUONG + "\n"
					+ "FROM java08_shopping.chitietdonhang join java08_shopping.mathang on  chitietdonhang.MaMH = mathang.MaMH \n"
					+ "group by chitietdonhang.MaMH \n"
					+ "order by " + MatHangDTORawData.SO_LUONG +" desc \n"
					+ "limit 3;";

			NativeQuery<?> nativeQuery = session.createNativeQuery(query);
			nativeQuery.addScalar(MatHangDTORawData.MA_MH, IntegerType.INSTANCE)
						.addScalar(MatHangDTORawData.TEN_MH, StringType.INSTANCE)
						.addScalar(MatHangDTORawData.SO_LUONG, IntegerType.INSTANCE)
						.setResultTransformer(Transformers.aliasToBean(MatHangDTORawData.class));
			
			matHangRaw = safeList(nativeQuery);
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

		return matHangRaw;
	}
}
