application.properties

#mail

spring.mail.host=smtp.gmail.com

spring.mail.port=587

spring.mail.username=구글 계정

spring.mail.password=구글 암호

spring.mail.properties.mail.smtp.auth=true

spring.mail.properties.mail.smtp.starttls.enable=true

spring.mail.properties.mail.mime.charset=UTF-8

#jpa

spring.jpa.show-sql=true

spring.jpa.hibernate.ddl-auto=none

spring.jpa.database-platform=org.hibernate.dialect.OracleDialect

#oracle 연결

spring.datasource.url=jdbc:oracle:thin:@raondb_medium?TNS_ADMIN=D:/oracleCloud_DB/Wallet_raondb // 오라클 클라우드 DB 전자지갑 필요

spring.datasource.username=오라클 클라우드 DB 계정

spring.datasource.password=오라클 클라우드 DB 암호

spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

#자동 리로드

spring.devtools.livereload.enabled=true
