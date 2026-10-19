# JSP Servlet Currency Converter

Bài thực hành chuyển đổi từ USD sang VNĐ sử dụng JSP, Jakarta Servlet, Maven và Tomcat 10.1+.

## Chức năng

- Nhập tỉ giá VND/USD và số tiền USD.
- Gửi form POST tới `convert`.
- Tính VND = USD × tỉ giá và hiển thị kết quả.
- Thông báo khi dữ liệu không hợp lệ.

## Chạy

Yêu cầu JDK 17+, Maven và Tomcat 10.1+.

```bash
mvn clean package
```

Sao chép `target/jsp-servlet-currency-converter.war` vào thư mục `webapps` của Tomcat và khởi động Tomcat.

Mở http://localhost:8080/jsp-servlet-currency-converter/

## Cấu trúc

- `pom.xml`: cấu hình Maven.
- `src/main/webapp/index.jsp`: giao diện nhập tỉ giá và USD.
- `src/main/java/com/codegym/ConverterServlet.java`: xử lý POST và tính toán.
- `src/main/webapp/WEB-INF/web.xml`: cấu hình Jakarta Servlet.
