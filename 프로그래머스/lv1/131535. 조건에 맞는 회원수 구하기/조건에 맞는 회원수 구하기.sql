-- 코드를 입력하세요
SELECT COUNT(*) as USERS
FROM USER_INFO
WHERE YEAR(JOINED) = 2021 and age >= 20 and age <= 29