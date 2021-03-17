CREATE TABLE IF NOT EXISTS user (
    cnetid      VARCHAR(20),
    first_name  VARCHAR(20),
    last_name   VARCHAR(20),
    role        ENUM('A', 'I', 'S'),
    PRIMARY KEY (cnetid)
)