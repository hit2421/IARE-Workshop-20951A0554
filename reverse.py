import timeit
a=input()
b=timeit.default_timer()
print("start",b)
s="".join(reversed(a))
print(s)
d=timeit.default_timeran()
print("end",d)
print(d-b)