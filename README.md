# playground
This is an exercise in traversing the matrix in a spiral way starting from the left most element (0,0) element. 
The idea is to traverse the boundary rows and columns and then recursively traverse the rest of the matrix contained with in. 
While traversing simple care can be taken to ensure the same element is not traversed more than once by carefully checking the boundaries of the loops
And the recursion terminates when there isn't any inner matrix left.

In a simple case when the matrix is not huge, choice of a double indexed array is suitable and sufficient. However it may be a good thing to wrap the underlaying data structure into some extensible type.
In that way, the core data structure can be flexibly replaced in subtypes.
getValue method in a simple case would read directly from the matrix and in a complex case, can be the data provider.
Other details on how to lay out such data structure (say with a million by million matrix) are beyond the scope of this exercise and please feel free to mail me saikrishna.gollapudi@gmail.com to discuss the same.

In this exercise, I tried to cover a few important test cases, there can be few other run-of-the-mill test cases that can be added.


