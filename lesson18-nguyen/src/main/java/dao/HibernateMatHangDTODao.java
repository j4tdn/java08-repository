package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistance.MatHangDTO;

public class HibernateMatHangDTODao extends AbstractHibernateDao implements MatHangDTODao {
	@SuppressWarnings("deprecation")
	public List<MatHangDTO> getValues() {
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		
		String sql = "SELECT ml.MaLoai, ml.TenLoai, mh.MaMH, mh.TenMH, mh.GiaBan, mh.GiaMua, mh.SoLuong \n"
				+"FROM mathang mh \n"
				+"JOIN loaihang ml \n"
				+"WHERE mh.MaLoai = ml.MaLoai";
		List<MatHangDTO> result = new ArrayList<MatHangDTO>();
		
		NativeQuery<?> query = session.createNativeQuery(sql);
		
		query.addScalar(MatHangDTO.MA_LOAI, StandardBasicTypes.INTEGER)
		.addScalar(MatHangDTO.TEN_LOAI, StandardBasicTypes.STRING)
		.addScalar(MatHangDTO.MA_MH, StandardBasicTypes.INTEGER)
		.addScalar(MatHangDTO.TEN_MH, StandardBasicTypes.STRING)
		.addScalar(MatHangDTO.GIA_BAN, StandardBasicTypes.INTEGER)
		.addScalar(MatHangDTO.GIA_MUA, StandardBasicTypes.INTEGER)
		.addScalar(MatHangDTO.SO_LUONG, StandardBasicTypes.INTEGER)
		.setResultTransformer(Transformers.aliasToBean(MatHangDTO.class));
		
		result = safeList(query);
		
		//result = query.getResultList();	
		transaction.commit();
				
		return result;
	}

}
