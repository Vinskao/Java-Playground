package mypackage

import "strings"

func FindHelloIndexes(str string) []int {
    var indexes []int
    idx := -1
    for {
        idx = strings.Index(str[idx+1:], "hello")
        if idx == -1 {
            break
        }
        indexes = append(indexes, idx)
    }
    return indexes
}
