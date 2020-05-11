# java08-repository

Kho chứa: JAVA08 - REPORSITORY
Danh sách nhánh

+ master:
+ nothing:
Nhánh mặc định, chỉ chứa README.md và .gitignore

Hướng dẫn nộp bài tập
VD: Nộp bài lesson10 với các bước sau đây

1. Anh sẽ tạo nhánh lesson10-exercises ở remote
2. git fetch
3. git branch -a để xem có nhánh remote/origin/lesson10-exercises ở local chưa
4. git checkout -b local_branch origin/lesson10-exercises (đã setupstream)
5. Tạo project mới để làm và nộp bài với tên như sau
+ group-id: your_name
+ artifact-id: Lesson10-HoTen-BaiTap
+ version: 1.0-SNAPSHOT
6. Thực hiện chương trình
7. git add
8. git commit
9. git fetch, git rebase origin/lesson10-exercises hoặc git pull --rebase origin lesson10-exercises
10. Lưu ý: pull fetch + rebase = pull rebase (Bạn nào pull quên rebase để merge -> Nộp phạt 20K)
11. Fix conflict nếu có => rebase --continue
12. git push hoặc git push origin HEAD:lesson10-exercises hoặc git push origin lesson10-exercises
Lưu ý: Nhớ viết đúng chính tả in hoa/thường cho commit message và tên nhánh
Bạn nào push nhầm nhánh hoặc tạo nhánh mới ở remote thì tự động xóa remote_branch để không nộp phạt trước khi a thấy

Note: Có bất cứ thắc mắc gì call anh hoặc nhắn trong nhóm
