<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/webjars/bootstrap/5.3.2/css/bootstrap.min.css">
    <title>Document</title>
</head>
<body>
    <div class="container mt-5">
        <form method="post" action="home">
            <div class="mb-3">
                <input type="number" class="form-control" name="anInteger" placeholder="An Integer">
            </div>
            <div class="mb-3">
                <input type="number" class="form-control" name="numerator" placeholder="Numerator">
            </div>
            <div class="mb-3">
                <input type="number" class="form-control" name="denominator" placeholder="Denominator">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</body>
<script src="/webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
</html>