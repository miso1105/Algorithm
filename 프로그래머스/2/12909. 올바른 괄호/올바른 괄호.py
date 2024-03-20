def solution(s):
    cnt1=0
    cnt2=0
    if s[0]==")":
        return False
    for x in s:
        if x=="(":
            cnt1+=1
        else: 
            cnt2+=1
            if cnt2 > cnt1:
                return False
    if cnt1 ==  cnt2:
        return True
    else:
        return False