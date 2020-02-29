class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s)<=1:   return len(s)
        count=0
        start=s[0]
        se={}
        for i in enumerate(list(s)):
            if i[1] in se:
                temp=i[0]-se[start]
                temp1=i[0]
                start=s[se[start]] if(se[start]>se[i[1]]) else s[se[i[1]]+1] 
                if temp>count:
                    count=temp
                se[i[1]]=temp1
            else:   
                se[i[1]]=i[0]
        temp=len(s)-se[start]
        if temp>count:  return temp
        return count

def stringToString(input):
    import json

    return json.loads(input)

def main():
    import sys
    import io
    def readlines():
        for line in io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8'):
            yield line.strip('\n')

    lines = readlines()
    while True:
        try:
            line = next(lines)
            s = stringToString(line);
            
            ret = Solution().lengthOfLongestSubstring(s)

            out = str(ret);
            print(out)
        except StopIteration:
            break

if __name__ == '__main__':
    main()
