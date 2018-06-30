import re

#print('Hello World ')
# sum = 0
# fh = open('regex_sum_109927.txt','r')
# for line in fh:
#     lst = re.findall('[0-9]+', line )
#     for num in lst:
#         sum+= int(num)
# print(sum)

print(sum([int(numb) for numb in re.findall('[0-9]+', open('regex_sum_109927.txt','r').read()) ]))
