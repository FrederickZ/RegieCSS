INSERT INTO instructor      VALUES ("gbrady", "Geraldline", "Brady"),
                                   ("achaudhary", "Amitabh", "Chaudhary"),
                                   ("lsamuel", "Lamont", "Samuels"),
                                   ("mshacklette", "Mark", "Shacklette");

INSERT INTO department      VALUES ("MPCS", "Masters Program in Computer Science");

INSERT INTO course          VALUES ("MPCS55001", "MPCS", 55001, "Algorithms"),
                                   ("MPCS52060", "MPCS", 52060, "Parallel Programming"),
                                   ("MPCS51205", "MPCS", 51205, "Topics in Software Engineering");

INSERT INTO schedule_record VALUES (1, "MPCS55001", 2020, "AUTUMN", 1, "gbrady", 1, "TUE", "17:30", "19:00"),
                                   (2, "MPCS55001", 2020, "AUTUMN", 2, "achaudhary", 1, "TUE", "14:40", "16:00"),
                                   (3, "MPCS55001", 2020, "AUTUMN", 2, "achaudhary", 2, "THU", "14:40", "16:00"),
                                   (4, "MPCS52060", 2020, "AUTUMN", 1, "lsamuel", 1, "MON", "17:20", "19:20"),
                                   (5, "MPCS51205", 2020, "AUTUMN", 1, "mshacklette", 1, "MON", "17:00", "20:00");