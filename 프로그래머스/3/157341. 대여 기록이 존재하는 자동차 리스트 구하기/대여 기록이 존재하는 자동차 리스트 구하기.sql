-- 코드를 입력하세요
SELECT DISTINCT CH.CAR_ID
FROM CAR_RENTAL_COMPANY_CAR CC
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY CH
ON CC.CAR_ID = CH.CAR_ID
WHERE CC.CAR_TYPE = '세단' AND MONTH(CH.START_DATE) = 10
GROUP BY CH.CAR_ID
ORDER BY CH.CAR_ID DESC