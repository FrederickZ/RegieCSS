CREATE TABLE IF NOT EXISTS user (
    id          VARCHAR(20),
    role        ENUM('A', 'D', 'I')
                                NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS people (
    cnetid      VARCHAR(20),
    first_name  VARCHAR(20)     NOT NULL,
    last_name   VARCHAR(20)     NOT NULL,
    PRIMARY KEY (cnetid)
);