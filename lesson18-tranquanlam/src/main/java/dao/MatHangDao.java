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
			System.out.println(dateTao);
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
}
