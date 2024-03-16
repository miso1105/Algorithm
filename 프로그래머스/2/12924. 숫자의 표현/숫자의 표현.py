def solution(n):
    a = list(range(1,n+1))
    cnt=0
    add_n=0
    while a:
        for x in a:
            add_n+=x
            if add_n==n:
                cnt+=1
                add_n=0
                a.pop(0)
                break
            if add_n>n: 
                a.pop(0)
                add_n=0
                break

    return cnt