# Chef And Operators
# Problem code: CHOPRT
# https://www.codechef.com/problems/CHOPRT

t=int(raw_input())
for i in range(t):
	a,b=map(int,raw_input().split())
	if a<b:
		print("<")
	elif a>b:
		print(">")
	else:
		print("=")

