package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ConverterServlet", urlPatterns = {"/convert"})
public class ConverterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html lang='vi'><head><meta charset='UTF-8'><title>Result</title></head>");
            out.println("<body style='font-family:Arial,sans-serif;text-align:center;margin-top:100px'>");

            try {
                BigDecimal rate = new BigDecimal(request.getParameter("rate"));
                BigDecimal usd = new BigDecimal(request.getParameter("usd"));
                if (rate.signum() <= 0 || usd.signum() < 0) {
                    throw new NumberFormatException("Invalid value");
                }

                BigDecimal vnd = rate.multiply(usd);
                NumberFormat format = NumberFormat.getNumberInstance(Locale.forLanguageTag("vi-VN"));
                format.setMaximumFractionDigits(2);

                out.println("<h2 style='color:#1b2a7a'>KẾT QUẢ CHUYỂN ĐỔI</h2>");
                out.println("<p>Tỉ giá: " + format.format(rate) + " VND/USD</p>");
                out.println("<p>Số tiền USD: $" + usd.toPlainString() + "</p>");
                out.println("<h3 style='color:#27ae60'>Thành tiền VNĐ: " + format.format(vnd) + " VNĐ</h3>");
            } catch (NumberFormatException | NullPointerException e) {
                out.println("<h2 style='color:red'>Lỗi: Vui lòng nhập số hợp lệ!</h2>");
            }
            out.println("<p><a href='index.jsp'>Quay lại</a></p>");
            out.println("</body></html>");
        }
    }
}
