def isPerm(str1, str2):
	l1 = []
	l2 = []
	for x in str1:
		l1.append(x)
	for y in str2:
		l1.append(y)

	l1=l1.sort()
	l2=l2.sort()

	if(l1==l2):
		return True
	else:
		return False

print(isPerm("atom", "oamt"))