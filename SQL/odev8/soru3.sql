Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

UPDATE employee
SET name='Andres',
	birthday='2016-10-15'
WHERE id=2;

UPDATE employee
SET name='nana'
WHERE name='Mommy';

UPDATE employee
SET name='Yasemin'
WHERE name='Jessamine';

UPDATE employee
SET name='Darel'
WHERE name='Darell';

UPDATE employee
SET name='Mommy'
WHERE name='nana';
