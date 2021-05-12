package main

import "fmt"

func main() {
	classNum, stuNum := 2, 5
	var passCount int = 0
	var totalSum float64 = 0
	var j = 1
	for ; j <= classNum; j++ {
		var i = 1
		sum := 0.0
		for ; i <= stuNum; i++ {
			var grade float64
			fmt.Printf("输入%d班第%d个学生的分数：\n", j, i)
			_, err := fmt.Scanf("%f", &grade)
			if err != nil {
				fmt.Println(err)
				return
			}
			if grade >= 60 {
				passCount++
			}
			sum += grade
		}
		totalSum += sum
		fmt.Printf("%d班平均分是：%v;合格人数：%v\n", j, sum/float64(stuNum), passCount)
	}
	fmt.Printf("%d个班总分是%v；平均分是：%v\n", classNum, totalSum, totalSum/float64(stuNum*classNum))
}
