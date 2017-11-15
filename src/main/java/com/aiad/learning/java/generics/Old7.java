package com.aiad.learning.java.generics;

/**
 * <p>ジェネリックメソッドの練習用</p>
 * <p>このコードが持つ問題
 * <ul>
 * <li>generateLongSomeDto2及びgenerateStringSomeDtoは実装が同じ内容を名称が異なる
 * 別メソッドとして実装しているのでメンテナンス性が低い。</li>
 * <li>どちらのメソッドもSomeDtoを戻すが、SomeDtoのフィールドがObject型及びListの原型を
 * 使用しているため型安全性が低い。</li>
 * </ul></p>
 * @author aki
 *
 */
public class Old7 {
    public static void main(String[] args) {
        Long[] longs = new Long[] { 1L, 2L };
        SomeDto someDto = SomeUtil.generateLongSomeDto2(longs);

        String[] strs = new String[] { "val1", "val2" };
        SomeDto someDto2 = SomeUtil.generateStringSomeDto(strs);

    }
}
