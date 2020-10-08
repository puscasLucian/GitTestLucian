<?php

$user= filter_input(INPUT_POST,'nume');
$tel= filter_input(INPUT_POST,'tel');
$email= filter_input(INPUT_POST,'email');

if(!empty($user)){
$servername = "127.0.0.1";
$username = "root";
$db="proiectscoala";
$password = "";	
$conn =new mysqli($servername, $username, $password, $db);

	if (mysqli_connect_error()){
	 die('Connect Error('. mysqli_connect_errno().')'. mysqli_connect_error());
 }
	else{
		$sql = "INSERT INTO datescoala( Nume, Email, Telefon )
	values('$user', '$email', '$tel')";
	}
	if ($conn->query($sql)){
		echo "Felicitari esti inregistrat!";
	}
	else{
		echo"Eroare de inregistrare: ".$sql."<br>".$conn->error;
	}
	$conn->close();
}

else{
	echo"incearca din nou";
	die();
}


?>
.