#!/bin/python

import sys


a,b,c,d,e = raw_input().strip().split(' ')
a,b,c,d,e = [int(a),int(b),int(c),int(d),int(e)]

arr=[a,b,c,d,e]
s1=sum(arr)-max(arr)
s2=sum(arr)-min(arr)
print s1 , s2
