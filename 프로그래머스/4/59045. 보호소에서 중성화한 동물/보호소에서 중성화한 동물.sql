WITH NONINTACT AS 
(
    SELECT ANIMAL_ID, NAME
    FROM ANIMAL_INS 
    WHERE SEX_UPON_INTAKE LIKE '%Intact%'
)
SELECT ANIMAL_ID, ANIMAL_TYPE, NAME
FROM ANIMAL_OUTS 
WHERE (ANIMAL_ID, NAME) IN (
    SELECT ANIMAL_ID, NAME FROM NONINTACT
) AND SEX_UPON_OUTCOME NOT LIKE '%Intact%'
