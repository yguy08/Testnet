$datetime=(Get-Date -F s).Replace(":","-")
Copy-Item c:\maga e:\maga\$datetime -Recurse