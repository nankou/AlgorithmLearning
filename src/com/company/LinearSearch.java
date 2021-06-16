package com.company;

public class LinearSearch<E> {

    // 不希望用户创造LinearSearch的构造函数对象，所以声明成私有的。
    private LinearSearch(){}

    // 使用E定义泛型类，自定义传入数据类型。
    public static <E> int search(E[] data,E target){
        for (int i = 0;i<data.length;i++)
            if (data[i].equals(target))
                return i;

            return -1;
    }
    public static void main(String[] args){
        // 不是Int的数组，而是包装类Integer类型的数组，符合规范
        Integer[]  data = {24,18,12,9,16,66,32,4};
        int res = LinearSearch.search(data,16);
        System.out.println(res);  // 打印出4
        int res2 = LinearSearch.search(data,666);
        System.out.println(res2);

    }
}
