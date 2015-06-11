$(document).ready(function() {
		
	preLoadData();
	
	 $("#submit").click(function(){
		var data = new Object(); 
		var FormData = new Object();
		
		 FormData.report={"rprtNumber":$("#reportNumber").val(),"dateRcvdFrm":$("#dateRcvdFrm").val(),"dateRcvdTo":$("#dateRcvdto").val(),
				 "rprtSrcCode":$("#reportSrcCode").val(),"evntType":$("#eventType").val(),"evntLocation":$("#eventLocation").val(),"rprtrOcptnCode":$("#reporterOcpnCode").val(),
				 "remedialAction":$("#remedialAction").val(),"allWords":$("#allWords").val(),"noneWords":$("#noneWords").val(),};
		 
		 FormData.device={"prdctProb":$("#devProductProblem").val(),"brandName":$("#devBrandName").val(),"genericName":$("#devGenericName").val(),
				 "manufacturer":$("#devManufacturer").val(),"modelNumber":$("#devModelNumber").val(),"lotNumber":$("#devLotNumber").val(),
				 "deviceOPerator":$("#devOperator").val(),"productCode":$("#devProdCode").val(),"deviceAge":$("#devAge").val()};
		 
		 
		 FormData.patient={"treatment":$("#patTreatment").val(),"outcome":$("#patOutcome").val()};
		 
		 data.FormData=FormData;
		
		 $.ajax({
			 
			    type: 'POST',
			    url: 'searchData',
			    data: JSON.stringify(data),
			    dataType: 'json'
			}).done (function(data) 
						{
				
							$('#openModal').css('opacity','1');
							$('#openModal').css('pointer-events','auto');
							
							var resultData =[];
							$(data).each(function(i,val){
							    $.each(val,function(j,val0){
							          if(j=="result")
							        	  {
							        	  	$.each(val0,function(k,v){
							        	  		var inner=[];
							        	  		$.each(v,function(l,v1){
							        	  			inner.push(v1);
								        	  	});
							        	  		resultData.push(inner);
							        	  	});
							        	  }
							    });
							});
							
							//to view sample data refer to dataTable.js
							$('#results').dataTable( {
						        "data": resultData,
						        "bDestroy": true,
						         "columns": [
						            { "title": "Manufacturer" },
						            { "title": "Brand Name" },
						            { "title": "Date Report Received" }
						            
						        ]
						    } );
							
							$(".dataTables_scrollHeadInner").css({"width":"100%"});

							$(".table ").css({"width":"100%"});				
						}
					)
		    .fail (function()     
		    			{ alert("Error In Fetching Result")   ; });
		
	    }); 
	 
	//Close button for modal form
	 $("#closeModal").click(function()
		 {
	 		$('#openModal').css('opacity','0');
	 		$('#openModal').css('pointer-events','none');
		 });	
	 
	 $(document).keyup(function(e) {

		  if (e.keyCode == 27) {
			  $('#openModal').css('opacity','0');
		 		$('#openModal').css('pointer-events','none');
			  
		  }   // escape key maps to keycode `27`
		});
	 
	 $('#closeModalUp').click(function()
			 {
	 		$('#openModal').css('opacity','0');
	 		$('#openModal').css('pointer-events','none');
		 });	
	 
	function preLoadData() {
		
        $.ajax({
            url : 'preLoadData.json',
            success : function(data) {
            	$.each(data, function (index, value) {
            		
            		if(index=="reportSourceCode")
            			{
            				populateDropDown(value,"#reportSrcCode");
            			} 
            		
            		if(index=="eventLocationCode")
	        			{
	        				populateDropDown(value,"#eventLocation");
	        			}    
            		
            		if(index=="reporterOccptnCode")
	        			{
	        			
	            			 populateDropDown(value,"#reporterOcpnCode");
	        			}    
            		

            		if(index=="eventTypeCode")
        			{
            			populateDropDown(value,"#eventType");
        			}  
            		
            		if(index=="remedialActionCode")
        			{
            			populateDropDown(value,"#remedialAction");
        			}  

                });
            }
        });
    }
	
	function populateDropDown(value,id)
	{	
		var codeList="<option value='-1'>Select One </option>";
		$.each(value, function (index, value) {
			codeList+= "<option value='" + index + "'>" + value + "</option>";
        });
		 $(id).html(codeList);
	}
	
	/*********************************************************************************
	 * Div Show Hide Code 
	 *******************************************************************************/
	
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
				$('#deviceHdr').css('background-image','url(images/hide.jpg)');
				$('#deviceOuter.outer').css('border-radius','45px'); 
				$('#deviceInner.inner').css('border-radius','45px'); 
             
			} else {
				$('#deviceHdr').css('background-image','url(images/show.jpg)'); 
				$('#deviceOuter.outer').css('border-radius','15px'); 
				$('#deviceInner.inner').css('border-radius','15px');
			}   
			
			
			if(($('#devOperator').children('option').length) < 2)
				{
					
					  $.ajax({
				            url : 'preLoadDataDevice.json',
				            success : function(data) {
				            	$.each(data, function (index, value) {
				            		
				            		if(index=="deviceProdProbCode")
					        			{
					            			populateDropDown(value,"#devProductProblem");
					        			}  
				            		
				            		if(index=="deviceOperatorCode")
				        			{
				            			populateDropDown(value,"#devOperator");
				        			}  
				            		
				                });
				            }
				        });
				
				}//End of if
			
			
			
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
			
			if(($('#patOutcome').children('option').length) < 2)
			{
				
				  $.ajax({
			            url : 'preLoadDataPat.json',
			            success : function(data) {
			            	$.each(data, function (index, value) {
			            		
			            		if(index=="patOutComeCode")
			            			{
			                			populateDropDown(value,"#patOutcome");
			            			}  
			            		
			                });
			            }
			        });
			
			}//End of if
		
			
			
		});		

		 $('#dateRcvdFrm').datepicker({
			showOn: "both",
			buttonImage: "images/calendar.gif",
			buttonImageOnly: true,
			changeMonth: true,
			changeYear: true,
			 onSelect: function (selected) {
		            var dt = new Date(selected);
		            dt.setDate(dt.getDate() + 1);
		            $("#dateRcvdto").datepicker("option", "minDate", dt);
		            $("#dateRcvdto").datepicker("option", "disabled", false);
		        }
			
		  });
					
		 $('#dateRcvdto').datepicker({
				showOn: 'button',
				buttonImage: "images/calendar.gif",
				buttonImageOnly: true,
				disabled:true,
				changeMonth: true,
				changeYear: true
			});
						 
		 
});