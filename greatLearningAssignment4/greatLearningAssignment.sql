create database TravelOnTheGo;
use TravelOnTheGo;

create table PASSENGER(Passenger_name varchar(255), Category varchar(255),Gender varchar(255), Boarding_City varchar(255),Destination_City varchar(255),Distance int(255),Bus_Type varchar(255));
create table PRICE( Bus_Type varchar(255), Distance int(255), Price int(255));

insert into PASSENGER values("Sejal", "AC", "F", "Bengaluru", "Chennai", 350 ,"Sleeper");
insert into PASSENGER values("Anmol", "Non-AC", "M", "Mumbai", "Hyderabad", 700, "Sitting");
insert into PASSENGER values("Pallavi", "AC", "F", "Panaji", "Bengaluru", 600, "Sleeper");
insert into PASSENGER values("Khusboo","AC", "F", "Chennai", "Mumbai", 1500, "Sleeper");
insert into PASSENGER values("Udit", "Non-AC", "M", "Trivandrum" ,"panaji" ,1000, "Sleeper");
insert into PASSENGER values("Ankur", "AC"," M Nagpur"," Hyderabad", 500 ,"Sitting");
insert into PASSENGER values ( "Hemant", "Non-AC", 'M', "Panji", "Mumbai", 700, "Sleeper");
insert into PASSENGER values("Piyush","AC","M","Pune","Nagpur",700,"Sitting");
insert into PASSENGER values ( "Manish", "Non-AC", 'M', "Hyderabad", "Bengaluru", 500, "Sitting");


insert into PRICE values ("Sleeper", 350, 770);
insert into PRICE values ("Sleeper", 500, 1100);
insert into PRICE values ("Sleeper", 600, 1320);
insert into PRICE values ("Sleeper", 700, 1540);
insert into PRICE values ("Sleeper", 1000, 2200);
insert into PRICE values ("Sleeper", 1200, 2640);
insert into PRICE values ("Sleeper", 350, 434);
insert into PRICE values ("Sitting", 500, 620);
insert into PRICE values ("Sitting", 600, 744);
insert into PRICE values ("Sitting", 700, 868);
insert into PRICE values ("Sitting", 1000, 1240);
insert into PRICE values ("Sitting", 1200, 1488);
insert into PRICE values ("Sitting", 1500, 1860);

select Gender, count(Gender) as number_of_passengers from PASSENGER where Distance >= 600 group by Gender;

select min(price) from PRICE where Bus_Type="Sleeper";

select ps.Passenger_name,ps.Boarding_City,ps.Destination_City,bus.Bus_Type,bus.Price from PASSENGER  ps inner join PRICE  bus on bus.Distance = ps.Distance ;

select pa.Passenger_name ,ps.Price from PASSENGER pa inner join PRICE ps where pa. Bus_Type = ps.Bus_Type 
and pa.Bus_Type='Sitting' and ps.Distance=1000;

Select p.Passenger_name , p.Boarding_City , p.Destination_City , pr.Bus_Type , pr.price from PASSENGER p
inner join PRICE pr where pr.Distance=p.Distance and Passenger_name='Pallavi' and p.Distance=pr.Distance;

select Passenger_name,Distance*100/(select sum(Distance) from PASSENGER ) as '% of distance' from PASSENGER;

select Distance,Price,case 
when Price > 1000 then "Expensive"
when Price between 500 AND 1000 then "Average Cost" 
else "Cheap"
end as Prices
from PRICE;