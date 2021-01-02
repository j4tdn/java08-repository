-- B. DELETE
-- 1. Xóa nhân viên có tên 'Văn Hoàng' trong hệ thống
-- 2. Xóa bộ phận giao hàng trong hệ thống
-- 3. Xóa tất cả các mặt hàng có mã loại bằng 4
-- 4. Xóa tất cả các mặt hàng trong hệ thống
-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
--    Thực hiện xóa các đơn hàng bị lỗi


-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
--    MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K


-- 1
-- delete 
-- from nhanvien 
-- where TenNV='Văn Hoàng' ;

-- -- 2

-- delete
-- from phongban 
-- where TenPB='Bộ phận giao hàng'; 

-- -- delete 
-- -- from wh

-- update 

-- 1. Toàn bộ thông tin các loại hàng
--     -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
--     -- Top 5 mặt hàng có giá bán cao nhất
-- 2. Đơn hàng
-- 	-- Được bán trong ngày 28/11/2019( DATE)  year-month-day hh:MM:ss ( datetime) year-month-day ( date) 
--     -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
--     -- Được bán trong tháng 11/2019
--     -- Được giao hàng tại Hòa Khánh
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân

-- select MaMH,TenMH,GiaMua,GiaBan,round(GiaBan*0.8,2) as GiaKhuyenMai 
--         from mathang;
--         
--         select round(156.100,2);

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019

-- update 

-- = 2019/11/25  ||| cast(sdfds as DATE)

-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
-- select distinct mausac from mathang;

-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019

-- select * from mathang where MaMH in (select MaMH from donhang where ngaytao='2019/11/23' ) ;
-- select distinct mh.MaMH, mh.TenMH, cast(dh.NgayTao as Time) ThoiGianDatHang
-- from mathang mh 
-- join chitietdonhang ctdh on mh.MaMH = ctdh.MaMH 
-- join donhang dh on ctdh.MaDH = dh.MaDH 
-- where cast(dh.NgayTao as Date) = '2020-12-18';


-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300


-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'

-- tương quan 
-- select * from mathang 
-- where MaLoai in ( select MaLoai 
-- 				from loaihang 
-- 				where TenLoai like '%Giày' or TenLoai like '%Mũ');


-- phân cấp 



-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần

-- select *
-- from mathang 
-- order by GiaBan asc, GiaMua desc ;

-- 14. Đếm số lượng các mặt hàng trong hệ thống
-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019


-- select * , sum(ctdh.SoLuong)
-- from mathang mh
-- join ChiTietDonHang ctdh on mh.MaMH = ctdh.MaMH
-- join donhang dh on ctdh.MaDH = dh.MaDH 
-- where cast(dh.NgayTao as Date) = '2020-12-18' and mh.TenMH like '%Giày%';



-- 1

-- delete 
-- from donhang 
-- where MaDH=1;


-- select * 
-- from mathang mh 
-- join loaihang lh 



-- select mh.TenMH, lh.TenLoai, max(mh.GiaBan)
-- from mathang mh join loaihang lh on mh.MaLoai = lh.MaLoai 
-- where (mh.MaLoai,max(mh.GiaBan) in ( select mh1.maloai, max(mh1.GiaBan)
-- from mathang mh1 
-- group by mh1.MaLoai)) ;


-- CTE ( common table expression ) 

-- WITH GiaBanCaoNhat AS (
-- 	select maloai, max(giaban) giabancaonhat
--     from mathang 
--     group by maloai ) 


-- select *
-- from mathang mh 
-- where (mh.MaLoai, mh.GiaBan) in 
-- 	( select maloai, giabancaonhat 
--     from GiaBanCaoNhat);


create table LoaiHang_SAOCHEP(

	MaLoai int primary key,TenLoai varchar(255) ,MoTa text, 
    constraint FK_LoaiHangSC_MatHang foreign key (MaLoai) references mathang(maloai)

);

insert into LoaiHang_SAOCHEP(maloai, tenloai, mota)
select maloai, tenloai, concat(maloai,' ',tenloai)
from loaihang ;

select * 
from loaihang_saochep












