CREATE TABLE IF NOT EXISTS instructor (
    cnetid      VARCHAR(20),
    first_name  VARCHAR(20)             NOT NULL,
    last_name   VARCHAR(20)             NOT NULL,
    PRIMARY KEY (cnetid)
);

CREATE TABLE IF NOT EXISTS department (
    abbr        CHAR(4),
    title       VARCHAR(80)             NOT NULL,
    PRIMARY KEY (abbr)
);

CREATE TABLE IF NOT EXISTS course (
    id          CHAR(9),
    department  CHAR(4)                 NOT NULL,
    number      INT                     NOT NULL,
    name        VARCHAR(80)             NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (department)    REFERENCES department(abbr),
    UNIQUE KEY  (department, number)
);

CREATE TABLE IF NOT EXISTS schedule_record (
    id          INT                     AUTO_INCREMENT,
    course      CHAR(9)                 NOT NULL,
    year        YEAR                    NOT NULL,
    quarter     CHAR(6)                 NOT NULL,
    session     int                     NOT NULL,
    instructor  VARCHAR(20)             NOT NULL,
    class       int                     NOT NULL,
    day         CHAR(3),
    start       TIME,
    end         TIME,
    PRIMARY KEY (id),
    FOREIGN KEY (course)        REFERENCES course(id),
    FOREIGN KEY (instructor)    REFERENCES instructor(cnetid),
    UNIQUE KEY  (course, year, quarter, session, class)
)