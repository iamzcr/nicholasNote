import random
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

if __name__ == '__main__':
    result = create_Num()
    print(result)