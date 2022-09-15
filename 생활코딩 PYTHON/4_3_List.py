# 문자열 데이터 타입으로 이루어져 있는 리스트
students = ["최승은", "최승혁", "박진형"]
# 숫자 데이터 타입으로 이루어져 있는 리스트
grades = [3, 5, 999, 1]

print("students[1]", "=", students[1])
print("len(students)", "=", len(students))
print("min(grader)", "=", min(grades))
print("max(grader)", "=", max(grades))
print("sum(grader)", "=", sum(grades))

# 통계
import statistics
print("statistics.mean(grades)", "=", statistics.mean(grades))

import random # 0 ~ 1
print("random.choice(students)", "=", random.choice(students))