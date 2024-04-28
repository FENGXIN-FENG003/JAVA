package com.fengxin.basic.wrapper;

/**
 * @author FENGXIN
 * @data 2024.4.28
 **/

/*
    private static final class IntegerCache {
        static final int low = -128;
        static final int high;

        @Stable
        static final Integer[] cache;
        static Integer[] archivedCache;

        static {
            // high value may be configured by property
            int h = 127;
            
*/
/*首先，检查传入的int值i是否在IntegerCache.low（-128）和IntegerCache.high（127）之间。
如果在范围内，直接从IntegerCache.cache数组中取出对应位置的Integer对象，
并将其加-IntegerCache.low偏移量，以匹配原始的int值。
如果传入的int值i不在范围内，说明是一个新的值，需要创建一个新的Integer对象。
        @IntrinsicCandidate
    public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
*/
public class Intergertest {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        Integer i3 = 10;
        Integer i4 = 10;
        Integer i5 = -127;
        Integer i6 = -127;
        Integer i7 = 128;
        Integer i8 = 128;
        int i9 = 10;
        System.out.println(i1 == i2); // false new关键字的两个对象地址不同，==比较的是地址
        System.out.println(i3 == i4); // true 自动装箱，编译器自动调用valueOf方法，缓存[-128,127]，范围内直接比较值，否则new对象为false
        System.out.println(i5 == i6); // true 自动装箱，编译器自动调用valueOf方法，缓存[-128,127],范围内直接比较值，否则new对象为false
        System.out.println(i7 == i8); // true 自动装箱，编译器自动调用valueOf方法，缓存[-128,127],范围内直接比较值，否则new对象为false
        System.out.println(i1 == i9); // true 自动拆箱，比较值(含基本类型的则自动拆箱比较值)
}
