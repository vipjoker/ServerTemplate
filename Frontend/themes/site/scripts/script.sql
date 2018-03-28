DELETE FROM pest_measurement p
USING auth_role a
WHERE p.project_id = a.id AND a.name != 'Sela' AND a.name != 'Yaham' AND a.name != 'Hula' AND a.name NOT LIKE 'Orpaz%';


DELETE FROM agg_crop_event a WHERE a.project_id IN (SELECT DISTINCT ag.project_id
FROM agg_crop_event ag
  JOIN auth_role a ON ag.project_id = a.id
WHERE a.name != 'Sela' AND a.name != 'Yaham' AND a.name != 'Hula' AND a.name NOT LIKE 'Orpaz%');

TRUNCATE TABLE audit_2018_2;
TRUNCATE TABLE audit;
