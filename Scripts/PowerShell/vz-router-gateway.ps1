$username = "username" 
$password = "password" 
$ie = New-Object -ComObject InternetExplorer.Application
$ie.visible=$true
$ie.Navigate("http://myfiosgateway.com/#/login")
while($ie.ReadyState -ne 4) {start-sleep -m 100}
$ie.Document.getElementsByTagName("password").ngmodel.setViewValue("password")

#$ie.visible=$false
#$ie.navigate("Url") 
#while($ie.ReadyState -ne 4) {start-sleep -m 100} 
#$ie.document.getElementById("username").value= "$username" 
#$ie.document.getElementById("pass").value = "$password" 
#$ie.document.getElementById("loginform").submit()
#start-sleep 20 
#$ie.Document.body | Out-File -FilePath c:~\web.txt

#$IE = New-Object -ComObject InternetExplorer.Application
#$URL = 'https://somewebsite/ecp/?rfr=owa&p=PersonalSettings/Password.aspx'
#$IE.Visible = $true
#$IE.Navigate($URL)
#While ($IE.Busy -eq $true) {Start-Sleep -Milliseconds 2000} 

#$ie.Document.getElementById('username').value = "username"
#$ie.Document.getElementById('password').value = "password"
#$Submit = $ie.Document.getElementsByTagName('Input') | ? {$_.Type -eq "Submit"}
#$Submit.click() 