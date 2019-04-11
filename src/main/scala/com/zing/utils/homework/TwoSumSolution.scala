/**
  * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
  *
  * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
  *
  * 示例:
  *
  * 给定 nums = [2, 7, 11, 15], target = 9
  *
  * 因为 nums[0] + nums[1] = 2 + 7 = 9
  * 所以返回 [0, 1]
  */
object TwoSumSolution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val index: Int = nums.size
    for (i: Int <- 0 until index - 1) {
      for (j: Int <- i + 1 until index) {
        if (target == nums(i) + nums(j)) {
          return Array(i, j)
        }
      }
    }
    null
  }

  def main(args: Array[String]): Unit = {
    val data = twoSum(Array(1, 2, 3, 4), 1)
    if (data != null)
      print(s"index is ${data(0)},${data(1)}")

  }
}