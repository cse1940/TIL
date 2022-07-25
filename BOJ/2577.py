a = int(input())
b = int(input())
c = int(input())

ds = a * b * c
counter = {
    "1": 0,
    "2": 0,
    "3": 0,
    "4": 0,
    "5": 0,
    "6": 0,
    "7": 0,
    "8": 0,
    "9": 0
}
for d in range(ds):
    counter[d] += 1
for key in counter:
    print(f"{counter[key]}\t")
