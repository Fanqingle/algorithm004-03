#### 位运算
1.位运算符: 与 或 异或 取反  
2.为什么需要位运算？计算机里面数字表示方式和存储格式是二进制。  
####布隆过滤器
BloomFilter vs HashTable :  
1.HashTable 存储元素以及其他属性值。bloomFilter 只能查询元素是否存在  
2.bloomFilter 的内存占用和查询比hashmap快很多。  
3.hashMap可以允许删除且不会误判。bloomFilter 存在误判概率以及删除困难。  

bloomFilter:一个很长的二进制向量和一系列随机映射函数。布隆过滤器可以用来检查一个元素是否在一个集合中。  
优点：空间效率和查询效率远远超过一版的算法。  
缺点：有一定的误识别率和删除困难。如果blommFilter 认为数据不存在，那么一定不存在，如果blooFilter认为数据存在，可能这个数据并不存在。  
bloomFilter 一般用来快速判断数据是否不存在，这样不用查后面db。  
  
####LRU缓存
要求：加入元素和取出元素的时间复杂度都是O(1)    
1.使用LinkedHashMap实现  
2.使用Map和双向链表  

#### 排序
初级排序： 冒泡排序、插入排序、选择排序  
高级排序： 快排、归并排序、堆排序  (重要)  
特殊排序：桶排序、计数排序、基数排序  