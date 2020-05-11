# java08-repository

Kho chứa: JAVA08 - REPORSITORY
Danh sách nhánh

+ master:
+ nothing:
Nhánh mặc định, chỉ chứa README.md và .gitignore

A: Hướng dẫn nộp bài tập
VD: Nộp bài lesson10 với các bước sau đây

1. Anh sẽ tạo nhánh lesson10-exercises ở remote
2. git fetch
3. git branch -a để xem có nhánh remote/origin/lesson10-exercises ở local chưa
4. git checkout -b local_branch origin/lesson10-exercises (đã setupstream)
5. Tạo project mới để làm và nộp bài với tên như sau
+ group-id: your_name
+ artifact-id: Lesson10-HoTen
+ version: 1.0-SNAPSHOT

+ Info: VD: Bài Lesson10
Project:
Lesson10: Học ở lớp
Lesson10-HoTen: Bài tập

6. Thực hiện chương trình
7. git add
8. git commit: message như sau "Lesson10 - HoTen - Submit code"
+ Nếu nộp lại thì cứ "Lesson10 - HoTen - Submit code 01 02 ...."
9. git fetch, git rebase origin/lesson10-exercises hoặc git pull --rebase origin lesson10-exercises
10. Lưu ý: pull fetch + rebase = pull rebase (Bạn nào pull quên rebase để merge -> Nộp phạt 20K)
11. Fix conflict nếu có => rebase --continue
12. git push hoặc git push origin HEAD:lesson10-exercises hoặc git push origin lesson10-exercises
Lưu ý: Nhớ viết đúng chính tả in hoa/thường cho commit message và tên nhánh
Bạn nào push nhầm nhánh hoặc tạo nhánh mới ở remote thì tự động xóa remote_branch để không nộp phạt trước khi a thấy

Note: Có bất cứ thắc mắc gì call anh hoặc nhắn trong nhóm

B: Hướng dẫn lưu trữ workspace tại local và remote
Tại local:

Ban đầu, checkout nhánh mới có tên là workspace từ origin/master
workspace branch: Chứa tất cả các source code và bài tập của các bạn
Hồi nào code bài ở lớp hoặc bài tập (complex lead to confuse) code vào branch workspace để chứa tất cả các project dễ quản lý tại máy

Quan trọng: Sau mỗi buổi học, hoặc làm bài tập xong
Các bạn sẽ commit và push code lên remote branch: workspace-hoten
Local: Mỗi bạn chỉ có 1 branch là workspace
Remote: Từ workspace cá nhân, mỗi bạn sẽ push, tạo remote branch workspace-hoten để push code lên
=> 20 bạn sẽ có 20 branches workspace-hoten ở remote. Để a kiểm tra các bạn phải code xong trước khi ra về

Phần bài tập: Lúc nộp bài các bạn chỉ push duy nhất project đang làm lên nhánh lesson10-exercises (VD lesson10).
Làm xong merge vào workspace để workspace có đầy đủ all project giúp các bạn dễ quản lý. 
Đồng thời cũng push project bài tập ở local branch nhánh workspace lên workspace-hoten ở remote (duplicate)