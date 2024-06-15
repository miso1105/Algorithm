WITH CAR_AVAIL AS (
SELECT  DISTINCT CAR_ID
  FROM  CAR_RENTAL_COMPANY_RENTAL_HISTORY AS CRH
 WHERE  NOT EXISTS (
    SELECT 1
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY AS R
    WHERE R.CAR_ID = CRH.CAR_ID
      AND R.START_DATE <= '2022-11-30'
      AND R.END_DATE >= '2022-11-01')
)
,
CAR_DISC AS(
SELECT  *
  FROM  CAR_RENTAL_COMPANY_DISCOUNT_PLAN
 WHERE  DURATION_TYPE = '30일 이상'
)


SELECT  A.CAR_ID
        ,C.CAR_TYPE AS CAR_TYPE
        ,ROUND((C.DAILY_FEE * (1 - D.DISCOUNT_RATE*0.01) * 30),0) AS FEE
  FROM  CAR_AVAIL AS A
  JOIN  CAR_RENTAL_COMPANY_CAR AS C
    ON  A.CAR_ID = C.CAR_ID
  JOIN  CAR_DISC AS D
    ON  C.CAR_TYPE = D.CAR_TYPE
 WHERE  C.CAR_TYPE IN ('SUV','세단') 
        AND (C.DAILY_FEE * (1 - D.DISCOUNT_RATE*0.01) * 30) > 500000
        AND (C.DAILY_FEE * (1 - D.DISCOUNT_RATE*0.01) * 30) < 2000000
 ORDER BY  FEE DESC, CAR_TYPE, CAR_ID DESC