class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        result = []
        hm = defaultdict(list)
        for index, x in enumerate(groupSizes):
            if x in hm and len(hm[x]) == x:
                result.append(hm[x])
                hm[x] = []
            hm[x].append(index)
            
        for item in hm.values():
            if item:
                result.append(item)
                
        return result
        