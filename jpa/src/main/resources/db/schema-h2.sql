DROP SEQUENCE HIBERNATE_SEQUENCE;
CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY  1;
DROP TABLE TEST_USER;
CREATE TABLE TEST_USER (
    ID                              NUMBER(20),
    USERNAME                        VARCHAR2(20),
    AGE                             NUMBER(3),
    PHONE                           VARCHAR2(20),
    BIRTHDAY                        DATE,
    EMAIL                           VARCHAR(50),
    CONSTRAINT TEST_USERS_PK PRIMARY KEY (ID)
);