DROP SEQUENCE STUDENT_SEQ;
CREATE SEQUENCE STUDENT_SEQ NOCACHE;

DROP TABLE STUDENT;
CREATE TABLE STUDENT(
    STU_NO NUMBER    NOT NULL,
    NAME   VARCHAR2(20 BYTE),
    KOR    NUMBER(3) CHECK(KOR BETWEEN 0 AND 100),
    ENG    NUMBER(3) CHECK(ENG BETWEEN 0 AND 100),
    MATH   NUMBER(3) CHECK(MATH BETWEEN 0 AND 100),
    AVE    NUMBER(5,2),
    GRADE  VARCHAR2(1 BYTE),
    CONSTRAINT PK_STUDENT PRIMARY KEY(STU_NO)
);

