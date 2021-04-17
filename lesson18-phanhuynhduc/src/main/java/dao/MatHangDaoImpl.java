package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.DoubleType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import persistence.InventoryCategory;
import persistence.ItemOfCategory;
import persistence.MatHang;

import java.lang.annotation.Native;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MatHangDaoImpl extends AbstractHibernateDao implements MatHangDao {
    @Override
    public List<MatHang> getMatHangBanNhieuNhat(int year) {

        List<MatHang> result = new ArrayList<>();

        Session session = getCurrentSession();

        Transaction transaction = session.beginTransaction();

        try {

            String sql = "SELECT * FROM mathang mh JOIN chitietdonhang ctdh on mh.MaMH = ctdh.MaMH join donhang dh on ctdh.MaDH = dh.MaDH where YEAR(dh.NgayTao) = :year ORDER BY ctdh.SoLuong DESC LIMIT 3 ";

            NativeQuery<MatHang> query = session.createNativeQuery(sql,MatHang.class);

            query.setParameter("year",year);


            result = query.getResultList();

            transaction.commit();

        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }


        return result;
    }

    @Override
    public List<MatHang> getMatHangInDate(LocalDate localDate) {
        return null;
    }

    @Override
    public List<InventoryCategory> getInventoryCategory() {

        Session session = getCurrentSession();

        Transaction transaction = session.beginTransaction();

        List<InventoryCategory> result = new ArrayList<>();


        try {

            String sql  = "SELECT lh.MaLoai,lh.TenLoai, mh.SoLuong FROM loaihang lh JOIN mathang mh ON lh.MaLoai = mh.MaLoai GROUP BY lh.MaLoai" ;

            NativeQuery<?> query = session.createNativeQuery(sql);

            query.addScalar(InventoryCategory.MALOAI, IntegerType.INSTANCE)
                    .addScalar(InventoryCategory.TENLOAI, StringType.INSTANCE)
                    .addScalar(InventoryCategory.SOLUONG,IntegerType.INSTANCE)
                    .setResultTransformer(Transformers.aliasToBean(InventoryCategory.class));

             result = safeList(query);


            transaction.commit();



        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }


        return result;
    }

    @Override
    public List<ItemOfCategory> getItemOfCategory() {

        Session session = getCurrentSession();

        Transaction transaction = session.beginTransaction();

        List<ItemOfCategory> result = new ArrayList<>();

        try {

            String sql = "select lh.MaLoai,lh.TenLoai,mh.MaMH,mh.TenMH,mh.GiaBan,mh.GiaMua, mh.SoLuong from loaihang lh join mathang mh on lh.MaLoai = mh.MaLoai " ;

            NativeQuery<?> query = session.createNativeQuery(sql);

            query.addScalar(ItemOfCategory.MALOAI,IntegerType.INSTANCE)
                    .addScalar(ItemOfCategory.TENLOAI,StringType.INSTANCE)
                    .addScalar(ItemOfCategory.MAMH,IntegerType.INSTANCE)
                    .addScalar(ItemOfCategory.TENMH,StringType.INSTANCE)
                    .addScalar(ItemOfCategory.GIABAN, DoubleType.INSTANCE)
                    .addScalar(ItemOfCategory.GIAMUA,DoubleType.INSTANCE)
                    .addScalar(ItemOfCategory.SOLUONG,IntegerType.INSTANCE)
                    .setResultTransformer(Transformers.aliasToBean(ItemOfCategory.class));


            result = safeList(query);

            transaction.commit();
        }
        catch(Exception e ){
            e.printStackTrace();
            transaction.rollback();
        }





        return result;
    }

    @Override
    public List<MatHang> getItemArccodingToTheDate(LocalDateTime localDateTime) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String dateTimeOfItem = localDateTime.format(dateTimeFormatter);


        Session session = getCurrentSession();

        Transaction transaction = session.beginTransaction() ;

        try {
            String sql = "select mh.MaMH,mh.TenMH,dh.NgayTao from mathang mh join chitietdonhang ctdh  on mh.MaMH = ctdh.MaMH join donhang dh on ctdh.MaDH = dh.MaDH where dh.NgayTao like '2020-12-18%'" ;
            NativeQuery<?> query = session.createNativeQuery(sql);

            

        }
        catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }


        return null;
    }


}
