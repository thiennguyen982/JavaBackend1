from datetime import datetime as dt

class sortingSelection:
    def __init__(self, array):
        self.array = array
    def findMin(self, arr):
        length = len(arr)
        min = arr[0]
        for i in range(1, length):
            if (min > arr[i]):
                min = arr[i]
        return min
    def delete_number(self, arr, target):
        new_arr = [x for x in arr if x != target]
        return new_arr
    def sort(self):
        res = []
        array = self.array
        length = len(array)
        while (length > 0):
            min = self.findMin(array)
            res.append(min)
            array = self.delete_number(array, min)
            length = len(array)
        return res

class sortingQuick:
    def __init__(self, array):
        self.array = array
    def quicksort(self, arr):
        if len(arr) <= 1:
            return arr
        pivot = arr[len(arr) // 2]
        left = [x for x in arr if x < pivot]
        middle = [x for x in arr if x == pivot]
        right = [x for x in arr if x > pivot]
        return self.quicksort(left) + middle + self.quicksort(right)
    def sort(self):
        return self.quicksort(self.array)
    
for i in range(1000000, 10000000, 1000000):
    print("Array: ", i)
    array = [j for j in range(1, i)]
    # start = dt.now()
    # sorted = sortingSelection(array).sort()
    # print("Insertion Sorting Algorithm Completion After: ", (dt.now() - start).seconds)
    start = dt.now()
    sorted = sortingQuick(array).sort()
    print("Quick Sorting Algorithm Completion After: ", (dt.now() - start).seconds)




