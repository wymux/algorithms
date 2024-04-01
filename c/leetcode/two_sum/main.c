#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int* twoSum(int* nums, int numsSize, int target, int* returnSize);

int main()
{
	int returnSize = 2;
	int arr[] = {2, 7, 11, 15};
	int *sum = twoSum(arr, 4, 9, &returnSize);
	printf("%d %d", sum[0], sum[1]);
	return 0;
}

int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
	*returnSize = 2;
	int *arr = calloc(*returnSize, sizeof(int));
	for (int i = 0; i < numsSize - 1; i++)
		for (int j = i + 1; j < numsSize; j++)
			if (nums[i] + nums[j] == target) {
				arr[0] = i;
				arr[1] = j;
				return arr;
			}
	free(arr);
	return NULL;
}
