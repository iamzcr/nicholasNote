
#-*- coding: utf-8 -*-
#encoding=utf-8
import random
import redis
def create_Num():
    number = 200
    result = []
    sum = 0
    while True:
        num_list = ['a','b','c','d','e','f','g','h','i','j','k','m','n','y','z','x','o',]
        res = random.sample(num_list, 4)
        i = ''.join(res)
        if not i in result:
            result.append(i)
            sum += 1
        if sum == number:
            break
    return result
def save_data(result):
    r =  redis.StrictRedis(host='localhost', port=6379)
    row = 0
    for x in result:
    	r.set(row,x)
    	row += 1
    	print r.get(row)
        
if __name__ == '__main__':
    result = create_Num()
    if result:
    	save_data(result)


