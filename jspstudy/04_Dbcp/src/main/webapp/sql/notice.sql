DROP SEQUENCE NOTICE_SEQ;
CREATE SEQUENCE NOTICE_SEQ NOCACHE;

DROP TABLE NOTICE;
CREATE TABLE NOTICE(
    NOTICE_NO NUMBER              NOT NULL,
    TITLE    VARCHAR2(1000 BYTE)  NOT NULL,
    CONTENT  VARCHAR2(4000 BYTE),  
    HIT      NUMBER               NOT NULL,
    CREATE_DATE TIMESTAMP,
    MODIFY_DATE TIMESTAMP,
    CONSTRAINT PK_NOTICE PRIMARY KEY(NOTICE_NO)
);