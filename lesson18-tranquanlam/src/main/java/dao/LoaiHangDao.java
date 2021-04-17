package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.LoaiHangRawDTO;

public class LoaiHangDao extends AbstracHibernateDao {
	
	public List<LoaiHangRawDTO> getLoaiHang() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<LoaiHangRawDTO> loaiHangRaw = new ArrayList<LoaiHangRawDTO>();
		try {
			String query = "select l.MaLoai AS " + LoaiHangRawDTO.MA_LOAI
					+ ", l.TenLoai AS " + LoaiHangRawDTO.TEN_LOAI
					+ ", m.SoLuong AS " + LoaiHangRawDTO.SO_LUONG + " \n"
					+ "from loaihang l join mathang m on l.MaLoai= m.MaLoai";

			NativeQuery<?> nativeQuery = session.createNativeQuery(query);
			nativeQuery.addScalar(LoaiHangRawDTO.MA_LOAI, IntegerType.INSTANCE)
						.addScalar(LoaiHangRawDTO.TEN_LOAI, StringType.INSTANCE)
						.addScalar(LoaiHangRawDTO.SO_LUONG, IntegerType.INSTANCE)
						.setResultTransformer(Transformers.aliasToBean(LoaiHangRawDTO.class));
			
			loaiHangRaw = safeList(nativeQuery);
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

		return loaiHangRaw;
	}
}
