# Write your MySQL query statement below
Select id
From(Select 
        id,
        recordDate,
        temperature,
        LAG(temperature) OVER (Order by recordDate) AS previous_temp,
        LAG(recordDate) OVER (Order by recordDate) AS previous_date
    From Weather
    ) AS previous

where temperature > previous_temp 
    AND DATEDIFF(recordDate, previous_date) = 1;
