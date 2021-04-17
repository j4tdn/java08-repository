package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalDateType;
import org.hibernate.type.LocalTimeType;
import org.hibernate.type.StringType;
import persistence.LoaiHangDto;
import persistence.MatHang;
import persistence.MatHangDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MatHangDao extends AbstractHibernateDao {

    public List<MatHangDto> getMatHangsByDate(LocalDate date) {
        List<MatHangDto> result = new ArrayList<>();
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        try {
            String sql = "SELECT mh.MaMH AS " + MatHangDto.MA_MH + ", mh.TenMH AS " + MatHangDto.TEN_MH + ", cast(dh.NgayTao AS TIME) AS " + MatHangDto.THOI_GIAN_DAT_HANG + " FROM mathang mh\n" +
                    "JOIN chitietdonhang ctdh ON mh.MaMH = ctdh.MaMH\n" +
                    "JOIN donhang dh ON ctdh.MaDH = dh.MaDH\n" +
                    "WHERE cast(dh.NgayTao AS DATE) = :date";
            NativeQuery<?> query = session.createNativeQuery(sql);
            query.setParameter("date", date, LocalDateType.INSTANCE);
            query.addScalar(MatHangDto.MA_MH, IntegerType.INSTANCE)
                    .addScalar(MatHangDto.TEN_MH, StringType.INSTANCE)
                    .addScalar(MatHangDto.THOI_GIAN_DAT_HANG, LocalTimeType.INSTANCE)
                    .setResultTransformer(Transformers.aliasToBean(MatHangDto.class));
            result = safeList(query);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return result;
    }

    public List<String> get3TopSalerInYear(int year){
        List<String> result = new ArrayList<>();
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        try {
            String sql = "SELECT mh.TenMH FROM chitietdonhang ctdh\n" +
                    "JOIN mathang mh ON ctdh.MaMH = mh.MaMH\n" +
                    "JOIN donhang dh ON ctdh.MaDH = dh.MaDH\n" +
                    "WHERE year(cast(dh.NgayTao AS DATE)) = :year \n" +
                    "ORDER BY ctdh.SoLuong DESC\n" +
                    "LIMIT 3";
            NativeQuery<?> query = session.createNativeQuery(sql);
            query.setParameter("year", year, IntegerType.INSTANCE);
            query.addScalar(MatHangDto.TEN_MH, StringType.INSTANCE);
            result = safeList(query);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return result;
    }

    public List<MatHang> getAllMatHangLoaiHang(){
        List<MatHang> result = new ArrayList<>();
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        try {
            String sql = "SELECT * FROM mathang";
            NativeQuery<MatHang> query = session.createNativeQuery(sql, MatHang.class);
            result = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return result;
    }
}
