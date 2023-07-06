# PairsInSumEqualToX

# Algorithm

Sort the input array in ascending order. This allows us to use a two-pointer approach.

Initialize two pointers, left and right, pointing to the start and end of the sorted array, respectively.

Enter a loop that continues while the left pointer is less than the right pointer.

Calculate the sum of the current pair using arr[left] + arr[right].

If the sum is equal to X, print the pair (arr[left] and arr[right]).

If the sum is less than X, increment the left pointer to consider a larger element.

If the sum is greater than X, decrement the right pointer to consider a smaller element.

Repeat steps 4-7 until the left and right pointers meet or cross each other.

If no pair is found, or if the input array has less than two elements, return or handle the appropriate response.
