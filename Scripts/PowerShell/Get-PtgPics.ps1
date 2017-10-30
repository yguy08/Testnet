#Thread title i.e (ptg, /ptg/, etc..)
$threadTitle='PRESIDENT TRUMP GENERAL'

#Search archive for ptg posts
Write-Host 'searching archive for threads with: ' $threadTitle
$downloadURL='https://archive.4plebs.org/pol/search/subject/%2F'+$threadTitle+'%2F/'

Write-Host 'target URL is' $downloadURL
$source=Invoke-WebRequest -Uri $downloadURL

if($source.StatusCode -eq 200){
    foreach($l in $source.Links){
        if($l.href.Contains('https://img.4plebs.org/boards/pol/image/')){
            $datetime=(Get-Date -F s).Replace(":","-").ToString()
            $hqThreadImg=$l.href
            $response=Invoke-WebRequest -Uri $hqThreadImg -OutFile c:\maga\$datetime.png -PassThru
            echo $response.StatusCode 
            Start-Sleep -m 1000
        }
    }
}  