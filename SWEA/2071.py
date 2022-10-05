T = int(input())

for i in range(1, T+1):
    nums = map(int, input().split())
    count = 0
    total = 0
    avg = 0
    for num in nums:
        count += 1
        total += num
        avg = total/count
    print("# {} {}".format(i, round(avg)))