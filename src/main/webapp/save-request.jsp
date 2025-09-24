<html>
<title>Pass-form</title>
<head>
    <style>
        .row {
            display: flex;
            align-items: center;
            gap: 10px;
            flex-wrap: wrap;
        }

        /* Стили для всех колонок */
        .col-auto {
            margin-bottom: 15px;
        }

        /* Скрытые лейблы */
        .visually-hidden {
            position: absolute;
            width: 1px;
            height: 1px;
            padding: 0;
            margin: -1px;
            overflow: hidden;
            clip: rect(0, 0, 0, 0);
            white-space: nowrap;
            border: 0;
        }

        /* Поле только для чтения */
        .form-control-plaintext {
            display: block;
            padding: 8px 12px;
            font-size: 14px;
            color: #333;
            background-color: #f8f9fa;
            border: 1px solid #ddd;
            border-radius: 4px;
            width: 200px;
        }

        /* Обычное поле ввода */
        .form-control {
            display: block;
            padding: 8px 12px;
            font-size: 14px;
            color: #333;
            background-color: white;
            border: 1px solid #ccc;
            border-radius: 4px;
            width: 200px;
            transition: border-color 0.3s;
        }

        .form-control:focus {
            outline: none;
            border-color: #007bff;
            box-shadow: 0 0 0 2px rgba(0, 123, 255, 0.25);
        }

        /* Кнопка */
        .btn {
            padding: 8px 16px;
            font-size: 14px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .btn-primary {
            background-color: #007bff;
            color: white;
        }

        .btn-primary:hover {
            background-color: #0056b3;
        }

        /* Отступ для кнопки */
        .mb-3 {
            margin-bottom: 15px;
        }
    </style>
</head>
<body>
<form class="row g-3" action="save-request" method="post">
    <div class="col-auto">
        <label for="staticEmail2" class="visually-hidden">Email</label>
        <input type="email" class="form-control-plaintext" id="staticEmail2" name="email"
               placeholder="email@example.com" required>
    </div>
    <div class="col-auto">
        <label for="inputPassword2" class="visually-hidden">Password</label>
        <input type="password" class="form-control" id="inputPassword2" name="password"
               placeholder="Password" required>
    </div>
    <div class="col-auto">
        <button type="submit" class="btn btn-primary mb-3">Confirm identity</button>
    </div>
</form>
</body>
</html>
