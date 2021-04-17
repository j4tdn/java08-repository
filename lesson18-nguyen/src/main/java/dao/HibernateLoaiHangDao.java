package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistance.LoaiMatHangDTO;
import persistance.MatHangDTO;

public class HibernateLoaiHangDao extends AbstractHibernateDao implements LoaiHangDTODao {

	public List<LoaiMatHangDTO> getvalues() {
		Session session = getCurreSession();
		Transaction transaction = session.beginTransaction();
		
		String sql = "SELECT ml.MaLoai, ml.TenLoai, mh.SoLuong \n"
				+"FROM loaihang ml \n"
				+"JOIN mathang mh \n"
				+"WHERE mh.MaLoai = ml.MaLoai";
		List<LoaiMatHangDTO> result = new ArrayList<LoaiMatHangDTO>();
		
		NativeQuery<?> query = session.createNativeQuery(sql);
		
		query.addScalar(LoaiMatHangDTO.MA_LOAI, StandardBasicTypes.INTEGER)
		.addScalar(LoaiMatHangDTO.TEN_LOAI, StandardBasicTypes.STRING)
		.addScalar(LoaiMatHangDTO.SO_LUONG, StandardBasicTypes.INTEGER)
		.setResultTransformer(Transformers.aliasToBean(MatHangDTO.class));
		
		result = safeList(query);
		
		//result = query.getResultList();	
		transaction.commit();
				
		return result;
	}

}
