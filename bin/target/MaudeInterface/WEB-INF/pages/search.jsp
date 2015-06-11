<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FDA’s MAUDE database</title>


 
	<link href="styles/main.css" rel="stylesheet">
	<link href="styles/jquery-ui.css" rel="stylesheet" type="text/css">
	<script src="js/jquery.js"></script>
	<script src="js/jquery-ui.js"></script>
	<script src="js/main.js"></script>
 
</head>

<body>
	<div id="main_body">
		<div id="the_header" class="header_text">
			<span class="header_text"><h1>FDA's MAUDE Database</h1></span>
		</div>

		<div class = "outer" id ="reportOuter">
			<div class="inner" id = "reportInner">
				<div class="subHeader" id="reportHdr">REPORT</div>
				<div class ="report" id="reportDiv" style="display:block;">
					<table>
						<tr>
							<td>Report Number</td>
							<td><input class="column_text" type="text" id="reportNumber"></td>
						</tr>
						<tr>
							<td>Date Report Received by FDA</td>
							<td><input class="column_date" type="text" id="dateRcvdFrm" >
							&nbsp;to
							<input class="column_date" type="text" id="dateRcvdto">
							</td>
							
						</tr>
						<tr>
							<td>Report Source Code</td>
							<td><select class="column_dropDown"><option value="volvo">Select One..</option></td>
						</tr>
						<tr>
							<td>Event Type</td>
							<td><select class="column_dropDown"><option value="volvo">Select One..</option></td>
						</tr>
							<tr>
							<td>Event Location</td>
							<td><select class="column_dropDown"><option value="volvo">Select One..</option></td>
						</tr>
						<tr>
							<td>Reporter Occupation Code</td>
							<td><select class="column_dropDown"><option value="volvo">Select One..</option></td>
						</tr>
						<tr>
							<td>Remedial Action</td>
							<td><select class="column_dropDown"><option value="volvo">Select One..</option></td>
						</tr>
						<tr>
							<td>All of these words </br>(Separated by commas):</td>
							<td><input type="text" class="column_text" id="eventLocation"></td>
						</tr>
						<tr>
							<td>None of these words </br>(Separated by commas):</td>
							<td><input type="text" class="column_text" id="remedialAction"></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		
		<!-- DEVICE-->
		<div class = "outer" id = "deviceOuter">
			<div class="inner" id ="deviceInner">
				<div class="subHeader" id="deviceHdr">DEVICE</div>
				<div class ="report" id="deviceDiv">
					<table>
						
						<tr>
							<td>Product Problem</td>
							<td><select class="column_dropDown"><option value="volvo">Alarm,intermittent</option></td>
						</tr>
						<tr>
							<td>Brand Name</td>
							<td><input type="text" class="column_text" id="eventLocation"></td>
						</tr>
						<tr>
							<td>Generic Name</td>
							<td><input type="text" class="column_text" id="eventLocation"></td>
						</tr>
						<tr>
							<td>Manufacturer</td>
							<td><input type="text" class="column_text" id="eventLocation"></td>
						</tr>
						<tr>
							<td>Model Number</td>
							<td><input type="text" class="column_text" id="eventLocation"></td>
						</tr>
						<tr>
							<td>Lot Number</td>
							<td><input type="text" class="column_text" id="eventLocation"></td>
						</tr>
						<tr>
							<td>Device Operator</td>
							<td><select class="column_dropDown"><option value="volvo">Biomedical Engineer</option></td>
						</tr>
						<tr>
							<td>Product Code</td>
							<td><input type="text" class="column_text" id="eventLocation"></td>
						</tr>
						<tr>
							<td>Device Age</td>
							<td><input type="text" class="column_text" id="eventLocation"></td>
						</tr>
					</table>
				</div>
			</div>
		</div>	
		
		<!--PATIENT -->
		<div class = "outer" id ="patOuter">
			<div class="inner" id ="patInner" >
				<div class="subHeader" id="patientHdr">PATIENT</div>
				<div class ="report" id="patientDiv">
					<table>
					
						<tr>
							<td>Treatment</td>
							<td><select class="column_dropDown"><option value="volvo"> </option></td>
						</tr>
						<tr>
							<td>Outcome</td>
							<td><select class="column_dropDown"><option value="volvo">Required Intervention</option></td>
						</tr>
						
					</table>
				</div>
			</div>
		</div>	
		<div class="footer">
			<table>
				<tr>
					<td width="100px">  </td>
					<td width="100px"><button type="submit" value="Submit" class="btn">Submit</button> </td>
				</tr>
			</table>
		</div>
	</div>
	
</body>
	
</html>