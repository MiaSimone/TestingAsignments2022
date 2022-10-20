create table Bookings (		
	ID int not null auto_increment,	
	customerId int not null,	
	employeeId int not null,	
	date Date not null,		
	start Time not null,		
	end Time not null,		
	primary key (ID),		
	foreign key (customerId)	
		references Customers(ID)
		on delete cascade,	
	foreign key (employeeId)	
		references Employees(ID)
		on delete cascade	
)
