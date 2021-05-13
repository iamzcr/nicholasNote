package utils

func Cal(num1 float64, num2 float64, opt byte) float64 {
	var res float64
	switch opt {
	case '+':
		res = num1 + num2
	case '-':
		res = num1 - num2
	case '*':
		res = num1 * num2
	case '/':
		res = num1 / num2
	}
	return res
}
