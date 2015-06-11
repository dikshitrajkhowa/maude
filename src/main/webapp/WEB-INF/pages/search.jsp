<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FDA’s MAUDE database</title>



<link href="styles/main.css" rel="stylesheet">
<link href="styles/modal.css" rel="stylesheet">
<link href="styles/jquery-ui.css" rel="stylesheet" type="text/css">
<link href="styles/jquery.dataTables.css" rel="stylesheet" type="text/css">

<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>
<script src="js/jquery.dataTables.min.js"></script>


<script src="js/main.js"></script>
<script src="js/dataTable.js"></script>


</head>

<body>
<form action="" id="searchForm">
	<div id="main_body">
		<div id="the_header" class="header_text">
			<span class="header_text"><h1>FDA's MAUDE Database</h1></span>
		</div>

		<div class="outer" id="reportOuter">
			<div class="inner" id="reportInner">

			<div class="subHeader" id="reportHdr">REPORT</div>
			<div class="report" id="reportDiv" style="display: block;">
				<table>
					<tr>
						<td>Report Number</td>
						<td><input class="column_text" type="text" id="reportNumber"></td>
					</tr>
					<tr>
						<td>Date Report Received by FDA</td>
						<td><input class="column_date" type="text" id="dateRcvdFrm" readonly="readonly">
							&nbsp;to <input class="column_date" type="text" id="dateRcvdto" readonly="readonly">
						</td>

					</tr>
					<tr>
						<td>Report Source Code</td>
						<td><select class="column_dropDown" id="reportSrcCode"></td>
					</tr>
					<tr>
						<td>Event Type</td>
						<td><select class="column_dropDown" id="eventType"></td>
					</tr>
					<tr>
						<td>Event Location</td>
						<td><select class="column_dropDown" id="eventLocation"></td>
					</tr>
					<tr>
						<td>Reporter Occupation Code</td> 
						<td><select class="column_dropDown" id="reporterOcpnCode"></td>
					</tr>
					<tr>
						<td>Remedial Action</td>
						<td><select class="column_dropDown" id="remedialAction"></td>
					</tr>
					<tr>
						<td>All of these words </br>(Separated by commas):
						</td>
						<td><input type="text" class="column_text" id="allWords"></td>
					</tr>
					<tr>
						<td>None of these words </br>(Separated by commas):
						</td>
						<td><input type="text" class="column_text" id="noneWords"></td>
					</tr>
				</table>
			</div>
		</div>
	</div>

	<!-- DEVICE-->
	<div class="outer" id="deviceOuter">
		<div class="inner" id="deviceInner">
			<div class="subHeader" id="deviceHdr">DEVICE</div>
			<div class="report" id="deviceDiv">
				<table>

					<tr>
						<td>Product Problem</td>
						<td><select class="column_dropDown" id="devProductProblem"><option value='-1'>Select One </option></td>
					</tr>
					<tr>
						<td>Brand Name</td>
						<td><input type="text" class="column_text" id="devBrandName"></td>
					</tr>
					<tr>
						<td>Generic Name</td>
						<td><input type="text" class="column_text" id="devGenericName"></td>
					</tr>
					<tr>
						<td>Manufacturer</td>
						<td><input type="text" class="column_text" id="devManufacturer"></td>
					</tr>
					<tr>
						<td>Model Number</td>
						<td><input type="text" class="column_text" id="devModelNumber"></td>
					</tr>
					<tr>
						<td>Lot Number</td>
						<td><input type="text" class="column_text" id="devLotNumber"></td>
					</tr>
					<tr>
						<td>Device Operator</td>
						<td><select class="column_dropDown" id="devOperator"><option value='-1'>Select One </option></td>
					</tr>
					<tr>
						<td>Product Code</td>
						<td><input type="text" class="column_text" id="devProdCode"></td>
					</tr>
					<tr>
						<td>Device Age</td>
						<td><input type="text" class="column_text" id="devAge"></td>
					</tr>
				</table>
			</div>
		</div>
	</div>

	<!--PATIENT -->
	<div class="outer" id="patOuter">
		<div class="inner" id="patInner">
			<div class="subHeader" id="patientHdr">PATIENT</div>
			<div class="report" id="patientDiv">
				<table>

					<tr>
						<td>Treatment</td>
						<td><input type="text" class="column_text" id="patTreatment"></td>
					</tr>
					<tr>
						<td>Outcome</td>
						<td><select class="column_dropDown" id="patOutcome"><option value='-1'>Select One </option></td>
					</tr>

				</table>
			</div>
		</div>
	</div>
	<div class="footer">
		<table>
			<tr>
				<td width="100px"></td>
				<td width="100px"><button type="button" value="Submit" class="btn" id="submit">Submit</button></td>
				<td width="100px"><button type="reset" value="Reset" class="btn" id="reset">Reset</button></td>
			</tr>
		</table>
	</div>
	
	
	<!-- Modal Div for showing results -->

	<div id="openModal" class="modalDialog">
		<a id="closeModalUp" title="Close" class="closeUp">X</a>
	    <div id="reportModal">
	    		 </br>   		
	    		<table id="results" class="display" cellspacing="0" width="100%">
		    	</table>
	    		
			<a id="closeModal" title="Close" class="close">X</a>
	        	
	    </div>
	    	
	</div>

</div>
</form>
</body>

</html>