import pandas
house = pandas.read_csv('house.csv')
print(house)
print(house.head(2)) # 앞쪽에 있는 2개의 데이터만 출력
print(house.describe()) # 표에 대한 정보를 묘사