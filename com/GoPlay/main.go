package main

import (
	"GoPlay/mypackage"
	"fmt"
)

func main() {
    arr := [][][]int{
        {
            {1, 2, 3, 3},
            {3, 4, 5, 5},
        },
        {
            {1, 2, 3, 4},
            {3, 4, 5, 5},
        },
    }

    sum := 0
    count := 0

    for i := 0; i < len(arr); i++ {
        for j := 0; j < len(arr[i]); j++ {
            for k := 0; k < len(arr[i][j]); k++ {
                sum += arr[i][j][k]
                count++
                fmt.Print(arr[i][j][k], " ")
            }
            fmt.Println()
        }
        fmt.Println("--------------------------------")
    }

    str := "ni shi say hello world ni hao hello"
    indexes := mypackage.FindHelloIndexes(str)
    for _, idx := range indexes {
        fmt.Println("Index of 'hello':", idx)
    }

    fmt.Println("sum:", sum)
    fmt.Println("count:", count)
}
