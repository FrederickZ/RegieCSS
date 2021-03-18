CREATE TABLE IF NOT EXISTS Instructor (
    cnetid      VARCHAR(20),
    first_name  VARCHAR(20)             NOT NULL,
    last_name   VARCHAR(20)             NOT NULL,
    PRIMARY KEY (cnetid)
);

CREATE TABLE IF NOT EXISTS departments (
    abbr        CHAR(4),
    title       VARCHAR(80)             NOT NULL,
    PRIMARY KEY (abbr)
);

CREATE TABLE IF NOT EXISTS