

-- MEMBER 테이블 생성
CREATE TABLE MEMBER(
    MEMBER_NO NUMBER,
    ID VARCHAR2(30 BYTE) UNIQUE NOT NULL,
    PW VARCHAR2(30 BYTE) NOT NULL,
    NAME VARCHAR2(30 BYTE),
    PHONE VARCHAR2(30 BYTE)
    
);

-- MEMBER_LOG 테이블 생성
CREATE TABLE MEMBER_LOG(
     LOG_NO NUMBER,
     MEMBER_NO NUMBER NOT NULL,
     LOGIN DATE
     
);

-- 기본키 생성
ALTER TABLE MEMBER ADD CONSTRAINT PK_MEMBER PRIMARY KEY(MEMBER_NO);
ALTER TABLE MEMBER_LOG ADD CONSTRAINT PK_MEMBER_LOG PRIMARY KEY(LOG_NO);

-- 외래키 생성
ALTER TABLE MEMBER_LOG
   ADD CONSTRAINT FK_MEMBER_LOG_MEMBER FOREIGN KEY(MEMBER_NO)
       REFERENCES MEMBER(MEMBER_NO);
            
            
-- 정답
CREATE TABLE MEMBER

(

    MEMBER_NO NUMBER NOT NULL,

    ID VARCHAR2(30 BYTE) NOT NULL,

    PW VARCHAR2(30 BYTE) NOT NULL,

    NAME VARCHAR2(30 BYTE) NULL,

    PHONE VARCHAR2(15 BYTE) NULL

);

CREATE TABLE MEMBER_LOG

(

    LOG_NO NUMBER NOT NULL,

    MEMBER_NO NUMBER NOT NULL,

    LOGIN DATE NULL

);

ALTER TABLE MEMBER ADD CONSTRAINT MEMBER_PK PRIMARY KEY(MEMBER_NO);

ALTER TABLE MEMBER ADD CONSTRAINT MEMBER_ID_UN UNIQUE(ID);

ALTER TABLE MEMBER_LOG ADD CONSTRAINT MEMBER_LOG_PK PRIMARY KEY(LOG_NO);

ALTER TABLE MEMBER_LOG ADD CONSTRAINT MEMBER_LOG_MEMBER_FK FOREIGN KEY(MEMBER_NO) REFERENCES MEMBER(MEMBER_NO);

 