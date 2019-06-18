@echo off
set path=D:\InstallSoft\jdk1.8\bin
START "project" "%path%\javaw" -jar D:\StudyPlace\SpringCloud2.0\zipkin-server\zipkin-server-2.1.0-exec.jar --zipkin.torage.type=mysql --zipkin.torage.mysql.host=localhost --zipkin.torage.mysql.port=3306 --zipkin.torage.mysql.username=root --zipkin.torage.mysql.password=123456
pause