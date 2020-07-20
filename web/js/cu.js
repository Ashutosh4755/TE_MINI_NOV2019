function validate()
{
	var addr= document.getElementById("add").value;
	var choice1= document.getElementById("Pure Veg").checked;
	var choice2= document.getElementById("Non Veg").checked;
	var choice3= document.getElementById("Chinese").checked;
	var choice4= document.getElementById("Italian").checked;
	var choice5= document.getElementById("Mexican").checked;
	var choice6= document.getElementById("Continental").checked;
	var choice7= document.getElementById("Dance").checked;
	var choice8= document.getElementById("DJ").checked;
	var choice9= document.getElementById("Orchestra").checked;
	var choice10= document.getElementById("Stand-Up Comedy").checked;
	var choice11= document.getElementById("Live Cartoon Character Dolls").checked;
	var choice12= document.getElementById("Game Centre").checked;
	var choice13= document.getElementById("Kids section").checked;
	var choice14= document.getElementById("Salon-SPA").checked;
	var choice15= document.getElementById("Photo Booth").checked;
	var choice16= document.getElementById("Photographer").checked;
	var choice17= document.getElementById("Videographer").checked;
	var choice18= document.getElementById("Guest Table").checked;
	var choice19= document.getElementById("Cocktail Table").checked;
	var choice20= document.getElementById("Food Tables").checked;
	var choice21= document.getElementById("Table Cloth").checked;
	var choice22= document.getElementById("Chair Covers/Sashes").checked;
	var choice23= document.getElementById("Napkins").checked;
	var choice24= document.getElementById("Favor Table").checked;
	var choice25= document.getElementById("Chair Covers").checked;
	var choice26= document.getElementById("Place Cards").checked;
	var choice27= document.getElementById("Menu Cards").checked;
	var choice28= document.getElementById("Candles").checked;
	var choice29= document.getElementById("Colorful Lamps").checked;
	var choice30= document.getElementById("Colourful Drapes").checked;
	var choice31= document.getElementById("Rangoli").checked;
	var choice32= document.getElementById("Flowers").checked;
	var choice33= document.getElementById("Contempary Style").checked;
	var choice34= document.getElementById("Sculptures").checked;
	var choice35= document.getElementById("Rental Props").checked;
	var choice36= document.getElementById("Dance Floor").checked;
	var choice37= document.getElementById("Drops and Props").checked;
	var choice38= document.getElementById("Arches").checked;
	var radio1= document.getElementById("service").checked;
	var radio2= document.getElementById("service1").checked;
	var radio3= document.getElementById("service2").checked;
	var radio4= document.getElementById("service3").checked;
	
	if(addr=="")
		{
		document.getElementById('addr').innerHTML="Please Enter the Address";
		return false;
		}
	
	if(addr>=30)
		{
		document.getElementById('addr').innerHTML="The Address should not exceed 30 characters";
		}
	
	if((choice1=="") && (choice2=="") && (choice3=="") && (choice4=="") && (choice5=="") && (choice6==""))
		{
		alert("Choose atleast one of your dish for catering service");
		return false;
		}
	
	if((choice7=="") && (choice8=="") && (choice9=="") && (choice10=="") && (choice11=="") && (choice12=="") && (choice13=="") (choice14=="") && (choice15==""))
	{
	alert("Choose atleast one of the entertainment service");
	return false;
	}
	
	if((choice16=="") && (choice17==""))
	{
	alert("Choose atleast one of the service");
	return false;
	}
	
	if((choice18=="") && (choice19=="") && (choice20=="") && (choice21=="") && (choice22=="") && (choice23=="") && (choice24=="") (choice25=="") && (choice26=="") && (choice27==""))
	{
	alert("Choose atleast one of the entertainment service");
	return false;
	}
	
	if((choice28=="") && (choice29=="") && (choice30=="") && (choice31=="") && (choice32=="") && (choice33=="") && (choice34=="") (choice35=="") && (choice36=="") && (choice37=="") && (choice38==""))
	{
	alert("Choose atleast one of your decor service");
	return false;
	}
	
	if((radio1=="") && (radio2==""))
		{
		alert("Select either Yes or No")
		}
	
	if((radio3=="") && (radio4==""))
		{
		alert("Select either Yes or No")
		}
	
	if(frm.worker.selectedIndex==0)
		{
		alert("Please Enter any of the option");
		}
	
	if(frm.event.selectedIndex==0)
	{
	alert("Please Enter any of the option");
	}
	
	}

