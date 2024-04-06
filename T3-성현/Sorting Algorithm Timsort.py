a=[2,5,1,9,7]
b="zbdaf"
c=['ccc','aaaa','d','bb']]
d=['cde','cfc','abc']
sorted(a,b)
"".join(sorted(b))

sorted(c, key=len)

sorted(c, key=x;x[1])



def fn(s):
    return s[0],s[-1]

print(sorted(d,key=fn))
sorted(d,key=lambda s:(s[0],s[-1]))

#Example problemLeetcode 49 Group Anagrams
def groupAnagrams(self,strs:List[str])->List[List[str]]:
    anagrams=collections.defaultdict(list)

    for word in strs:
        anagrams[''.join(sorted(word))].append(word)
    return list(anagrams.values())




#History John von Neumann Merge Sort     O(n log n)
#quick sort, Mergesort, Timsort


#sorted by Timsort timsort.c python.c

"""
Chapter 51
Optimistic Sorting and Information Theoretic Complexity
Peter McIlroy


Timsort


Joshua Bloch
Java Array, sort()

"""
