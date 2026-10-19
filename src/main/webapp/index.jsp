<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Currency Converter</title>
    <style>
        body { font-family: Arial, sans-serif; display: flex; justify-content: center; margin-top: 100px; background: #f8fafc; }
        .converter-container { background: white; padding: 40px; border-radius: 8px; box-shadow: 0 4px 10px rgba(0,0,0,.1); text-align: center; width: 350px; }
        input { padding: 10px; margin: 10px 0; width: 90%; border: 1px solid #ccc; border-radius: 4px; box-sizing: border-box; }
        button { background: #1b2a7a; color: white; padding: 12px 20px; border: 0; border-radius: 4px; cursor: pointer; width: 90%; margin-top: 15px; }
    </style>
</head>
<body>
<div class="converter-container">
    <h2 style="color:#1b2a7a">Chuyển đổi USD sang VNĐ</h2>
    <form action="convert" method="POST">
        <label for="rate">Tỉ giá (VND/USD):</label>
        <input id="rate" type="number" name="rate" value="25000" min="0.000001" step="any" required>
        <label for="usd">Lượng USD cần đổi:</label>
        <input id="usd" type="number" name="usd" placeholder="Nhập số USD" min="0" step="any" required>
        <button type="submit">Chuyển đổi</button>
    </form>
</div>
</body>
</html>
