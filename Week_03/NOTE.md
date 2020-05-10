学习笔记
### 递归
> 树的节点定义和重复性适合递归（自相似性）

递归的现实理解：从前有座山、山上有个庙...
#### 特点
向下进入到不同梦境中，向上又回到原来一层
每一层环境和数据都是一份拷贝，特殊变量可以传递

#### 思维要点
1、不要人肉进行递归
2、找到最近最简方法，将其拆解成可重复子问题（最近重复子问题）
3、数学归纳法

#### 递归代码模版
```
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 

}
```


### 分治
对一个问题，化解成多个子问题（基本上都是）
大问题有子问题组成
看起来比较复杂，相对复杂，就需要找重复性，分成若干子问题（最近重复性、最优重复性）
最后需要组合merge（特别情况下）

当前层只需要考虑当前层的问题，不要下探其他层级

#### 分治代码模板
```
def divide_conquer(problem, param1, param2, ...): 
  # recursion terminator 
  if problem is None: 
    print_result 
    return 

  # prepare data 
  data = prepare_data(problem) 
  subproblems = split_problem(problem, data) 

  # conquer subproblems 
  subresult1 = self.divide_conquer(subproblems[0], p1, ...) 
  subresult2 = self.divide_conquer(subproblems[1], p1, ...) 
  subresult3 = self.divide_conquer(subproblems[2], p1, ...) 
  …

  # process and generate the final result 
  result = process_result(subresult1, subresult2, subresult3, …)
    
  # revert the current level states
```

### 回溯
一种递归情况，不断的每层去试，发现错误后，退出到前面几层（归去来兮）

