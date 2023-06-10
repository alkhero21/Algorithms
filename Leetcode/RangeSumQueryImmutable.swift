class NumArray {

    private let sums: [Int]
    init(_ nums: [Int]) {
        var sums: [Int] = []
        var current_sum = 0

        for num in nums{
            current_sum += num
            sums += [current_sum]
        }
        self.sums = sums
        print(sums)
    }

    // [-2, 0, 3, -5, 2, -1]
    // [-2, -2, 1, -4, -2, -3]
    
    func sumRange(_ left: Int, _ right: Int) -> Int {
        if left == 0{
            return sums[right]
        }
        return sums[right] - sums[left-1]
    }
}
