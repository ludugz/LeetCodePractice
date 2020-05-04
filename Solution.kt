
/**
 *Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *Because nums[0] + nums[1] = 2 + 7 = 9,
 *return [0, 1].
 */

internal class Solution {
    var map: MutableMap<Int, Int> = HashMap()
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { index, item ->
            if (isExist(item)) {
                return intArrayOf(index, map[item]!!)
            } else {
                map[target - index] = index
            }
        }
        return intArrayOf(0, 0)
    }

    private fun isExist(num: Int): Boolean {
        return map.containsKey(num)
    }
}
