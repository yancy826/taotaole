function dirClick1(){
	document.getElementById("directory_content2").style.display="none";
	document.getElementById("directory_content3").style.display="none";
	document.getElementById("directory_content1").style.display="block";
	document.getElementById("directory_button1").style.backgroundColor="rgba(169, 215, 238, 0.50)";
	document.getElementById("directory_button2").style.backgroundColor="RGBA(225, 246, 251, 100)";
	document.getElementById("directory_button3").style.backgroundColor="RGBA(225, 246, 251, 100)";
	
}

function dirClick2(){
	document.getElementById("directory_content1").style.display="none";
	document.getElementById("directory_content3").style.display="none";
	document.getElementById("directory_content2").style.display="block";
	document.getElementById("directory_button2").style.backgroundColor="rgba(169, 215, 238, 0.50)";
	document.getElementById("directory_button1").style.backgroundColor="RGBA(225, 246, 251, 100)";
	document.getElementById("directory_button3").style.backgroundColor="RGBA(225, 246, 251, 100)";
}

function dirClick3(){
	document.getElementById("directory_content2").style.display="none";
	document.getElementById("directory_content1").style.display="none";
	document.getElementById("directory_content3").style.display="block";
	document.getElementById("directory_button3").style.backgroundColor="rgba(169, 215, 238, 0.50)";
	document.getElementById("directory_button2").style.backgroundColor="RGBA(225, 246, 251, 100)";
	document.getElementById("directory_button1").style.backgroundColor="RGBA(225, 246, 251, 100)";
}
