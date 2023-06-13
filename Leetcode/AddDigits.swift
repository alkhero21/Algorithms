class Solution {
    func addDigits(_ num: Int) -> Int {
        var count = 0
        var num = num
        while num > 0 {
            count += num % 10
            if count > 10 {
                count = count / 10 + count % 10
            }
            num /= 10
        }

        if count >= 10 {
            count = count / 10 + count % 10
        }

        return count
    }
}
