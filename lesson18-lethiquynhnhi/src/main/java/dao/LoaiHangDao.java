package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import persistence.LoaiHangDto;
import persistence.MatHang;

import java.util.ArrayList;
import java.util.List;

public class LoaiHangDao extends AbstractHibernateDao {

    public List<LoaiHangDto> getRemainSumOfLoaiHangs(){
        List<LoaiHangDto> result = new ArrayList<>();
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        try {
            String sql = "SELECT lh.MaLoai, lh.TenLoai, sum(mh.SoLuong) AS SoLuong FROM loaihang lh\n" +
                    "JOIN mathang mh ON lh.MaLoai = mh.MaLoai\n" +
                    "GROUP BY lh.MaLoai";
            NativeQuery<?> query = session.createNativeQuery(sql);
            query.addScalar(LoaiHangDto.MA_LOAI, IntegerType.INSTANCE)
                    .addScalar(LoaiHangDto.TEN_LOAI, StringType.INSTANCE)
                    .addScalar(LoaiHangDto.SO_LUONG, IntegerType.INSTANCE)
                    .setResultTransformer(Transformers.aliasToBean(LoaiHangDto.class));
            result = safeList(query);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return result;
    }
}
