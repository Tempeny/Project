SELECT SIMPLE
1) select Nombre from personajes where Nivel = 10;
2) SELECT Nombre FROM personajes WHERE Nombre like '%or%';
3)SELECT Nombre, poblacion, región FROM Reinos WHERE Región = 'Norte' and Poblacion > 20000;
4) SELECT Nombre, Titulo from personajes where titulo = 'Hechicera' or Titulo = 'Guerrero';
5) Select Nombre from personajes ORDER BY Nombre ASC;
6) Select Nombre from Reinos WHERE nombre like '%a%';
7) Select COUNT(Tipo) from personajes where tipo = 'Humano';
8) Select Región from reinos;
9) Select nombre, nivel from personajes where nivel >= 5 AND nivel <= 10 ORDER BY Nivel ASC;
10) SELECT Nombre, tipo, nivel FROM personajes where titulo = 'Guerrero' ORDER BY nivel desc limit 3;

JOIN & GROUP BY
1) SELECT p.Nombre, r.Nombre FROM Personajes p INNER JOIN Reinos r ON 
p.ReinoID = r.ReinoID;
2) SELECT r.nombre, p.nombre FROM reinos r Inner join personajes p ON r.reinoID = p.reinoID;
3) SELECT B.Nombre AS NombreBatalla, P.Nombre AS NombrePersonaje FROM
Batallas B JOIN ParticipantesBatalla PB ON B.BatallaID = PB.BatallaID JOIN Personajes P ON PB.PersonajeID = P.PersonajeID
ORDER BY B.BatallaID, P.Nombre;
4) SELECT r.nombre, count(p.reinoID) as Num_Pjs from Reinos r inner join personajes p ON r.reinoid = p.reinoid GROUP BY r.reinoid; 
5) SELECT sum(Poder), tipo from artefactosmagicos group by Tipo;
6) Select b.Nombre, b.fecha, b.resultado, pb.batallaID, pb.PersonajeID from batallas b inner join participantesbatalla pb on b.batallaid = pb.batallaid where b.resultado = 'Victoria';
7) select avg(Nivel), tipo from personajes group by Tipo;
8) Select am.nombre, p.Nombre, p.personajeid from artefactosmagicos am inner join personajes p on am.dueñoid = p.personajeid;
9) SELECT reinos.nombre, COUNT(personajes.reinoid) AS Num_personajes
FROM reinos
INNER JOIN personajes ON reinos.reinoid = personajes.reinoid
GROUP BY reinos.reinoid, reinos.nombre
HAVING COUNT(personajes.reinoid) >= 3;
10) Select p.nombre, pb.rol, pb.batallaid from personajes p inner join participantesbatalla pb
on p.personajeid = pb.personajeid where pb.batallaid = 1;

CRUD
1) INSERT INTO personajes (Nombre, PersonajeID, ReinoID) Values ('Luna','20','4');
2) INSERT INTO reinos(Nombre, región) values ('Valle Esmeralda','Oeste');
Teni
3) UPDATE reinos set Poblacion = 60000 where Nombre = 'Reino de Eldoria';
4) UPDATE personajes set Nivel = 15 where Nombre = 'Gorim';
5) Delete from reinos where nombre = 'Principado de Solstheim';
6) INSERT INTO artefactosmagicos (Nombre, Poder, DueñoID) values ('Escudo de la Esperanza','85','6');
7) Update artefactosmagicos set DueñoID = 7 where Nombre = 'Espada de Fuego';
8) delete from personajes where nombre = 'Thorvald';
9) update reinos Set región = 'Norte' where nombre = 'Dominio de Lunaris';
10 ) Insert into participantesbatalla (PersonajeID, batallaID) values ('19','3');
