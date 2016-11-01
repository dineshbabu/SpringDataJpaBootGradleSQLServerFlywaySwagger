CREATE TABLE tag_table(
	   id bigint IDENTITY(1,1),
	   tag_name Varchar(2000),
	   createdby Varchar(255),
	   createddate Date,
	   updateddate date,
	   updateby varchar(255)
	   PRIMARY KEY( id)
	);