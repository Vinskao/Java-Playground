1.	封裝、繼承、多型與修飾子的練習-Employee
有一公司每個員工皆有姓名、性別、到職日、電話和email等基本資料。公司有永久、臨時兩種員工；永久員工又分一般職員、主管和銷售員三種，
永久員工皆有本薪和午餐津貼（固定為2400元）；主管則另外有績效獎金和交通津貼（固定為3000元）；銷售員則另外有銷售獎金；臨時員工則為時薪。
在main()中產生四個實例分別為主管、一般職員、銷售員和臨時員工(資料直接透過建構子hard code在程式中)，並列印其基本資料及當月薪資。
註：一般職員的薪資為本薪加午餐津貼，主管的薪資為本薪加午餐津貼加效獎金和交通津貼，銷售員的薪資為本薪加午餐津貼加銷售獎金，
臨時員工的薪資為時薪乘以當月工作時數。

2.	介面的練習-Shape
有一interface名為Shape，內有兩個成員方法：一為計算面積computeArea()，另為計算周長computeCircumference()。
寫兩個類別分別為Circle和Rectangle，用以實作上述介面，並驗証結果。

3.	例外處理的練習-Stack
產生一個class名為Stack，有兩個成員變數分別為一int陣列(用以存放資料)和top(int) (用以標示目前最上層資料的註標值)；
有兩個成員方法push()和pop()，分別用來放資料和取資料。
產生兩個exception class名為StackEmptyException和StackFullException，分別用來處理Stack空的和滿的狀況。
提示：Stack以先進後出(First In Last Out)的方式存取資料。

4.	檔案和集合的練習-EmployeeFile
改寫Employee作業，將hard code在程式裡的資料，改由檔案輸入。
提示：
a.	每一列資料代表一個員工所有的資料
b.	檔案裡的每一列資料沒有特定順序
c.	在檔案裡可增加一個職位別來表示不同的職位
d.	使用String類別的split()將字串切成tokens
e.	使用ArrayList取代陣列來存放資料

