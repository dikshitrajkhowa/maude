$(document).ready(function() {
		
		$("#reportHdr").click(function(){
			$("#reportDiv").toggle();
						
			if ($("#reportDiv").is(':visible')) {
				$('#reportHdr').css('background-image','url(images/hide.jpg)');
				$('#reportOuter.outer').css('border-radius','45px'); /* Combining id and class*/
				$('#reportInner.inner').css('border-radius','45px'); 
             
			} else {
				$('#reportHdr').css('background-image','url(images/show.jpg)'); 
				$('#reportOuter.outer').css('border-radius','15px'); 
				$('#reportInner.inner').css('border-radius','15px'); 
			}   
		});

		$("#deviceHdr").click(function(){
			$("#deviceDiv").toggle();
			
			if ($("#deviceDiv").is(':visible')) {
				$('#deviceHdr').css('background-image','url(mages/hide.jpg)');
				$('#deviceOuter.outer').css('border-radius','45px'); 
				$('#deviceInner.inner').css('border-radius','45px'); 
             
			} else {
				$('#deviceHdr').css('background-image','url(images/show.jpg)'); 
				$('#deviceOuter.outer').css('border-radius','15px'); 
				$('#deviceInner.inner').css('border-radius','15px');
			}   
		});
		
		$("#patientHdr").click(function(){
			$("#patientDiv").toggle();
			
			if ($("#patientDiv").is(':visible')) {
				$('#patientHdr').css('background-image','url(images/hide.jpg)');
				$('#patOuter.outer').css('border-radius','45px'); 
				$('#patInner.inner').css('border-radius','45px'); 
             
			} else {
				$('#patientHdr').css('background-image','url(images/show.jpg)'); 
				$('#patOuter.outer').css('border-radius','15px'); 
				$('#patInner.inner').css('border-radius','15px');
			}   
		});		

		 $('#dateRcvdFrm').datepicker({
			showOn: "both",
			buttonImage: "images/calendar.gif",
			buttonImageOnly: true,
			changeMonth: true,
			changeYear: true
			
		  });
					
		 $('#dateRcvdto').datepicker({
				showOn: 'button',
				buttonImage: "images/calendar.gif",
				buttonImageOnly: true,
				changeMonth: true,
				changeYear: true
			});
						 

});