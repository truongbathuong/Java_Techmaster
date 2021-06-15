# Bộ thiết kế
![Capture](https://user-images.githubusercontent.com/65844775/121933507-5f125400-cd70-11eb-89dc-15def22bd290.JPG)
# Truy vấn:
- Tìm thông tin sách có thể loại 'Truyen ngan':
```
SELECT * 
FROM Sach INNER JOIN Sach_TheLoai ON Sach.id_sach = Sach_TheLoai.id_sach 
INNER JOIN Theloai ON Sach_TheLoai.id_theloai = Theloai.id_theloai 
WHERE Theloai.TenTheLoai = 'Truyen ngan'
```
- Tìm tên các sách đang được mượn:
```
SELECT Sach.id_sach,Sach.TenSach
FROM Sach INNER JOIN Chitietmuon ON Sach.id_sach = Chitietmuon.id_sach
WHERE Chitietmuon.id_phieumuon IN (SELECT Phieumuon.id_phieumuon 
                                  FROM Phieumuon LEFT JOIN Phieutra 
                                  ON Phieumuon.id_phieumuon= Phieutra.id_phieumuon
                                 WHERE Phieutra.NgayTra IS NULL)
```
- Thông tin sách mượn quá hạn:
```
SELECT Sach.id_sach,Sach.TenSach,Sach.SoTrang,Sach.NhaXuatBan,Sach.NamXuatBan,Chitietmuon.id_phieumuon
FROM Sach INNER JOIN Chitietmuon
ON Sach.id_sach = Chitietmuon.id_sach
WHERE Chitietmuon.id_phieumuon IN (SELECT Phieumuon.id_phieumuon
                                   FROM `Phieutra` INNER JOIN Phieumuon
                                  ON Phieutra.id_phieumuon = Phieumuon.id_phieumuon
                                   WHERE Phieutra.NgayTra - Phieumuon.NgayMuon >7)
    OR Chitietmuon.id_phieumuon IN (SELECT Phieumuon.id_phieumuon
                                   FROM Phieumuon LEFT JOIN Phieutra
                                   ON Phieumuon.id_phieumuon = Phieutra.id_phieutra
                                   WHERE Phieutra.NgayTra IS NULL 
                                    	AND CURRENT_DATE - Phieumuon.NgayMuon > 7 )
```
(Trả về thông tin sách trong 2 TH: Sách đã trả nhưng quá hạn và Sách chưa trả nhưng quá hạn so với thời điểm hiện tại)
