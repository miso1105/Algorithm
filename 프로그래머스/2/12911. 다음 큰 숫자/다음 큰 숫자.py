def solution(n):
    one=0
    a=bin(n)[2:]
    one+=a.count("1")
    b=n
    while True:
        b+=1
        b_bin=bin(b)[2:]
        if b_bin.count("1")==one and n<b:
            answer = b
            break
    return answer