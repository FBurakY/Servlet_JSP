<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Seyehat Bilgileri</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="Resources/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Resources/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Resources/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="Resources/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Resources/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Resources/css/util.css">
	<link rel="stylesheet" type="text/css" href="Resources/css/main.css">
<!--===============================================================================================-->
</head>
<body>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-6">
						<form class="form-horizontal" action="travelController"
							method="GET">
							<fieldset>
							
								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="add"></label>
									<div class="col-md-4">
										<input type="submit" class="btn btn-info"
											value="Listele">
									</div>
								</div>

							</fieldset>
						</form>
					</div>
					<div class="col-md-6"></div>
				</div>

				<div class="row">
					<div class="col-md-12">
					<legend>Seyehat Listesi</legend>
						<div class="table-responsive">
							<table id="example" class="table table-striped table-bordered">							
							<thead>
								<tr>
									<th>Bölümü</th>
									<th>Müdürü</th>
									<th>Seyehat Başlangıcı</th>
									<th>Seyehat Sonu</th>
									<th>Seyehat Yeri</th>
									<th>Gidiş Amacı </th>
									<th>Proje Kodu</th>
									<th>İşlemler</th>
								</tr>
							</thead>
							<tbody>


								<c:forEach items="${allTravels}" var="allTravels" >
									<tr>
										<td><c:out value="${travel.Bolumu}]" /></td>
										<td><c:out value="${travel.Muduru}" /></td>
										<td><c:out value="${travel.seyehat_Baslangis}" /></td>
										<td><c:out value="${travel.seyehat_Sonu}" /></td>
										
										<td><c:out value="${travel.seyehat_Sonu}" /></td>
										<td><c:out value="${travel.seyehat_Yeri}" /></td>
										<td><c:out value="${travel.gidis_Amaci}" /></td>
										<td><c:out value="${travel.kod}" /></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						</div>
					</div>
					<div class="col-md-12"></div>
				</div>
			</div>
		</div>
	</div>
	
	
	
	
	

	
<!--===============================================================================================-->	
	<script src="Resources/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="Resources/vendor/bootstrap/js/popper.js"></script>
	<script src="Resources/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="Resources/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="Resources/vendor/tilt/tilt.jquery.min.js"></script>
	<script >
		$('.js-tilt').tilt({
			scale: 1.1
		})		
	</script>
<!--===============================================================================================-->
	<script src="Resources/js/main.js"></script>

</body>
</html>