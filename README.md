# Course Scheduling System (CSS) - REGIE
A console interaction app for course scheduling

### Notes
* In this project, one userID represents one role (i.e. cnetID - Instructor, departmentAbbr - DepartmentAdmin, 
  "regie"- Admin), so that we can have two tables `user` and `people` of current structures. It would not be the case 
  if Student is considered.
* CNETID == 4 DepartmentAdmin, CNETID == "regie" Admin, CNetID >= 6 instructor