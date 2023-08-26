class Solution:
    def __init__(self, string):
        self.string = string
    def solution(self):
        string = self.string
        lenString = len(string)
        left_bound = 0
        right_bound = 2 ** lenString
        initialList = []
        #initialList.append((left_bound + right_bound) / 2)
        for i in range(0, lenString):
            if (string[i] == 'L'):
                initialList.append((left_bound + right_bound) / 2)
                right_bound = (left_bound + right_bound) / 2
            elif (string[i] == 'R'):
                initialList.append((left_bound + right_bound) / 2)
                left_bound = (left_bound + right_bound) / 2
        sorted_indices = sorted(enumerate(initialList), key=lambda x: x[1])
        indices = [index + 1 for index, value in sorted_indices]
        return indices, initialList, sorted_indices
    
a = Solution('LLLRRLLR')
print(a.solution()[0])